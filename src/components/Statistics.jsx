import React from "react";

export default function Statistiques() {
    const tableStyle = {
        margin: "auto",
        marginTop: "50px",
        borderCollapse: "collapse"
    };

  return (
    <div>
      <h2>Classement NBA</h2>
      <table style={tableStyle}>
        <thead>
          <tr>
            <th>Classement</th>
            <th>Joueur</th>
            <th>Équipe</th>
            <th>M</th>
            <th>MJ</th>
            <th>PPM</th>
            <th>RPM</th>
            <th>PDPM</th>
            <th>MPM</th>
            <th>EFF</th>
            <th>FG%</th>
            <th>3P%</th>
            <th>%LF</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>1</td>
            <td>Joel Embiid</td>
            <td>PHI</td>
            <td>11</td>
            <td>11</td>
            <td>31.9</td>
            <td>11.5</td>
            <td>5.8</td>
            <td>34.1</td>
            <td>36.2</td>
            <td>34.1</td>
            <td>34.1</td>
            <td>87.1</td>
          </tr>
          <tr>
            <td>2</td>
            <td>Kyrie</td>
            <td>PHI</td>
            <td>11</td>
            <td>11</td>
            <td>31.9</td>
            <td>11.5</td>
            <td>5.8</td>
            <td>34.1</td>
            <td>36.2</td>
            <td>34.1</td>
            <td>34.1</td>
            <td>87.1</td>
          </tr>

          
        </tbody>
      </table>
    </div>
  );
}
