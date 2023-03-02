package ModuleReferentiel;

public class Pokemon {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private String type;
    private int xp;
    private int hp;
    private boolean KO;

    public Pokemon(int id, String name, String type, int xp, int hp, boolean b) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.xp = xp;
        this.hp = hp;
        this.KO = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isKO() {
        return KO;
    }

    public void setKO(boolean kO) {
        KO = kO;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.type + " " + this.xp + " " + this.hp + " " + this.KO;
    }
}
