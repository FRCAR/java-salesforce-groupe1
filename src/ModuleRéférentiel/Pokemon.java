package ModuleRéférentiel;

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

        ArrayList<Pokemon> persons = new ArrayList<>();

        Pokemon john = new Carapuce("Carapuce1", 10);

        persons.add(john);

        persons.add(new Carapuce("Carapuce2", 15));
        persons.add(new Carapuce("Carapuce3", 23));

        for (Pokemon person : persons) {
            System.out.println(person.getName());
            System.out.println(person.getId());
        }

        // System.out.println(persons);

        return persons;

    };

}