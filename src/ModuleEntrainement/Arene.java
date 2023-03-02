package ModuleEntrainement;

import java.util.ArrayList;

public class Arene {

    private static int id; // encapsulation de l'attribut (private)
    public String name; // final?
    public String type; // prairie , volcan , mare acide
    public Boolean singleEffect;
    public Boolean multiEffect;

    // CREATION DES CONSTRUCTEURS D'OBJETS

    /**
     * @param name
     * @param type
     * @param boolean
     * @param boolean
     */
    public Arene(String name, String type, Boolean singleEffect, Boolean multiEffect) {
        this.name = name;
        this.type = type;
        this.singleEffect = singleEffect;
        this.multiEffect = multiEffect;
    }

    // * ------------------ */
    // GETTEUR et SETTEUR - pas besoin des setteur car on ne va pas modifier
    // * ------------------ */

    public Arene(String type) {
        this.type = type;
    }

    public Arene() {
    }

    // ATTRIBUT - ID //
    public int getId() {
        return id;
    }

    // ATTRIBUT - NAME //
    public String getName() {
        return this.name;
    }

    // ATTRIBUT - TYPE //
    public String getType() {
        return this.type;
    }

    // ATTRIBUT - SINGLEEFFECT //
    public Boolean getSingleEffect() {
        return singleEffect;
    }

    // ATTRIBUT - MULTIEFFECT //
    public Boolean getMultiEffect() {
        return multiEffect;
    }

    // * ------------------ */
    // METHODES
    // * ------------------ */

    // création d'une méthode : pour créer des arènes
    public ArrayList<Arene> listeArene() {
        // ajout des arènes dans ArrayList
        ArrayList<Arene> arenes = new ArrayList<>();
        arenes.add(new Prairie("Prairie", "Prairie", false, false));
        arenes.add(new Volcan("Volcan", "Volcan", true, false));
        arenes.add(new MareAcide("Mare Acide", "Mare Acide", false, true));

        for (Arene arene : arenes) {
            System.out.println(arene.getName()); // affichage de toutes les arènes créée
        }
        return arenes;

    }

    public static void main(String[] args) {
        // listeArene();
    }

}
