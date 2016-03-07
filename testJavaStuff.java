public class testJavaStuff{
   public static void main(String[] args){
      Animal animal1 = new Animal("Animal");
      Hippo hippo = new Hippo();
      Animal leo = new Hippo();
      Hippo hipo = new Hippo();
      Lion lial = new Lion();
      ((Hippo)leo).uniqueForHippo();
      animal1 = hippo;
      Animal lion = new Lion();
      ()
      System.out.println("Animal eat: "+animal1.eat());
      System.out.println("Hippo eat: "+hippo.eat());
      System.out.println("Animal Die: "+animal1.die());
      System.out.println("Hippo Die: "+hippo.die());
     /*
   Casting examples :
   Animal leo = new Lion();

   leo.animalMethods();

   NO leo.lionMethods(); compiletime error

   YES ((Lion)leo).lionMethods();


   Animal yogi = new Bear();

   ((Lion)yogi) runtime error

*/
//interfaces!! learn it soon
    
      
   }
}
//super
class Animal{
   private String name;
   public Animal(String name){
      name = this.name;
   }
   public int eat(){
      return 3;
   }
   public boolean die(){
      return true;
   }
   public boolean compareEat(Animal animal){
      return eat() == animal.eat();
   }
}
//sub
class Hippo extends Animal{
   private int age;
   private String name;
   public Hippo(){
      super("test");
      //super(); is called automatic in any subclass constructor
      name = "Hello";
      age = 4;
      // Compile time error
   }
   @Override
   public int eat(){
   
      return 10;
   }
   
   @Override
   public boolean die(){
   
      return true;
   }
   public void uniqueForHippo(){
      System.out.println("Only for hippo?");
   }
   
}
class Lion extends Animal{
   public Lion(){
      super("test");
      //super(); is called automatic in any subclass constructor
     
      // Compile time error
   }
   public boolean liononly(){
      return true;
   }
}
