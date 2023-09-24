import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("donner moi nobre de cages ");
        int nbrcages=scanner.nextInt();
        System.out.println("donner moi  le name de zoo");
        String Zooname=scanner.nextLine();

    System.out.println(Zooname+"comporte"+ nbrcages+ "cage");
// deux objet Animal et zoo
    Animal animal=new Animal("mpou", "Lion",12,false);
    Zoo myzoo=new Zoo("belv","tunis",nbrcages);

    myzoo.dispalayZoo();
    //ca me donne myzoo ou a elle mawjouda
    System.out.println(myzoo);
    System.out.println(myzoo.toString());

    myzoo.addAnimal(animal);

        }
        Animal searchlion=new Animal("mpou","Lion",12,false);





    }

