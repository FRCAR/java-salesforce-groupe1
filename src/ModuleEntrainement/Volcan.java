package ModuleEntrainement;

public class Volcan extends Arene { // extends = héritage

    // effet unique = perte de 20 pts de vie
    // effet permanent = aucun

    /**
     * 
     * @param name
     */
    public Volcan(String name, String type, Boolean singleEffect, Boolean multiEffect){
        super(name, type, singleEffect, multiEffect);
    }
    
}
