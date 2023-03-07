package ModuleReferentiel;

public class Pokemon {

    // Exemple rapide de la classe Pokémon pour les phases de test
    protected int idPokemon;
    protected String nomPokemon;
    protected String especePokemon;
    public Attack attack;
    protected TYPEPOKEMON type;
    protected int pointDeVieMax;
    protected double pointDeVie;
    protected int pointDExperience;
    protected Boolean isKO;

    public String getName() {
        return this.nomPokemon;
    }

    public String getEspecePokemon() {
        return especePokemon;
    }

    public int getId() {
        return this.idPokemon;
    }

    public void setId(int idPokemon) {
        this.idPokemon = idPokemon;
    }

    public void setName(String nomPokemon) {
        this.nomPokemon = nomPokemon;
    }

    public void setPointDeVie(double pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    public Attack getAttack() {
        return attack;
    }

    public TYPEPOKEMON getType() {
        return type;
    }

    public int getPointDeVieMax() {
        return pointDeVieMax;
    }

    public double getPointDeVie() {
        return pointDeVie;
    }

    public int getPointDExperience() {
        return pointDExperience;
    }

    public Boolean getIsKO() {
        return isKO;
    }

    public void setIsKO(Boolean isKO) {
        this.isKO = isKO;
    }

    public void setPointDExperience(int pointDExperience) {
        this.pointDExperience = pointDExperience;
    }

    public Pokemon(String nomPokemon, int idPokemon) {
        this.nomPokemon = nomPokemon;
        this.idPokemon = idPokemon;
    }

}