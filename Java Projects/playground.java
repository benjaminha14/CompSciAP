import java.util.*;


public class playground {

    public static void main(String[] args) {
	// write your code here
     ArrayList<String> myList = new ArrayList<String>();
     for(int i = 0;i<10;i++){
      myList.add(i,"Hi");
     }
     System.out.println("Size: "+myList.size());
     myList.add(9,"adsf");
     for(String name:myList)System.out.print(name);
     System.out.println("Size: "+myList.size());

     
    }
    
    
}
