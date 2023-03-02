package ModuleReferentiel;

import java.util.ArrayList;

public class Pokemon {

    // Exemple rapide de la classe Pokémon pour les phases de test
    protected int idPokemon;
    protected String nomPokemon;
    public Attack attack;
    protected TYPEPOKEMON type;
    protected int pointDeVieMax;
    protected int pointDeVie;
    protected int pointDExperience;
    protected Boolean isKO;

    public String getName() {
        return this.nomPokemon;
    }

    public int getId() {
        return this.idPokemon;
    }

    public void setId(int idPokemon) {
        this.idPokemon = idPokemon;
    }

    public void setName(String nomPokemon) {
        this.nomPokemon = nomPokemon;
    }

    public void setPointDeVie(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    public Attack getAttack() {
        return attack;
    }

    public TYPEPOKEMON getType() {
        return type;
    }

    public int getPointDeVieMax() {
        return pointDeVieMax;
    }

    public int getPointDeVie() {
        return pointDeVie;
    }

    public int getPointDExperience() {
        return pointDExperience;
    }

    public Boolean getIsKO() {
        return isKO;
    }

    public void setIsKO(Boolean isKO) {
        this.isKO = isKO;
    }

    public Pokemon(String nomPokemon, int idPokemon) {
        this.nomPokemon = nomPokemon;
        this.idPokemon = idPokemon;
    }

    public void attaqueAutrePokemon(Pokemon pokemon1, Pokemon pokemon2) {
        pokemon2.setPointDeVie(pokemon2.getPointDeVie() - pokemon1.getAttack().getPower());
        System.out.println(
                "Le pokémon : " + pokemon2.getName() + " se fait attaquer par " + pokemon1.getAttack().getNameAttack()
                        + " et perd " + pokemon1.getAttack().getPower() + " points de vie \nIl lui reste "
                        + pokemon2.getPointDeVie()
                        + " points de vie");
        if (pokemon2.getPointDeVie() <= 0) {
            pokemon2.setIsKO(true);
            System.out.println("Le pokemon : " + pokemon2.getName() + " est KO \nFin du combat");
        } else {
            pokemon1.setPointDeVie(pokemon1.getPointDeVie() - pokemon2.getAttack().getPower());
            System.out.println(
                    "Le pokémon : " + pokemon1.getName() + " se fait attaquer par "
                            + pokemon2.getAttack().getNameAttack()
                            + " et perd " + pokemon2.getAttack().getPower() + " points de vie \nIl lui reste "
                            + pokemon2.getPointDeVie()
                            + " points de vie");
            if (pokemon1.getPointDeVie() <= 0) {
                pokemon1.setIsKO(true);
                System.out.println("Le pokemon : " + pokemon1.getName() + " est KO \nFin du combat");
            }
        }

    }

    // @Override
    // public String toString() {
    // return this.name + " " + this.id + " " + this.attack;
    // }

    // public Pokemon(String name, int id, Attack attack) {
    // this.nomPokemon = name;
    // this.idPokemon = id;
    // this.attack = attack;
    // }

}