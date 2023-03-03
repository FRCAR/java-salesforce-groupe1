package ModuleReferentiel;

import java.util.Scanner;

public class Start {

    public static void mainDisplay() {

        Scanner mainScanner = new Scanner(System.in);
        System.out.println(
                "Veuillez choisir une des fonctionnalités suivantes : \n1. Afficher dans la console une liste de tous les identifiants et noms d\'un pokémon \n2. Afficher dans la console une liste triée de tous les pokémons par expérience \n3. Afficher dans la console le détail d\'un pokémon (choisi par son id) \n4. Afficher dans le console une liste de toutes les arènes \n5. Faire combattre deux pokémon dans une arène");
        int choixMainScanner = mainScanner.nextInt();
        mainScanner.close();
        optionDisplay(choixMainScanner);
        // return choixMainScanner;

    }

    public static void optionDisplay(int choixMainScanner) {

        switch (choixMainScanner) {
            case 1 -> {
                displayPokemonList();
            }
            case 2 -> {
            }
            case 3 -> {
            }
            case 4 -> {
            }
            case 5 -> {
            }

        }

    }

    private static void displayPokemonList() {

        ReferentielPokemons listPoke = new ReferentielPokemons();
        listPoke.listPokemons();

        for (Pokemon pokemon : listPoke.listPokemons()) {
            System.out.println("\nID : " + pokemon.getId());
            System.out.println("Espece : " + pokemon.getEspecePokemon());
            System.out.println("Nom : " + pokemon.getName());
        }

    }

    public static void main(String[] args) {
        mainDisplay();

    }

}
