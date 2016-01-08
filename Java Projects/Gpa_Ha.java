import java.util.Arrays;
class Gpa_Ha
{
  public static void main(String[] args)
  {
      Student[] studentArray = new Student[10];
      for(int i = 0; i<3;i++){
         studentArray[i] = new Student(3.6,"Student",11);
      } 
      studentArray[3] = new Student(3.9);
      studentArray[4] = new Student(1.0);
      studentArray[5] = new Student(5.0);
      studentArray[6] = new Student(3.8,"Charles",9);
      studentArray[7] = new Student(2.4);
      studentArray[8] = new Student(4.6,"Jose",12);
      studentArray[9] = new Student(4.0,"Ben",10);
      System.out.println(toString(studentArray[9],studentArray));
      
       
  }
   
  static double maxGPA(Student[] array)
  {
      double maxGPA = array[0].getGPA();
      for(int i = 0; i<array.length;i++){
         maxGPA = Math.max(array[i].getGPA(),maxGPA);
      }
      return maxGPA;
  }
  
  static double minGPA(Student[] array)
  {
      double minGPA = array[0].getGPA();
      for(int i = 0; i<array.length;i++){
         minGPA = Math.min(array[i].getGPA(),minGPA);
      }
      return minGPA;
  }
  
  static double meanGPA(Student[] array)
  {
      double numStudents = array.length;
      double sumOfGPA = 0;
      for(int i = 0; i <array.length; i++){
         sumOfGPA+= array[i].getGPA();
      }
      return sumOfGPA/numStudents;

  }
  
  static double medianGPA(Student[] array)
  {
      double median = 0;
      double[] gpaArray = new double[array.length];
      for(int i=0;i<array.length;i++){
         gpaArray[i] = array[i].getGPA();
      }
      Arrays.sort(gpaArray);
      
      if(gpaArray.length%2 == 0){
         median = ((double)gpaArray[gpaArray.length/2] + (double)gpaArray[gpaArray.length/2 - 1])/2;
      }else{
         median = (double) gpaArray[gpaArray.length/2];
      }
      return median;

  }
  
  static public String toString(Student student,Student[] array) 
  {
     
     return student.getName() + " is a " +student.getGradeLevel()+
            " grader and has a " + student.getGPA() + " gpa." + 
            " The average gpa is " + meanGPA(array) + ".\nThe minimum gpa is " + minGPA(array) +
             " and the max gpa is " + maxGPA(array)+". \nThe median GPA is " + medianGPA(array) + "." + "\nThere are "+array.length+" students.";
            
  }  
  
   


}

class Student{
   //Private Variables
   private double gpa;
   private String Name;
   private int gradeLevel;
   // Consturctor with out parameter
   Student(double gpa){
      this.gpa = gpa;
      Name = "Annonymous Student";
      gradeLevel = 0;
   
   }
   //Consturctor that initalize all values
   Student(double gpa, String Name, int gradeLevel){
      this.gpa = gpa;
      this.Name = Name;
      this.gradeLevel = gradeLevel;
   }
   public double getGPA(){
      return gpa;
   }
   //Update GPA
   public void updateGPA(double newGPA){
      this.gpa = newGPA;
   
   }
   public String getName(){
      return Name;
   }
   public int getGradeLevel(){
      return gradeLevel;
   }
   

}