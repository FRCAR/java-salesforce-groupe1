package ModuleEntrainement;

import java.util.ArrayList;

import ModuleReferentiel.Pokemon;
import ModuleReferentiel.ReferentielPokemons;

public class ModuleEntrainement {

    public static Arene areneChoisie;

    public static void fightPokemon(Pokemon p1, Pokemon p2, Arene arene) {
    }

    public static void main(String[] args) {

        ReferentielPokemons leReferentiel = new ReferentielPokemons();
        leReferentiel.listPokemons();

        Arene arenes = new Arene();
        arenes.listeArene();

        for (Arene arene : arenes.listeArene()) {
            System.out.println(arene.getName());
            if (arene.getName() == "Prairie") {
                areneChoisie = arene;
            }
        }

        fightPokemon(leReferentiel.getPokemonById(10), leReferentiel.getPokemonById(10), areneChoisie);

    }

}