import java.util.ArrayList;

public class TestSavane
{

    public static void main (String args[])
    {
        ArrayList<Animal> collection_animal = new ArrayList<Animal>();
        String nom;
        for(int i = 0 ; i < 20 ; i ++)
        {
            if(i <10){
            nom = "Zebre "+ i;
                if(i<5)
            {
                collection_animal.add(new Zebre(nom, Animal.sexe_enum.femelle));
            }
            else
            {
                collection_animal.add(new Zebre(nom, Animal.sexe_enum.male));
            }
            }
            else
            {
                nom = "Lion "+ i;
                if(i<15)
                {
                    collection_animal.add(new Lion(nom, Animal.sexe_enum.femelle));
                }
                else
                {
                    collection_animal.add(new Lion(nom, Animal.sexe_enum.male));
                }
            }

        }

        Savane zriba = new Savane(collection_animal);
//        zriba.mangerDansLaSavane();
//        zriba.dormirDansLaSavane();
        zriba.affiche();
        int i=0;
        while(i<4){
        zriba.rencontre();
        i++;
        }
        zriba.affiche();





    }


}
