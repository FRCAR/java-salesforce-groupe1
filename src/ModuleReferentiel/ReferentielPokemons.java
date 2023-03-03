package ModuleReferentiel;

import java.util.ArrayList;

public class ReferentielPokemons {

    private Pokemon pokemonId;
    private static ArrayList<Pokemon> pokemons = new ArrayList<>();
    static {

        pokemons.add(new Carapuce("Carapuce1", 1));
        pokemons.add(new Carapuce("Carapuce2", 2));
        pokemons.add(new Salameche("Salameche1", 3));
        pokemons.add(new Racaillou("Racaillou1", 4));
        pokemons.add(new Racaillou("Racaillou2", 5));
        pokemons.add(new Roucoul("Roucoul1", 6));

    }

    public ArrayList<Pokemon> listPokemons() {

        return pokemons;

    }

    // Récupérer tous les Pokémons TODO
    public ArrayList<Pokemon> getAllPokemons() {

        // for (Pokemon pokemon : pokemons) {
        // System.out.println(pokemon.getName());
        // System.out.println(pokemon.getId());
        // }

        return listPokemons();

    };

    // Récupérer un Pokémon par son ID TODO
    public Pokemon getPokemonById(int id) {
        ArrayList<Pokemon> allPokemons = new ArrayList<>();

        allPokemons = getAllPokemons();

        for (Pokemon pokemon : allPokemons) {
            if (pokemon.getId() == id) {
                pokemonId = pokemon;
            }
        }
        return pokemonId;

    };

    // Récupérer un Pokémon par son nom TODO
    public Pokemon getPokemonByName(String name) {
        Pokemon pokemonName = null;

        ArrayList<Pokemon> allPokemons = new ArrayList<>();

        allPokemons = getAllPokemons();

        for (Pokemon pokemon : allPokemons) {
            if (name.equals(pokemon.getName())) {
                pokemonName = pokemon;
            }
        }

        return pokemonName;

    };

    // Modifier le nom d'un pokémon TODO
    public void updatePokemon(Pokemon p) {

        System.out.println(p.getName());
        p.setName("Dodo");
        System.out.println(p.getName());

    }

    public static void main(String[] args) {

        // System.out.println(getAllPokemons());

        // System.out.println(getPokemonById(10));

        // updatePokemon(getPokemonById(10));

        // for (Pokemon pokemon : listPokemons()) {
        // System.out.println(pokemon.getAttack().getNameAttack());
        // }

    }

}