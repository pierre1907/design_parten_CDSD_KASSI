package sn.ksi.gestion_emp.model;

import lombok.Getter;
import lombok.Setter;
import sn.ksi.gestion_emp.enums.Etat;

@Setter
@Getter
public class Contractuel extends Employe{
    private double salaireBrut;
    private double prime;
    private double retenue;
    private double salaireNet;
    private Service service;

    public Contractuel(int id, String matricule, Etat etat) {
        super(id, matricule);
    }

}
