package sn.ksi.gestion_emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sn.ksi.gestion_emp.enums.*;
import sn.ksi.gestion_emp.model.*;
import sn.ksi.gestion_emp.paiement.*;
import sn.ksi.gestion_emp.service.*;

import java.util.Scanner;


@SpringBootApplication
public class GestionEmpApplication {
    public static void main(String[] args) {
        EtatService etatService = new EtatService();
        PaiementService paiementService = new VirementBService();

        // Création de GestionService en passant les instances requises
        GestionService gestionService = new GestionService(etatService, paiementService);


        // Création d'un scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Affichage du menu
            System.out.println("Menu:");
            System.out.println("1. Enregistrer un Service");
            System.out.println("2. Enregistrer un Employé");
            System.out.println("3. Virer Salaire");
            System.out.println("4. Enregistrer un congé pour un Employé");
            System.out.println("5. Quitter");

            // Lecture du choix de l'utilisateur
            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    // Enregistrer un Service
                    Service service = new Service(1, "IT", "Informatique");
                    gestionService.saveService(service);
                    System.out.println("Service enregistré avec succès.");
                    break;
                case 2:
                    // Enregistrer un Employé
                    Employe employe = new Employe(1, "MAT001");
                    gestionService.saveEmploye(employe);
                    System.out.println("Employé enregistré avec succès.");
                    break;
                case 3:
                    // Obtenir l'employé (remplacez les valeurs par celles correspondant à l'employé concerné)
                    Employe employe1 = new Employe(1, "MAT001");
                    double salaire = Double.parseDouble(employe1.getMatricule());

                    // Virer Salaire avec le montant du salaire
                    paiementService.virerSalaire(employe1, salaire);
                    System.out.println("Salaire viré avec succès.");
                    break;
                case 4:
                    // Enregistrer un congé pour un Employé
                    Employe employeConge = new Employe(1, "MAT001", Etat.CONGE);
                    etatService.saveEtat(employeConge, Etat.CONGE);
                    System.out.println("Congé enregistré avec succès.");
                    break;
                case 5:
                    System.out.println("Programme terminé.");
                    return;
                default:
                    System.out.println("Option invalide. Veuillez choisir à nouveau.");
                    break;
            }
        }
    }

    //public static void main(String[] args) {
	//	SpringApplication.run(GestionEmpApplication.class, args);
	//}

   // public static void main(String[] args) {

        // Création d'instances de EtatService et PaiementService
        //EtatService etatService = new EtatService();
        //PaiementService paiementService = new VirementBService();

        // Création du service de gestion des employés
        //GestionService gestionService = new GestionService(etatService, paiementService);

        // Création d'un journalier
        //Journalier journalier = new Journalier(1, "MAT001", 50.0, 20);

        // Enregistrer l'employé dans le service de gestion des employés
        //gestionService.saveEmploye(journalier);

        // Calcul du salaire du journalier
        //double salaireJournalier = journalier.calculerSalaire();
        //System.out.println("Salaire du journalier : " + salaireJournalier);

        // Création du service de gestion des congés
        //EtatService etatService = new EtatService();

        // Enregistrer un congé pour le journalier
        //etatService.saveEtat(journalier, Etat.CONGE);
    //}
}
