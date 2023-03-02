

public class Carapuce extends Pokemon{
    private String type = "Eau";
    private int pointVieMax = 100;
    private Attaque attaqueDeCarapuce = new Attaque("plouf");
    private int idPokemon;
    private String nomPokemon;

    

    public Carapuce(String nomPokemon, int idPokemon){
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

    public Attaque getAttaqueDeCarapuce() {
        return attaqueDeCarapuce;
    }

}
