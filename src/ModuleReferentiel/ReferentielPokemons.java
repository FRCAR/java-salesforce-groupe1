package ModuleReferentiel;

import java.util.ArrayList;

public class ReferentielPokemons {

    private static Pokemon pokemonId;

    // Récupérer tous les Pokémons TODO
    public static ArrayList<Pokemon> getAllPokemons() {

        return Pokemon.Pokemons();

    };

    // Récupérer un Pokémon par son ID TODO
    public static Pokemon getPokemonById(int id) {
        ArrayList<Pokemon> allPokemons = new ArrayList<>();

        allPokemons = getAllPokemons();

        for (Pokemon pokemon : allPokemons) {
            if (pokemon.getId() == id) {
                pokemonId = pokemon;
            }
        }
        return pokemonId;

    };

    // Modifier le nom d'un pokémon TODO
    public static void updatePokemon(Pokemon p) {

        System.out.println(p.getName());
        p.setName("Dodo");
        System.out.println(p.getName());

    }

    public static void main(String[] args) {

        // System.out.println(getAllPokemons());

        // System.out.println(getPokemonById(10));

        // updatePokemon(getPokemonById(10));

    }

}