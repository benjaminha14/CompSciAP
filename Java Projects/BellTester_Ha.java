import java.util.ArrayList;
public class BellTester_Ha
{
   public static void main(String [] args)
   {
      
      ArrayList<Bell> studentIdArrayList = new ArrayList<Bell>();
      
      for(int i = 0; i < 9; i++)
      {
         studentIdArrayList.add(new Bell(i));
      }
      printArray(studentIdArrayList,"Original Array List: ");
      swapElements(studentIdArrayList);
      printArray(studentIdArrayList,"Swapped Elements: ");
      reOrderElements(studentIdArrayList);
      printArray(studentIdArrayList,"Reorder Elements: ");
      
   }
   public static void printArray(ArrayList<Bell> arrayList,String message){
      System.out.println(message);
      for(int i = 0; i < arrayList.size();i++)
      {
         System.out.print(arrayList.get(i).id());
         
      }
      System.out.println(" ");
   }
   public static void switchElements(ArrayList<Bell> arrayList){
      
      Bell lastIdNumber = arrayList.get(arrayList.size()-1);
      Bell firstIdNumber = arrayList.get(0);
      arrayList.set(0,lastIdNumber);
      arrayList.set(arrayList.size()-1,firstIdNumber);      
   }
   public static void swapElements(ArrayList<Bell> arrayList){
      
      Bell lastIdNumber = arrayList.get(arrayList.size()-1);
      Bell firstIdNumber = arrayList.get(0);
      arrayList.set(0,lastIdNumber);
      arrayList.set(arrayList.size()-1,firstIdNumber);      
   }
   public static void reOrderElements(ArrayList<Bell> arrayList)
   {
      int y = arrayList.size()-1;
      for(int i = 0; i < arrayList.size(); i++)
      {
         arrayList.set(i,arrayList.get(y));
         y--;
      }
   }
}




class Bell 
{

  private int studentId;

  public Bell( int id )
  {
     studentId = id;
  }

  public int id()
  {
     return studentId;
  }

  public int compareTo( Bell otherBell )
  {
     return Math.abs(this.studentId - otherBell.studentId);
  }

} 
/*Create a main method inside BellTester_Lastna that prints out the populated ArrayList and then calls each
method you create (for a,b,...f,g,j    i.e. you can skip h&i) and prints out the ArrayList after each method is called, so
we can see the results after each call.
Following change: 
for (c) replace all even id's with 216222
When checking for even/odd or comparing values, always compare the IDs of the students, not the index in the array list.
For swapping values, do not use any swap method provided by Java.
Be sure to separate & label your output to verify that you did each step correctly. i.e print the array list after each method is called: System.out.println("After step c:")*/

