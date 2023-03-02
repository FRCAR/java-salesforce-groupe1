package ModuleEntrainement;

import java.util.List;
import java.util.stream.Collectors;

import java.util.ArrayList;
import ModuleReferentiel.Pokemon;

public class Test {

    public static void main(String[] args) {

        // Création d'une liste de pokemon
        List<Pokemon> pokeList = new ArrayList<>();
        pokeList.add(new Pokemon(0, "Salameche", "Feu", 10, 3, true));
        pokeList.add(new Pokemon(1, "Carapuce", "Eau", 8, 6, false));
        pokeList.add(new Pokemon(2, "Roucoul", "Air", 30, 12, false));
        pokeList.add(new Pokemon(3, "Racaillou", "Sol", 15, 0, true));


        // System.out.println("liste des pokemon : " + listOfPokemon);

        // // Affichage tous les pokemons
        // System.out.println("Affichage de toutes les pokemons");
        // pokeList.stream().forEach((e) -> {
        // System.out.println("voici la liste des pokemon : " + e);
        // });

        // // // Tri des pokemons par expérience décroissante
        System.out.println("\r\n Affichage de tous pokémon triées par experience décroissant");
        pokeList.stream().sorted((e1, e2) -> {
            return e1.getXp() - e2.getXp();
        }).forEach(e -> System.out.println("Le pokemon s'appelle : " + e.getName() + " avec : "
                + e.getXp() + " d'expériences"));
    }
}
