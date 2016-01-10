import java.util.ArrayList;
import java.util.Collections;
public class BellTester_Ha
{
   public static void main(String [] args)
   {
      
      ArrayList<Bell> studentIdArrayList = new ArrayList<Bell>();
      
      for(int i = 0; i < 10; i++)
      {
         studentIdArrayList.add(new Bell(i));
      }
      printArray(studentIdArrayList,"Original Array List: ");
      swapElements(studentIdArrayList);
      printArray(studentIdArrayList,"Swapped Elements: ");
      reOrderElements(studentIdArrayList);
      printArray(studentIdArrayList,"Reorder Elements: ");
      moveEvenToFront(studentIdArrayList);
      printArray(studentIdArrayList,"Move Even Elements: ");
      replaceLargerElements(studentIdArrayList);
      printArray(studentIdArrayList,"Replace Larger Elements: ");
      removeMiddleElement(studentIdArrayList);
      printArray(studentIdArrayList,"Remove Middle Elements: ");
      replaceEvenElements(studentIdArrayList);
      printArray(studentIdArrayList,"Replace Even Elements: ");
      System.out.println("Second largest Element: " + secondLargestElement(studentIdArrayList));
      System.out.println("Duplicate number: " + duplicateNumbers(studentIdArrayList));
      
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
      ArrayList<Bell> studentIdArrayList = (ArrayList<Bell>)arrayList.clone();
      int count = arrayList.size()-1;
      Bell last = studentIdArrayList.get(count);
      arrayList.set(0,last);
     
      count = 0;
      for(int i = 1; i < arrayList.size(); i++){
         last = studentIdArrayList.get(count);
         count++;   
         arrayList.set(i,last);                        
      }   
   } 
   public static void replaceEvenElements(ArrayList<Bell> arrayList){
      Bell bell = new Bell(216222);
      for(int i = 0; i < arrayList.size();i++){
         if(arrayList.get(i).id() %2 == 0){
            arrayList.set(i,bell);
         }
      }
   }
   public static void replaceLargerElements(ArrayList<Bell> arrayList){
      for(int i = 2; i < arrayList.size()-2;i++)
      {
         Bell backNum = arrayList.get(i-1);
         Bell frontNum = arrayList.get(i+1);
         if(backNum.id() > frontNum.id()){
            
            arrayList.set(i,backNum);
         }else if(frontNum.id() > backNum.id()){
            arrayList.set(i,frontNum);
         }
      }
   }
   public static void removeMiddleElement(ArrayList<Bell> arrayList){
      int mid = arrayList.size()/2;

      if(arrayList.size()%2 == 0){
         arrayList.remove(mid-1);
         arrayList.remove(mid);
      }else{
         arrayList.remove(mid-1);
      }
   
   }
   public static void moveEvenToFront(ArrayList<Bell> arrayList){
     int endOfEvens = arrayList.size(); 
     Bell temp;
     for (int i = 0; i < arrayList.size(); i++) {
      if (arrayList.get(i).id() % 2 == 0){
         temp = arrayList.get(i);
         for (int j = i; j < endOfEvens; j++){
            
            arrayList.set(j,arrayList.get(j));
         }
         arrayList.set(endOfEvens-1,temp);
         endOfEvens--;
      }
     }
   }
   public static int secondLargestElement(ArrayList<Bell> arrayList){
      
      ArrayList<Integer> idList = new ArrayList<Integer>();
      for(int i = 0; i < arrayList.size(); i++) idList.add(arrayList.get(i).id());
      Collections.sort(idList);

      return idList.get(idList.size()-2);
   }
   public static boolean duplicateNumbers(ArrayList<Bell> arrayList){
    int x = 0;
    while(x < arrayList.size()){
    int firstNum = arrayList.get(x).id();
      for(int i = 0; i < arrayList.size();i++){
         if(firstNum == arrayList.get(i).id()) return true;
      
      }
    x++;
    }
    return false;
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

