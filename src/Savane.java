import java.util.ArrayList;
import java.util.Random;

public class Savane
{
    ArrayList<Animal> collection_animal = new ArrayList<Animal>();

    public Savane(ArrayList<Animal> coll_anim) {
        this.collection_animal = coll_anim;
    }

    public void affiche(){
        System.out.println(collection_animal.size());
        for (Animal a:collection_animal) {
            System.out.println(a);
        }
    }

    public void mangerDansLaSavane()
    {
        for(Animal a : this.collection_animal)
        {
            a.manger();
            System.out.print(" --- DANS LA SAVANE ");
            System.out.println();

        }
        }
    public void dormirDansLaSavane()
    {
        for(Animal a : this.collection_animal)
        {
            a.dormir();
            System.out.print(" --- DANS LA SAVANE ");
            System.out.println();
        }
    }
    public void rencontre(){
        int index1 = new Random().nextInt(collection_animal.size());
        int index2 ;
        do {
             index2 = new Random().nextInt(collection_animal.size());
        }while(index1==index2);
        collection_animal.get(index1).rencontrer(collection_animal.get(index2),this);
    }
}
