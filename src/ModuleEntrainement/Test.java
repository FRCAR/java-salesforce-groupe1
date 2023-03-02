package ModuleEntrainement;

import java.util.ArrayList;
import java.util.Scanner;

import ModuleReferentiel.Pokemon;
import ModuleReferentiel.ReferentielPokemons;

public class Test {

    public static ArrayList<Pokemon> displayAllPokemons() {
        ReferentielPokemons refPoke = new ReferentielPokemons();
        return refPoke.getAllPokemons();
    }

    public static void main(String[] args) {
        System.out.println(displayAllPokemons());
        // Affiche "Ecrire un nombre: "
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ecrire un nombre de 1 à 4 ");
        // Lit l'entier écrit par l'utilisateur et l'affecte
        // à la variable nombre du programme
        int nombre = scanner.nextInt();
        // Affiche le nombre saisit par l'utilisateur
        System.out.println("vous avez choisi le nombre " + nombre);

    }
}
