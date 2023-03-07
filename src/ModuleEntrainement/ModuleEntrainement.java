package ModuleEntrainement;

import java.util.ArrayList;

import ModuleReferentiel.Pokemon;
import ModuleReferentiel.ReferentielPokemons;

public class ModuleEntrainement {

    public static Arene areneChoisie;
    public static int nbrTour = 1;
    public static String effectUnique;
    public static String effectPermanent;

    public void fightPokemon(Pokemon p1, Pokemon p2, Arene arene) {
        System.out.println(
                "\nCombat entre : " + p1.getName() + " et " + p2.getName() + " \nDans l'arène : " + arene.getName());
        System.out.println("\n" + p1.getName() + " -> " + p1.getPointDeVie() + "PV");
        System.out.println(p2.getName() + " -> " + p2.getPointDeVie() + "PV");

        while (!p1.getIsKO() && !p2.getIsKO()) {
            System.out.println("\nDébut tour -> " + nbrTour);
            double variable1 = Math.random();
            int variable2 = variable1 > 0.5 ? 1 : 0;

            if (arene.getSingleEffect()) {
                arene.setSingleEffect(false);
                System.out.println(
                        "\nVous êtes dans l'arene Volcan les deux pokemons perdent 20 points de vie au début de la partie\n");
                p1.setPointDeVie(p1.getPointDeVie() - 20);
                p2.setPointDeVie(p2.getPointDeVie() - 20);
                System.out.println(p1.getName() + " -> " + p1.getPointDeVie() + "PV");
                System.out.println(p2.getName() + " -> " + p2.getPointDeVie() + "PV");
            } else if (arene.getMultiEffect()) {
                System.out.println(
                        "\nVous êtes dans l'arene Mare Acide les deux pokemons perdent 5 points de vie au début du tour\n");
                p1.setPointDeVie(p1.getPointDeVie() - 5);
                p2.setPointDeVie(p2.getPointDeVie() - 5);
                System.out.println(p1.getName() + " -> " + p1.getPointDeVie() + "PV");
                System.out.println(p2.getName() + " -> " + p2.getPointDeVie() + "PV\n");
            }

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

}