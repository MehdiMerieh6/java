public class Animal {
     String family;
     String name;
     Integer age;
     boolean isMammal;

     // Création d'un  constructeur paramétré

     Animal(String family, String name, int age, boolean isMammal){
          this.family = family;
          this.name = name;
          this.age = age;
          this.isMammal = isMammal;
     }


     public void displayAnimal(String family,String name,int age){
          System.out.println("family");
          System.out.println("name");
          System.out.println("age");

     }
}
