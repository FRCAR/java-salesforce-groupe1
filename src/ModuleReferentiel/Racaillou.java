package ModuleReferentiel;

public class Racaillou extends Pokemon {
    public Racaillou(String nomPokemon, int idPokemon) {
        super(nomPokemon, idPokemon);
        this.type = TYPEPOKEMON.FEU;
        this.pointDeVieMax = 100;
        this.pointDeVie = this.pointDeVieMax;
        this.pointDExperience = 0;
        this.attack = new Attack("écrasement", TYPEPOKEMON.SOL, 18);
        this.isKO = false;
    }
}