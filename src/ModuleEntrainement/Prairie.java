package ModuleEntrainement;

public class Prairie extends Arene { // extends : pour dire que ArenePrairie hérite de Arene
    
    // singleEffect = aucun
    // multiEffect = aucun

    /**
     * 
     * @param name
     */
    public Prairie(String name, String type, Boolean singleEffect, Boolean multiEffect){
        super(name, type, singleEffect, multiEffect);
    }

// 



    // @Override
    // public boolean selectPrairie(){
    //     System.out.println("Tous les points de vie des pokémon sont conservés");
    // }

    // @Override
    // public boolean singleEffect(){
    //     System.out.println("En entrant dans la Prairie, les pokémon ne perdent aucun point de vie");
    //     return false;
    // }

}
