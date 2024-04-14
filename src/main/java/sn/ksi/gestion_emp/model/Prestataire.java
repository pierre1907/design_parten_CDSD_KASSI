package sn.ksi.gestion_emp.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Prestataire extends Employe {
    private String periodeService;
    private double coutService;

    public Prestataire(int id, String matricule, String periodeService, double coutService) {
        super(id, matricule);
        this.periodeService = periodeService;
        this.coutService = coutService;
    }
}
