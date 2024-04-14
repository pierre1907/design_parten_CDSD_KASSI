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
        // Création d'une instance de GestionService
        GestionService gestionService = new GestionService();

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
                    Service service = new Service();
                    gestionService.saveService(service);
                    System.out.println("Service enregistré avec succès.");
                    break;
                case 2:
                    // Enregistrer un Employé
                    Employe employe = new Employe();
                    gestionService.saveEmploye(employe);
                    System.out.println("Employé enregistré avec succès.");
                    break;
                case 3:
                    // Virer Salaire
                    PaiementService paiementService = new VirementBService();
                    System.out.println("Salaire viré avec succès.");
                    break;
                case 4:
                    // Enregistrer un congé pour un Employé
                    Employe employeConge = new Employe();
                    EtatService congeService = new EtatService();
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
