
public class Roucoul extends Pokemon {

    public Roucoul(String nomPokemon, int idPokemon) {
        super(nomPokemon, idPokemon);
        this.type = "Air";
        this.pointDeVieMax = 90;
        this.pointDeVie = this.pointDeVieMax;
        this.pointDExperience = 0;
        this.attaque = new Attaque("battement");
    }

}