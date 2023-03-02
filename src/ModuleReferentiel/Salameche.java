
public class Salameche extends Pokemon{
    private String type = "Feu";
    private int pointVieMax = 100;
    private Attaque attaqueDeSalameche = new Attaque("flameche");
    private int idPokemon;
    private String nomPokemon;


    public Salameche(String nomPokemon, int idPokemon){
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

    public Attaque getAttaqueDeSalameche() {
        return attaqueDeSalameche;
    }
    
}