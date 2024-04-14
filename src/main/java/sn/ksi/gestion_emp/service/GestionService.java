package sn.ksi.gestion_emp.service;

import sn.ksi.gestion_emp.enums.Etat;
import sn.ksi.gestion_emp.model.Employe;
import sn.ksi.gestion_emp.model.Service;

import java.util.ArrayList;
import java.util.List;

public class GestionService {

    private List<Service> services = new ArrayList<>();
    private List<Employe> employes = new ArrayList<>();
    private final EtatService etatService;
    private final PaiementService paiementService;

    public GestionService(EtatService etatService, PaiementService paiementService) {
        this.etatService = etatService;
        this.paiementService = paiementService;
    }

    public void saveService(Service service){
        services.add(service);
    }

    public void saveEmploye(Employe emp){
        employes.add(emp);
    }

    public void virerSalaire(Employe emp, PaiementService paiementService){
        paiementService.virerSalaire(emp, salaire);
    }

    public void saveEtat(Employe emp, Etat etat) {
        etatService.saveEtat(emp, etat);
    }
}
