package ModuleReferentiel;

import java.util.ArrayList;

public class Pokemon {

    // Exemple rapide de la classe Pokémon pour les phases de test
    private int id;
    private String name;

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " " + this.id;
    }

    public Pokemon(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static ArrayList<Pokemon> Pokemons() {

        ArrayList<Pokemon> pokemons = new ArrayList<>();

        pokemons.add(new Carapuce("Carapuce1", 10));
        pokemons.add(new Carapuce("Carapuce2", 15));
        pokemons.add(new Carapuce("Carapuce3", 23));

        // for (Pokemon pokemon : pokemons) {
        // System.out.println(pokemon.getName());
        // System.out.println(pokemon.getId());
        // }

        return pokemons;

    };

}