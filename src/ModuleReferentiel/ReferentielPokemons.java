package ModuleReferentiel;

import java.util.ArrayList;

public class ReferentielPokemons {

    private Pokemon pokemonId;

    // Récupérer tous les Pokémons
    public ArrayList<Pokemon> getAllPokemons() {

        return Pokemon.Pokemons();

    };

    // Récupérer un Pokémon par son ID
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

    // Modifier le nom d'un pokémon
    public void updatePokemon(Pokemon p) {

        System.out.println(p.getName());
        p.setName("Dodo");
        System.out.println(p.getName());

    }

}