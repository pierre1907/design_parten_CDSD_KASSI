package sn.ksi.gestion_emp.model;

import lombok.Getter;
import lombok.Setter;
import sn.ksi.gestion_emp.enums.Etat;

@Setter
@Getter
public class Employe {
    private int id;
    private String matricule;
    private Etat etat;


    public Employe(int id, String matricule) {
            this.id = id;
            this.matricule = matricule;
            this.etat = etat;
        }

}
