public class Lion extends Animal
{
    //lion mange viande
    public Lion(String nom , sexe_enum sexe)
    {
        super(nom,sexe);
    }
    @Override
    public void manger()
    {
        super.manger();
        System.out.print("de la viande ( "+getNom()+"- LION -"+getSexe()+" )");
    }

    @Override
    public void dormir()
    {
        super.dormir();

        System.out.print("dans la savane ( "+getNom()+"- LION -"+getSexe()+" )");
    }
}
