package ModuleReferentiel;

import java.util.ArrayList;

public class ReferentielPokemons {

    private Pokemon pokemonId;

    public ArrayList<Pokemon> listPokemons() {

        ArrayList<Pokemon> pokemons = new ArrayList<>();

        pokemons.add(new Carapuce("Carapuce 1", 1));
        pokemons.add(new Carapuce("Carapuce 2", 2));
        pokemons.add(new Salameche("Salamèche 1", 3));
        pokemons.add(new Racaillou("Racaillou 1", 4));
        pokemons.add(new Racaillou("Racaillou 2", 5));
        pokemons.add(new Roucoul("Roucoul 1", 6));

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