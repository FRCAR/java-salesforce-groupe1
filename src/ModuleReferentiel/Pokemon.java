package ModuleReferentiel;

import java.util.ArrayList;

public class Pokemon {

    // Exemple rapide de la classe Pokémon pour les phases de test
    private int id;
    private String name;
    private String type;
    private int xp;
    private int hp;

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
        return this.name + " " + this.id + " " + this.type + " " + this.xp + " " + this.hp;
    }

    public Pokemon(String name, int id, String type, int xp, int hp) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.xp = xp;
        this.hp = hp;

    }

    public static ArrayList<Pokemon> Pokemons() {

        ArrayList<Pokemon> persons = new ArrayList<>();

        Pokemon john = new Carapuce("Carapuce1", 0, "Caparapuce", 2, 3);

        persons.add(new Carapuce("Salameche1", 1, "Salameche", 6, 8));
        persons.add(new Carapuce("Roucoul1", 2, "Roucoul", 7, 10));
        persons.add(new Carapuce("Racaillou", 3, "Roucoul", 17, 20));

        for (Pokemon person : persons) {
            System.out.println(person.getName());
            System.out.println(person.getId());
        }

        System.out.println(john);
        return persons;

        // return persons;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    };

}