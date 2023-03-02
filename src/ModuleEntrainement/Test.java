package ModuleEntrainement;

import java.util.ArrayList;

import ModuleReferentiel.Pokemon;
import ModuleReferentiel.ReferentielPokemons;

public class Test {

    public static ArrayList<Pokemon> displayAllPokemons() {
        ReferentielPokemons refPoke = new ReferentielPokemons();
        return refPoke.getAllPokemons();
    }

    public static void main(String[] args) {
        System.out.println(displayAllPokemons());

    }
}
