
public class Salameche extends Pokemon {
    public Salameche(String nomPokemon, int idPokemon) {
        super(nomPokemon, idPokemon);
        this.type = "Feu";
        this.pointDeVieMax = 100;
        this.pointDeVie = this.pointDeVieMax;
        this.pointDExperience = 0;
        this.attaque = new Attaque("flameche");
    }
}