public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int nbrAnimal = 0;


    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        animals = new Animal[nbrCages];
        this.nbrCages = nbrCages;
    }

    //Methode add display
    public void dispalayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville du zoo : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }


    public String toString() {
        return " zoo name " + name + " \ncity " + city + " \nbrcages " + nbrCages;
    }

    public boolean addAnimal(Animal animal) {
        if (nbrAnimal < animals.length) {
            animals[nbrAnimal] = animal;
            nbrAnimal++;
            return true;
        } else {
            return false;
        }
    }

    public void dispalayAnimal() {
        for (int i = 0; i < nbrAnimal; i++) {
            animals[i].displayAnimal();
            System.out.println();//traj3ek l star illli baaadou
        }
    }

    public int searchanimal(Animal animal) {
        for (int i = 0; i < nbrAnimal; i++) {
            if (animals[i].namee.equals(animal.namee)) {
                return i;

            }
        }
        return -1;
    }


}


