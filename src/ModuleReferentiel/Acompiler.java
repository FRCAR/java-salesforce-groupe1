import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Acompiler {

    public static void main(String[] args) {

       // Racaillou objectBulbasaur = new Racaillou("Bulbasaur",1);
        //System.out.printf("L'objet Bulbasaur est un Pokemon instancié par la classe Racaillou \n via son nom %s son id %d,\n par default il a le type %s, \n un point de vie max %d, \n et l'attaque %s. \n actuellement il a les point de vie %d et les point d'experience %s \n ",objectBulbasaur.nomPokemon,objectBulbasaur.idPokemon,objectBulbasaur.type,objectBulbasaur.pointVieMax,objectBulbasaur.attaqueDeRacaillou.nomAttaque,objectBulbasaur.pointDeVie,objectBulbasaur.pointDExperience);
    
        //Salameche objectCharmander = new Salameche("Charmander",2);

        //objectBulbasaur.attaqueAutrePokemon(objectBulbasaur.attaqueDeRacaillou,objectCharmander);
      

        //create pokemons list
        List<Pokemon> pokemonList = new ArrayList<>();

        pokemonList.add(new Racaillou("monRacaillou",1));
        pokemonList.add(new Carapuce("monCarapuce",2));
        pokemonList.add(new Roucoul("monRoucoul",3));
        pokemonList.add(new Salameche("monSalameche",1));

        //create pokemons map

        HashMap<Pokemon,Integer> pokemonMap=new HashMap<Pokemon,Integer>();
        pokemonMap.put(new Racaillou("monRacaillou",1),1); 


        System.out.println(pokemonMap.keySet());


}
}
