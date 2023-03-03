package ModuleReferentiel;

public class Carapuce extends Pokemon {

    public Carapuce(String nomPokemon, int idPokemon) {
        super(nomPokemon, idPokemon);
        this.type = TYPEPOKEMON.EAU;
        this.especePokemon = "Carapuce";
        this.pointDeVieMax = 100;
        this.pointDeVie = this.pointDeVieMax;
        this.pointDExperience = 0;
        this.attack = new Attack("plouf", TYPEPOKEMON.EAU, 20);
        this.isKO = false;
    }

}