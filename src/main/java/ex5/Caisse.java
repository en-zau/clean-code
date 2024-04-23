package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

    private String nom;
    private List<Item> items;
    private int poidsMax;

    /**
     * Constructeur
     *
     * @param nom
     */
    public Caisse(String nom, int poidsMax) {
        super();
        this.nom = nom;
        this.items = new ArrayList<>();
        this.poidsMax = poidsMax;
    }

    /**
     * Getter pour l'attribut nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour l'attribut nom
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter pour l'attribut items
     *
     * @return the items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * Setter pour l'attribut items
     *
     * @param items the items to set
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     * Ajoute un article à la caisse si possible.
     *
     * @param item l'article à ajouter
     * @return true si l'article a été ajouté avec succès, false sinon
     */
    public boolean addItem(Item item) {
        if (item.getPoids() <= poidsMax) {
            items.add(item);
            return true;
        }
        return false;
    }
}
