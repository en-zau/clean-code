package ex2;

/**
 * Représente un compte bancaire.
 */
public class CompteBancaire {
    protected double solde;
    protected double decouvert;

    public CompteBancaire(double solde, double decouvert) {
        this.solde = solde;
        this.decouvert = decouvert;
    }

    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    public void debiterMontant(double montant) {
        if (this.solde - montant >= -this.decouvert) {
            this.solde -= montant;
        }
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

}
