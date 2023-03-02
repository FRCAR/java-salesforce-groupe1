package ModuleReferentiel;

public class Roucoul extends Pokemon {
    public Roucoul(String nomPokemon, int idPokemon) {
        super(nomPokemon, idPokemon);
        this.type = TYPEPOKEMON.FEU;
        this.pointDeVieMax = 90;
        this.pointDeVie = this.pointDeVieMax;
        this.pointDExperience = 0;
        this.attack = new Attack("battement", TYPEPOKEMON.AIR, 23);
        this.isKO = false;
    }
}