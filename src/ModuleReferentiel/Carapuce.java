
public class Carapuce extends Pokemon {

    public Carapuce(String nomPokemon, int idPokemon) {
        super(nomPokemon, idPokemon);
        this.type = "Eau";
        this.pointDeVieMax = 100;
        this.pointDeVie = this.pointDeVieMax;
        this.pointDExperience = 0;
        this.attaque = new Attaque("plouf");//
    }

}
