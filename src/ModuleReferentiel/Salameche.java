package ModuleReferentiel;

public class Salameche extends Pokemon {
    public Salameche(String nomPokemon, int idPokemon) {
        super(nomPokemon, idPokemon);
        this.type = TYPEPOKEMON.FEU;
        this.especePokemon = "Salameche";
        this.pointDeVieMax = 100;
        this.pointDeVie = this.pointDeVieMax;
        this.pointDExperience = 0;
        this.attack = new Attack("flamèche", TYPEPOKEMON.FEU, 20);
        this.isKO = false;
    }
}