package ModuleReferentiel;

public class Roucoul extends Pokemon {
    public Roucoul(String nomPokemon, int idPokemon) {
        super(nomPokemon, idPokemon);
        this.type = TYPEPOKEMON.AIR;
        this.especePokemon = "Roucoul";
        this.pointDeVieMax = 90;
        this.pointDeVie = this.pointDeVieMax;
        this.pointDExperience = 1;
        this.attack = new Attack("battement", TYPEPOKEMON.AIR, 23);
        this.isKO = false;
    }
}