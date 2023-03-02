;
public class Racaillou extends Pokemon{
    private String type = "Sol";
    private int pointVieMax = 110;
    private Attaque attaqueDeRacaillou = new Attaque("ecrasement");
    private int idPokemon;
    private String nomPokemon;


    public Racaillou(String nomPokemon, int idPokemon){
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

    public Attaque getAttaqueDeRacaillou() {
        return attaqueDeRacaillou;
    }
}