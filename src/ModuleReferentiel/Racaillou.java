;

public class Racaillou extends Pokemon{
    public String type = "Sol";
    public int pointVieMax = 110;
    public Attaque attaqueDeRacaillou = new Attaque("ecrasement");
    public int idPokemon;
    public String nomPokemon;


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