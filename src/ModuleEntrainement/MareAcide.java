package ModuleEntrainement;

public class MareAcide extends Arene {

    // effet unique = aucun
    // effet permanent = perte de 5 pts de vie

    /**
     * 
     * @param name
     */
    public MareAcide(int id, String name, String type, Boolean singleEffect, Boolean multiEffect) {
        super(id, name, type, singleEffect, multiEffect);
    }
}
