package ex1;

import java.util.Date;

/**
 * Classe représentant une entreprise.
 */
public class Entreprise {

    /** Capital maximum de l'entreprise. */
    public static final int CAPITAL_MAX = 3000000;

    /** Numéro SIRET de l'entreprise. */
    public int siret;

    /** Nom de l'entreprise. */
    public String nom;

    /** Adresse de l'entreprise. */
    public String adresse;

    /** Date de création de l'entreprise. */
    public Date dateCreation;

    /**
     * Affiche le statut de l'entreprise.
     */
    public void afficherStatut() {
        System.out.println(nom, adresse)
    }
}
