package ModuleEntrainement;

public class Volcan extends Arene { // extends = héritage

    // effet unique = perte de 20 pts de vie
    // effet permanent = aucun

    /**
     * 
     * @param name
     */
    public Volcan(int id, String name, String type, Boolean singleEffect, Boolean multiEffect) {
        super(id, name, type, singleEffect, multiEffect);
    }

}
