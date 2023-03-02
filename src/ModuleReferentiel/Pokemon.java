
public class Pokemon {


    private int pointDeVie=100;
    private int pointDExperience=0;
    //private ArrayList<Pokemon> pokemonList = new ArrayList<>(); to be transfered to entrainement
    private Boolean isKO;
    private Attaque unAttaque;



    public int getPointDeVie() {
        return pointDeVie;
    }

    public void setPointDeVie(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    public int getPointDExperience() {
        return pointDExperience;
    }

    public void setPointDExperience(int pointDExperience) {
        this.pointDExperience = pointDExperience;
    }

    public void attaqueAutrePokemon(Attaque unAttaque, Pokemon autrePokemon){
        autrePokemon.pointDeVie=autrePokemon.pointDeVie-unAttaque.degat;

    }

    public Boolean getIsKO() {
        return isKO;
    }

    public void setIsKO(Boolean isKO) {
        this.isKO = isKO;
    }
}
