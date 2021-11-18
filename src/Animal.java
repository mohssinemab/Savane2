import java.util.Random;
public class Animal
{
    public static enum sexe_enum{male,femelle};
    private sexe_enum sexe;
    private String nom;
    Random rand = new Random();

    public Animal(String nom , sexe_enum sexe)
    {
        this.nom=nom;
        this.sexe=sexe;
    }

    public sexe_enum getSexe()
    {
        return sexe;
    }

    public String getNom()
    {
        return nom;
    }

    public void setSexe(sexe_enum sexe) {
        this.sexe = sexe;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void manger()
    {
        System.out.print("je mange ");
    }
    public void dormir()
    {
        System.out.print("je dors ");
    }

    void rencontrer(Animal animal, Savane savane)
    {
        if(this instanceof Zebre)
        {
            //zebre rencontre avec
            if(animal instanceof Zebre)
            {
                //avec zebre
                if(animal.sexe!=this.sexe)
                {
                    System.out.println("Rencontre zebre male + femelle = naissance mini zebre");
                    //choix du sexe par hasard
                    sexe_enum gender= sexe_enum.values()[(int)(Math.random()*sexe_enum.values().length)];
                    savane.collection_animal.add(new Zebre((this.nom+" "+animal.getNom()),gender));
                }
            }else
            {
                //avec lion
                    System.out.println("Rencontre LION et ZEBRE - Le lion mange le zebre");
                    savane.collection_animal.remove(this);
            }
        }
        else
        {
            //lion rencontre avec
            if(animal instanceof Lion)
            {
                //avec Lion
                if(animal.sexe!=this.sexe)
                {
                    //sexe opposee
                    System.out.println("Rencontre LION male + femelle = naissance mini LION");
                    //choix du sexe par hasard
                    sexe_enum gender= sexe_enum.values()[(int)(Math.random()*sexe_enum.values().length)];
                    savane.collection_animal.add(new Lion((this.nom+" "+animal.getNom()),gender));
                }else {
                    //LION vs LION meme sexe

                    boolean val = rand.nextInt(25)==0;

                }

            }else
            {
                //avec Zebre
                System.out.println("Rencontre LION et ZEBRE - Le lion mange le zebre");
                savane.collection_animal.remove(animal);
            }
        }
    }



    @Override
    public String toString()
    {
        return "Animal{" + "sexe=" + sexe + ", nom='" + nom + '\'' + '}';
    }
}
