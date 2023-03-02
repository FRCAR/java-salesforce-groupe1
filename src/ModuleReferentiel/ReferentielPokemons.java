package ModuleReferentiel;

import java.util.ArrayList;

public class ReferentielPokemons {

    private Pokemon pokemonId;

    public ArrayList<Pokemon> listPokemons() {

        ArrayList<Pokemon> pokemons = new ArrayList<>();

        pokemons.add(new Carapuce("Carapuce1", 10, new Attack("Plouf", Type.EAU, 20)));
        pokemons.add(new Carapuce("Carapuce2", 15, new Attack("Plouf", Type.EAU, 30)));
        pokemons.add(new Carapuce("Carapuce3", 23, new Attack("Plouf", Type.EAU, 40)));

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