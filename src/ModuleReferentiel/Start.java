package ModuleReferentiel;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import ModuleEntrainement.Arene;
import ModuleEntrainement.ModuleEntrainement;

public class Start {

    public static Scanner mainScanner = new Scanner(System.in);

    public static void mainDisplay() {

        System.out.println(
                "Veuillez choisir une des fonctionnalités suivantes : \n1. Afficher dans la console une liste de tous les identifiants et noms d\'un pokémon \n2. Afficher dans la console une liste triée de tous les pokémons par expérience \n3. Afficher dans la console le détail d\'un pokémon (choisi par son id) \n4. Afficher dans le console une liste de toutes les arènes \n5. Faire combattre deux pokémon dans une arène");
        int choixMainScanner = mainScanner.nextInt();
        optionDisplay(choixMainScanner);

    }

    public static void optionDisplay(int choixMainScanner) {

        switch (choixMainScanner) {
            case 1 -> {
                displayPokemonList();
                System.out.println("\n*--------------------------------------------------------------*\n");
                mainDisplay();
            }
            case 2 -> {
                displayPokemonListPerXp();
                System.out.println("\n*--------------------------------------------------------------*\n");
                mainDisplay();
            }
            case 3 -> {
                displayPokemonListPerId();
                System.out.println("\n*--------------------------------------------------------------*\n");
                mainDisplay();
            }
            case 4 -> {
                displayArene();
                System.out.println("\n*--------------------------------------------------------------*\n");
                mainDisplay();
            }
            case 5 -> {
                displayFight();
                System.out.println("\n*--------------------------------------------------------------*\n");
                mainDisplay();
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

    private static void displayPokemonListPerXp() {

        ReferentielPokemons listPoke = new ReferentielPokemons();
        listPoke.listPokemons();

        List<Pokemon> listPokemons = listPoke.listPokemons();

        Collections.sort(listPokemons, new Comparator<Pokemon>() {
            public int compare(Pokemon p1, Pokemon p2) {
                return Integer.compare(p1.getPointDExperience(), p2.getPointDExperience());
            }
        }.reversed());

        for (Pokemon pokemon : listPokemons) {
            System.out.println("\nEspece : " + pokemon.getEspecePokemon());
            System.out.println("Nom : " + pokemon.getName());
            System.out.println("XP : " + pokemon.getPointDExperience());
        }

    }

    public static void displayPokemonListPerId() {

        System.out.println("Veuillez choisir un ID");
        int id = mainScanner.nextInt();

        ReferentielPokemons listPoke = new ReferentielPokemons();
        Pokemon pokemonTarget = listPoke.getPokemonById(id);

        System.out.println("\nID : " + pokemonTarget.getId());
        System.out.println("Espece : " + pokemonTarget.getEspecePokemon());
        System.out.println("Nom : " + pokemonTarget.getName());
        System.out.println("Type : " + pokemonTarget.getType());
        System.out.println("XP : " + pokemonTarget.getPointDExperience());
        System.out.println("PV : " + pokemonTarget.getPointDeVieMax());
        System.out.println("Attaque : " + pokemonTarget.getAttack().getNameAttack());
    }

    public static void displayArene() {

        Arene arenes = new Arene();
        arenes.listeArene();

        for (Arene arene : arenes.listeArene()) {
            System.out.println("\nID : " + arene.getId());
            System.out.println("Nom : " + arene.getName());
            System.out.println("Type : " + arene.getType());
        }

    }

    public static Arene areneChoisie;

    public static void displayFight() {
        ReferentielPokemons leReferentiel = new ReferentielPokemons();
        leReferentiel.listPokemons();

        ModuleEntrainement moduleEntrainement = new ModuleEntrainement();

        Arene arenes = new Arene();
        arenes.listeArene();

        System.out.println("Veuillez choisir un pokémon par son nom");
        String pokemonName1 = mainScanner.next().trim();
        Pokemon poke1 = leReferentiel.getPokemonByName(pokemonName1);

        System.out.println("Veuillez choisir un autre pokémon par son nom");
        String pokemonName2 = mainScanner.next().trim();
        Pokemon poke2 = leReferentiel.getPokemonByName(pokemonName2);

        System.out.println("Veuillez choisir une arene par son ID");
        int areneId = mainScanner.nextInt();

        for (Arene arene : arenes.listeArene()) {
            if (arene.getId() == areneId) {
                areneChoisie = arene;
            }
        }

        moduleEntrainement.fightPokemon(poke1, poke2, areneChoisie);
    }

    public static void main(String[] args) {
        mainDisplay();
        mainScanner.close();
    }

}
