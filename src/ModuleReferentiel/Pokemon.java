

public class Pokemon {

    protected int pointDeVieMax;
    protected int pointDeVie;
    protected int pointDExperience;
    //private ArrayList<Pokemon> pokemonList = new ArrayList<>(); to be transfered to entrainement
    private Boolean isKO;
    //private Attaque unAttaque;
    protected TYPE type;
    protected int idPokemon;
    protected String nomPokemon;
    protected Attaque attaque;

    public Pokemon(String nomPokemon, int idPokemon){
        this.nomPokemon=nomPokemon;
        this.idPokemon=idPokemon;
    }


    public void attaqueAutrePokemon(Attaque unAttaque, Pokemon autrePokemon){
        autrePokemon.pointDeVie=autrePokemon.pointDeVie-unAttaque.degat;
    }


}
