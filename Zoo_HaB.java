import java.util.*;
import java.util.Collections;
public class Zoo_HaB{
   public static void main(String[] args){
      ArrayList<Animal> animals = new ArrayList<Animal>();
      animals.add(new Lion("Lion",9));
      animals.add(new Elephants("Elephants",10));
      animals.add(new Rattlesnake("Rattlesnake",5));
      for(Animal animal : animals){
         animal.speak();
      }  
      Collections.sort(animals); 
      for(Animal animal : animals){
         System.out.println(animal.getAge());
      }
   }
  
}
/*
   Animal Class
   Super class
*/
class Animal implements Comparable{
   private String name;
   private String genus;
   private int age;
   public Animal(String name,String genus, int age){
      this.name = name;
      this.genus = genus;
      this.age = age;
      
   }
   public void speak(){
      System.out.println("Name: Animal");
      System.out.println("Genus: Animilia");
   }
   public int compareTo(Object animal){
      if(getAge()< ((Animal)animal).getAge()){
         return -1;
      }else if(getAge()>((Animal)animal).getAge()){
         return 1;
      }else{
         return 0;
      }
   }
   public String getName(){return name;}
   public String getGenus(){ return genus;}
   public int getAge(){ return age;}
}
/*
   Lion class
   Sub class of animal 
*/
class Lion extends Animal{
   public Lion(String name,int age){
      super(name,"Panthera",age);
   }
   @Override
   public void speak(){
     System.out.println("Name: "+ super.getName());
     System.out.println("Genus: "+super.getGenus());
     
   }
}
/*
   Elephant class
   Sub class of animal
*/
class Elephants extends Animal{
   public Elephants(String name,int age){
      super(name,"Elephas",age);
   }
   @Override
   public void speak(){
     System.out.println("Name: "+ super.getName());
     System.out.println("Genus: "+super.getGenus());
     
   }
}
/*
   Rattlesnake class
   Sub class of animal
*/
class Rattlesnake extends Animal{
   public Rattlesnake(String name,int age){
      super(name,"Crotalus",age);
   }
   @Override
   public void speak(){
     System.out.println("Name: "+ super.getName());
     System.out.println("Genus: "+super.getGenus());
     
   }

}