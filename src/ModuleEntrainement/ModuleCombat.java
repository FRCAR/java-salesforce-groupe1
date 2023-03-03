package ModuleEntrainement;

import ModuleReferentiel.Pokemon;
import ModuleReferentiel.Attack;

public class ModuleCombat {

    // pkmAttaquant attaque pkmReceveur
    public static void attaqueAutrePokemon(Pokemon pkmAttaquant, Pokemon pkmReceveur) {
        pkmReceveur.setPointDeVie(pkmReceveur.getPointDeVie() - calculDmg(pkmAttaquant, pkmReceveur));
        msgAtkTour(pkmAttaquant, pkmReceveur);
        if (pkmReceveur.getPointDeVie() <= 0) {
            pkmReceveur.setIsKO(true);
            System.out.println("Le pokemon : " + pkmReceveur.getName() + " est KO \nFin du combat");
            calculExp(pkmAttaquant, pkmReceveur);
        } else {
            pkmAttaquant.setPointDeVie(pkmAttaquant.getPointDeVie() - calculDmg(pkmReceveur, pkmAttaquant));
            msgAtkTour(pkmReceveur, pkmAttaquant);
            if (pkmAttaquant.getPointDeVie() <= 0) {
                pkmAttaquant.setIsKO(true);
                System.out.println("Le pokemon : " + pkmAttaquant.getName() + " est KO \nFin du combat");
                calculExp(pkmReceveur, pkmAttaquant);
            }
        }
    }

    public static double calculDmg(Pokemon pkmDmgEnvoye, Pokemon pkmDmgRecu) {

        Attack atk = new Attack();
        double multiplicateur = atk.arrayBonusAttack(pkmDmgEnvoye.getType(), pkmDmgRecu.getType());

        double dmgFinal;
        dmgFinal = pkmDmgEnvoye.getAttack().getPower() * (multiplicateur / 100);
        return dmgFinal;

    }

    public static void calculExp(Pokemon pkmWin, Pokemon pkmLose) {
        if (pkmLose.getPointDExperience() / 3 >= 100) {
            pkmWin.setPointDExperience(pkmWin.getPointDExperience() + pkmLose.getPointDExperience() / 3);
        } else if (pkmLose.getPointDExperience() / 3 < 100) {
            pkmWin.setPointDExperience(pkmWin.getPointDExperience() + 100);
        }
        System.out.println(
                "Le pokemon : " + pkmWin.getName() + " a gagné : " + pkmWin.getPointDExperience() + " points d'xp");
    }

    public static void msgAtkTour(Pokemon p1, Pokemon p2) {
        System.out.println(
                "Le pokémon : " + p2.getName() + " se fait attaquer par "
                        + p1.getAttack().getNameAttack()
                        + " et perd " + calculDmg(p1, p2)
                        + " points de vie \nIl lui reste "
                        + p2.getPointDeVie()
                        + " points de vie");
    }

}
