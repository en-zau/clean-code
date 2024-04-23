package ex2;

/**
 * Représente un livret A.
 */
public class LivretA extends CompteBancaire {
    private double tauxRemuneration;

    public LivretA(double solde, double tauxRemuneration) {
        super(solde, 0); // Initialisation du découvert à zéro, car un livret A ne peut pas être à découvert
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public void debiterMontant(double montant) {
        if (this.solde - montant >= 0) {
            this.solde -= montant;
        }
    }

    public void appliquerRemuAnnuelle() {
        this.solde += this.solde * (this.tauxRemuneration / 100);
    }
}
