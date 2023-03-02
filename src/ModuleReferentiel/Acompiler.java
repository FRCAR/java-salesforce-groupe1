

public class Acompiler {

    public static void main(String[] args) {

        Racaillou objectBulbasaur = new Racaillou("Bulbasaur",1);
        System.out.printf("L'objet Bulbasaur est un Pokemon instancié par la classe Racaillou via son nom %s son id %d, par default il a le type %s, un point de vie max %d, et l'attaque %s. actuellement il a les point de vie %d et les point d'experience %s qui sont saisi par un setter \n ",objectBulbasaur.nomPokemon,objectBulbasaur.idPokemon,objectBulbasaur.type,objectBulbasaur.pointVieMax,objectBulbasaur.attaqueDeRacaillou,objectBulbasaur.pointDeVie,objectBulbasaur.pointDExperience);
    
        Salameche objectCharmander = new Salameche("Charmander",2);

        objectBulbasaur.attaqueAutrePokemon(objectBulbasaur.attaqueDeRacaillou,objectCharmander);

}
}
