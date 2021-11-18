public class Zebre extends Animal
{

    //Zebre mange herbe
    public Zebre(String nom , sexe_enum sexe)
    {
        super(nom,sexe);
    }

    @Override
    public void manger()
    {
        super.manger();

        System.out.print("de l'herbe ( "+getNom()+" - "+getSexe()+" )");
    }

    @Override
    public void dormir()
    {
        super.dormir();

        System.out.print("dans la savane ( "+getNom()+"- ZEBRE -"+getSexe()+" )");
    }

}
