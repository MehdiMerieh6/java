public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
         if(nbrCages <=0 &&nbrCages <=25) {
        this.nbrCages = nbrCages;
    } else

    {
        System.out.println("le zoo comporte 25 animeaux .");
    }
     public Zoo(String name, String city, int 25 ){
        this.name = name;
        this.city = city;
        this.animals = new Animal[25];
        this.nbrCages = 25;
    }
         //Methode add display
    public void dispalayZoo(String name,String city,int nbrCages){
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville du zoo : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }
         //Methode addanimal
    public boolean addAnimal(Animal animal) {
        if (nbrCages < animals) {
            animals[nbrCages] = animal;
            nbrCages++;
            return true;
        } else {

            return false;
        }
}
