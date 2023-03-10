package ModuleEntrainement;

import java.util.ArrayList;

public class Arene {

    public int id; // encapsulation de l'attribut (private)
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
    public Arene(int id, String name, String type, Boolean singleEffect, Boolean multiEffect) {
        this.id = id;
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
        return this.id;
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

    public void setSingleEffect(Boolean singleEffect) {
        this.singleEffect = singleEffect;
    }

    // création d'une méthode : pour créer des arènes
    public ArrayList<Arene> listeArene() {
        // ajout des arènes dans ArrayList
        ArrayList<Arene> arenes = new ArrayList<>();
        arenes.add(new Prairie(1, "Prairie", "Prairie", false, false));
        arenes.add(new Volcan(2, "Volcan", "Volcan", true, false));
        arenes.add(new MareAcide(3, "Mare Acide", "Mare Acide", false, true));

        return arenes;

    }

    public static void main(String[] args) {
        // listeArene();
    }

}
