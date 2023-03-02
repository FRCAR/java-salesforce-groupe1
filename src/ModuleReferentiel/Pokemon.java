package ModuleReferentiel;

import java.util.ArrayList;

public class Pokemon {

    // Exemple rapide de la classe Pokémon pour les phases de test
    private int id;
    private String name;
    private int xp;
    private String type;
    private int hp;

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public String getType() {
        return type;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + " " +
                " NOM: " + this.name + " " +
                "NB PT DE VIE: " + this.hp + " " +
                "EXPERIENCE: "
                + this.xp
                + " " +
                "TYPE:" + this.type + "";
    }

    public Pokemon(int id, String name, int hp, int xp, String type) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.xp = xp;
        this.type = type;
    }

    public static ArrayList<Pokemon> Pokemons() {

        ArrayList<Pokemon> pokemons = new ArrayList<>();

        pokemons.add(new Carapuce(10, "Carapuce1", 100, 3, "eau"));
        pokemons.add(new Carapuce(15, "Carapuce2", 100, 0, "eau"));
        pokemons.add(new Carapuce(23, "Carapuce3", 100, 4, "eau"));

        // for (Pokemon pokemon : pokemons) {
        // System.out.println(pokemon.getName());
        // System.out.println(pokemon.getId());
        // System.out.println(pokemon.getType());
        // System.out.println(pokemon.getXp());
        // System.out.println(pokemon.getHp());

        // }

        return pokemons;
    }

}
