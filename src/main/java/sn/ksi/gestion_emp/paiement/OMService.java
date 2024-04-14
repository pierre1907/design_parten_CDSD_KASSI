package sn.ksi.gestion_emp.paiement;

import sn.ksi.gestion_emp.model.*;
import sn.ksi.gestion_emp.service.PaiementService;

public class OMService implements PaiementService {

    @Override
    public void virerSalaire(Employe emp){
        System.out.println(
                "Paiement du salaire par OM pour l'employé "
                        + emp.getMatricule()
        );
    }
}
