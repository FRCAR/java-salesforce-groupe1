
public class Racaillou extends Pokemon {

    public Racaillou(String nomPokemon, int idPokemon) {
        super(nomPokemon, idPokemon);
        this.type = "Sol";
        this.pointDeVieMax = 110;
        this.pointDeVie = this.pointDeVieMax;
        this.pointDExperience = 0;
        this.attaque = new Attaque("ecrasement");
    }
}