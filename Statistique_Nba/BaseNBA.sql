CREATE DATABASE nba;
\c nba;

CREATE TABLE saison (
    id_saison SERIAL PRIMARY KEY,
    dateDebut DATE,
    dateFin DATE
);

CREATE TABLE equipe (
    id_equipe SERIAL PRIMARY KEY,
    nomEquipe VARCHAR(255) NOT NULL,
    UNIQUE(nomEquipe)
);

CREATE TABLE poste (
    id_poste SERIAL PRIMARY KEY,
    nomPoste VARCHAR(255) NOT NULL
);

CREATE TABLE joueur (
    id_joueur SERIAL PRIMARY KEY,
    nomJoueur VARCHAR(255) NOT NULL,
    prenomJoueur VARCHAR(255) NOT NULL,
    dateNaissance DATE,
    poids DOUBLE PRECISION,
    taille DOUBLE PRECISION,
    id_poste INTEGER NOT NULL,
    FOREIGN KEY(id_poste) REFERENCES poste(id_poste)
);

CREATE TABLE equipe_joueur (
   id_joueur INTEGER,
   id_equipe INTEGER,
   date_contrat DATE NOT NULL,
   duree INTEGER,
   FOREIGN KEY(id_joueur) REFERENCES joueur(id_joueur),
   FOREIGN KEY(id_equipe) REFERENCES equipe(id_equipe)
);

--- Vue liste joueur equipe
CREATE OR REPLACE View liste_joueur_equipe AS
SELECT eq.*,jou.*,ej.date_contrat,ej.duree FROM equipe_joueur AS ej
JOIN equipe AS eq ON ej.id_equipe = eq.id_equipe
JOIN joueur AS jou ON ej.id_joueur = jou.id_joueur;

CREATE TABLE quart_temps (
   id_quart_temps SERIAL PRIMARY KEY,
   nom VARCHAR(30)  NOT NULL,
   duree INTEGER,
   UNIQUE(nom)
);

CREATE TABLE match (
    id_match SERIAL PRIMARY KEY,
    id_saison INTEGER,
    date_match TIMESTAMP NOT NULL,
    id_equipe1 INTEGER NOT NULL,
    id_equipe2 INTEGER NOT NULL,
    FOREIGN KEY(id_equipe2) REFERENCES equipe(id_equipe),
    FOREIGN KEY(id_equipe1) REFERENCES equipe(id_equipe)
);

CREATE TABLE temps_joueur_match (
    id_joueur INTEGER NOT NULL,
    id_match INTEGER NOT NULL,
    id_quart_temps INTEGER NOT NULL,
    chrono_entre TIME NOT NULL,
    chrono_sortie TIME NOT NULL,
    FOREIGN KEY(id_joueur) REFERENCES joueur(id_joueur),
    FOREIGN KEY(id_match) REFERENCES match(id_match),
    FOREIGN KEY(id_quart_temps) REFERENCES quart_temps(id_quart_temps)  
);


CREATE TABLE tir_match (
    id_joueur INTEGER NOT NULL,
    id_match INTEGER NOT NULL,
    id_quart_temps INTEGER NOT NULL,
    valeur INTEGER NOT NULL,
    etat INTEGER NOT NULL, -- O=echec // 1=reussi
    chrono TIME NOT NULL,
    FOREIGN KEY(id_joueur) REFERENCES joueur(id_joueur),
    FOREIGN KEY(id_match) REFERENCES match(id_match),
    FOREIGN KEY(id_quart_temps) REFERENCES quart_temps(id_quart_temps)   
);

CREATE TABLE rebond_match (
    id_joueur INTEGER NOT NULL,
    id_match INTEGER NOT NULL,
    id_quart_temps INTEGER NOT NULL,
    type INTEGER, -- 0=defensive // 1=offensive
    chrono TIME NOT NULL,     
    FOREIGN KEY(id_joueur) REFERENCES joueur(id_joueur),
    FOREIGN KEY(id_match) REFERENCES match(id_match),
    FOREIGN KEY(id_quart_temps) REFERENCES quart_temps(id_quart_temps)   
);

CREATE TABLE passe_match (
    id_joueur INTEGER NOT NULL,
    id_match INTEGER NOT NULL,
    id_quart_temps INTEGER NOT NULL,
    type INTEGER, -- 0=passe simple // 1=passe decisive
    chrono TIME NOT NULL,     
    FOREIGN KEY(id_joueur) REFERENCES joueur(id_joueur),
    FOREIGN KEY(id_match) REFERENCES match(id_match),
    FOREIGN KEY(id_quart_temps) REFERENCES quart_temps(id_quart_temps)  
);

CREATE TABLE interception_match (
    id_joueur_intercepte INTEGER NOT NULL,
    id_joueur_recup_ball INTEGER NOT NULL,
    id_match INTEGER NOT NULL,
    id_quart_temps INTEGER NOT NULL,
    chrono TIME NOT NULL,     
    FOREIGN KEY(id_joueur_intercepte) REFERENCES joueur(id_joueur),
    FOREIGN KEY(id_joueur_recup_ball) REFERENCES joueur(id_joueur),
    FOREIGN KEY(id_match) REFERENCES match(id_match),
    FOREIGN KEY(id_quart_temps) REFERENCES quart_temps(id_quart_temps)  
);

CREATE TABLE contre_match (
    id_joueur_contrer INTEGER NOT NULL,
    id_joueur_recup_ball INTEGER NOT NULL,
    id_match INTEGER NOT NULL,
    id_quart_temps INTEGER NOT NULL,
    chrono TIME NOT NULL,     
    FOREIGN KEY(id_joueur_intercepte) REFERENCES joueur(id_joueur),
    FOREIGN KEY(id_joueur_recup_ball) REFERENCES joueur(id_joueur),
    FOREIGN KEY(id_match) REFERENCES match(id_match),
    FOREIGN KEY(id_quart_temps) REFERENCES quart_temps(id_quart_temps)  
);