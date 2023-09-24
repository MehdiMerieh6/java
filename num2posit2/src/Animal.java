public class Animal {
     String family;
     String namee;
     int age;
     boolean isMammal;

     // Création d'un  constructeur paramétré
     public Animal(String family, String namee, int age, boolean isMammal){
          this.family = family;
          this.namee = namee;
          this.age = age;
          this.isMammal = isMammal;
     }


     public void displayAnimal(){
          System.out.println("family"+family);
          System.out.println("name"+namee);
          System.out.println("age"+age);


     }
     public String toString(){
          return " family " +family +  " \nname "+namee +" \nage "+age;
     }
}
