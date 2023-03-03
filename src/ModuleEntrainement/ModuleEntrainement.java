package ModuleEntrainement;

import java.util.ArrayList;

import ModuleReferentiel.Pokemon;
import ModuleReferentiel.ReferentielPokemons;

public class ModuleEntrainement {

    public static Arene areneChoisie;
    public static int nbrTour = 1;
    public static int currentPvP1;
    public static int currentPvP2;

    public static void fightPokemon(Pokemon p1, Pokemon p2, Arene arene) {
        System.out.println(
                "\nCombat entre : " + p1.getName() + " et " + p2.getName() + " \nDans l'arène : " + arene.getName());

        while (!p1.getIsKO() && !p2.getIsKO()) {
            System.out.println("\nDébut tour -> " + nbrTour);
            double variable1 = Math.random();
            int variable2 = variable1 > 0.5 ? 1 : 0;

            switch (variable2) {
                case 0 -> {
                    ModuleCombat.attaqueAutrePokemon(p1, p2);
                }
                case 1 -> {
                    ModuleCombat.attaqueAutrePokemon(p2, p1);
                }
            }
            nbrTour++;

            System.out.println("\n*-----------------------------------------------------------------*");
        }

    }

    public static void main(String[] args) {

        ReferentielPokemons leReferentiel = new ReferentielPokemons();
        leReferentiel.listPokemons();

        // System.out.println(leReferentiel.listPokemons());

        Arene arenes = new Arene();
        arenes.listeArene();

        for (Arene arene : arenes.listeArene()) {
            // System.out.println(arene.getName());
            if (arene.getName() == "Prairie") {
                areneChoisie = arene;
            }
        }

        fightPokemon(leReferentiel.getPokemonById(5), leReferentiel.getPokemonById(6), areneChoisie);

    }

}