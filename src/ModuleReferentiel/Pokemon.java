package ModuleReferentiel;

import java.util.ArrayList;

public class Pokemon {

    // Exemple rapide de la classe Pokémon pour les phases de test
    private int id;
    private String name;
    public Attack attack;

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

    public Attack getAttack() {
        return attack;
    }

    @Override
    public String toString() {
        return this.name + " " + this.id + " " + this.attack;
    }

    public Pokemon(String name, int id, Attack attack) {
        this.name = name;
        this.id = id;
        this.attack = attack;
    }

}