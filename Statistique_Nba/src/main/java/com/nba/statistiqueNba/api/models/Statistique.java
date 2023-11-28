package com.nba.statistiqueNba.api.models;

import com.nba.statistiqueNba.services.Service_Equipe;
import com.nba.statistiqueNba.services.Service_Joueur;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Statistique {
    public Joueur joueur;
    public Equipe equipe;
    public int match;
    public int mj;
    public double ppm;
    public double rpm;
    public double pdpm;
    public double mpm;
    public double eff;
    public double fg;
    public double troisP;
    public double lf;

    public static long calculateTimeDifferenceInMinutes(Time time1, Time time2) {
        long milliseconds1 = time1.getTime();
        long milliseconds2 = time2.getTime();

        long diffMilliseconds = milliseconds2 - milliseconds1;
        // Convertir la différence de millisecondes en minutes
        return diffMilliseconds / (60 * 1000);
    }

    public List<Statistique> getAllStat(Service_Joueur joueurService, Service_Equipe equipeService) {
        List<Statistique> ans = new ArrayList<>();

        List<Joueur> allJoueur = joueurService.getAllJoueur();
        for (int i = 0; i < allJoueur.size(); i++) {
            Statistique stat = new Statistique();
            List<Temp_Joueur> temps = joueurService.getListTempJoueur(allJoueur.get(i).getId_joueur());
            int idmatch = 0;
            int mj = 0;
            stat.mpm = 0;
            for (int j = 0; j < temps.size(); j++) {
                if(temps.get(j).getIdMatch() != idmatch) {
                    mj+=1;
                    idmatch = temps.get(j).getIdMatch();
                    stat.mpm+=calculateTimeDifferenceInMinutes(temps.get(j).getChronoEntre(),temps.get(j).getChronoSortie());
                }
            }
            stat.mpm/= mj;
            stat.joueur = allJoueur.get(i);
            stat.equipe = equipeService.getEquipeJoueurById(allJoueur.get(i).getId_joueur()).get();
            stat.match = mj;
            stat.mj = mj;

            List<Tir> listTir = joueurService.getListTirJoueur(allJoueur.get(i).getId_joueur());
            int nbrTir = listTir.size();
            int nbrTirMarquer = 0;

            int nbrTir3 = 0;
            int nbrTir3Marquer = 0;

            int nbrTirLf = 0;
            int nbrTirLfMarquer = 0;

            int point = 0;
            for (int j = 0; j < nbrTir; j++) {
                if(listTir.get(j).getEtat() == 1) {
                    point+=listTir.get(j).getValeur();
                    nbrTirMarquer+=1;
                    if (listTir.get(j).getValeur() == 1) {
                        nbrTirLfMarquer+=1;
                    }
                    if (listTir.get(j).getValeur() == 3) {
                        nbrTir3Marquer+=1;
                    }
                }
                if(listTir.get(j).getEtat() == 0) {
                    if (listTir.get(j).getValeur() == 1) {
                        nbrTirLf+=1;
                    }
                    if (listTir.get(j).getValeur() == 3) {
                        nbrTir3+=1;
                    }
                }
            }
            if (nbrTir3 != 0)
                stat.troisP = (nbrTir3Marquer*100)/nbrTir3;
            else stat.troisP=0;
            if (nbrTirLf != 0)
                stat.lf = (nbrTirLfMarquer*100)/nbrTirLf;
            else stat.lf = 0;
            if (nbrTir!=0)
                stat.fg = (nbrTirMarquer*100)/nbrTir;
            else stat.fg = 0;
            stat.ppm = (point/stat.mj);
            List<Rebond> listRebond = joueurService.getListRebondJoueur(allJoueur.get(i).getId_joueur());
            int nbrRebond = listRebond.size();
            stat.rpm = (nbrRebond/ stat.mj);
            List<Passe> listPasse = joueurService.getListPasseJoueur(allJoueur.get(i).getId_joueur());
            stat.pdpm = 0;
            for (int j = 0; j < listPasse.size(); j++) {
                if(listPasse.get(j).getType() == 1) {
                    stat.pdpm+=1;
                }
            }
            stat.pdpm /= stat.mj;

            ans.add(stat);
        }

        return ans;
    }
}
