package sn.ksi.gestion_emp.service;

import sn.ksi.gestion_emp.enums.Etat;
import sn.ksi.gestion_emp.model.Employe;

public class EtatService {

    public void saveEtat(Employe emp, Etat etat) {
        emp.setEtat(etat);
    }
}
