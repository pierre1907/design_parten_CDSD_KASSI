package sn.ksi.gestion_emp.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Journalier extends Employe {
    private double coutJournalier;
    private int nombreJoursTravail;
    private double salaire;

    public Journalier(int id, String matricule, double coutJournalier, int nombreJoursTravail) {
        super(id, matricule);
        this.coutJournalier = coutJournalier;
        this.nombreJoursTravail = nombreJoursTravail;
        this.salaire = coutJournalier * nombreJoursTravail;
    }

    public double calculerSalaire() {
        return coutJournalier * nombreJoursTravail;
    }
}
