
public class Roucoul extends Pokemon{
    private String type = "Air";
    private int pointVieMax = 90;
    private Attaque attaqueDeRoucoul = new Attaque("battement");
    private int idPokemon;
    private String nomPokemon;


    public Roucoul(String nomPokemon, int idPokemon){
        this.idPokemon=idPokemon;
        this.nomPokemon=nomPokemon;
    }

    public int getIdPokemon() {
        return idPokemon;
    }

    public String getNomPokemon() {
        return nomPokemon;
    }

    public String getType() {
        return type;
    }

    public int getPointVieMax() {
        return pointVieMax;
    }

    public Attaque getAttaqueDeRoucoul() {
        return attaqueDeRoucoul;
    }
    
}