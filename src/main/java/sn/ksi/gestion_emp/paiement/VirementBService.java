package sn.ksi.gestion_emp.paiement;

import sn.ksi.gestion_emp.service.*;
import sn.ksi.gestion_emp.model.*;

public class VirementBService implements PaiementService {

        @Override
        public void virerSalaire(Employe emp){
            System.out.println(
                    "Paiement du salaire par Virement Bancaire pour l'employé "
                            + emp.getMatricule()
            );
        }

}
