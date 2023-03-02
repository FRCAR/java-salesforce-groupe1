package ModuleReferentiel;

public class Attack {

    public String nameAttack;
    public TYPEPOKEMON type;
    public int power;
    public int valueAtkLancer;
    public int valueAtkRecu;

    public Attack(String nameAttack, TYPEPOKEMON type, int power) {
        this.nameAttack = nameAttack;
        this.type = type;
        this.power = power;
    }

    public String getNameAttack() {
        return nameAttack;
    }

    public TYPEPOKEMON getType() {
        return type;
    }

    public int getPower() {
        return power;
    }

    public int arrayBonusAttack(TYPEPOKEMON atkLancer, TYPEPOKEMON atkRecu) {

        switch (atkLancer) {
            case EAU -> {
                valueAtkLancer = 0;
            }
            case AIR -> {
                valueAtkLancer = 1;
            }
            case SOL -> {
                valueAtkLancer = 2;
            }
            case FEU -> {
                valueAtkLancer = 3;
            }
        }

        switch (atkRecu) {
            case EAU -> {
                valueAtkRecu = 0;
            }
            case AIR -> {
                valueAtkRecu = 1;
            }
            case SOL -> {
                valueAtkRecu = 2;
            }
            case FEU -> {
                valueAtkRecu = 3;
            }
        }

        int[][] arrayBonus = {
                { 100, 75, 100, 125 },
                { 125, 100, 75, 100 },
                { 100, 125, 100, 75 },
                { 75, 100, 125, 100 }
        };
        return arrayBonus[valueAtkLancer][valueAtkRecu];

    }

}
