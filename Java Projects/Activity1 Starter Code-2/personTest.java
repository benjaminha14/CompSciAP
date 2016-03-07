public class personTest{
   public static void main(String[] args){
      Person person = new Person();
      Student ben = new Student();
      person = ben;
      Person person1 = new Student();
      Student ben1 = new Student();
      ben.alive();
      }
}
class Person{
   private int age = 9;
   private boolean isAlive = true;
   public void alive (){
      System.out.println("false");
   }
}
class Student extends Person{
   // public void alive(){
//       System.out.println("Test");
//    }
   public void test1(){
      System.out.println("Class 1");
   }
  
}