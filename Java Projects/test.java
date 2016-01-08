
class test {
       public static void main(String[] args) {
        defaultClass def = new defaultClass(4);
        
        System.out.println(def.tostring());
        def.changeString("lll");
        def.add(5);
        String bet = "cat";
        String at = "con";
        System.out.println(bet.substring(1,bet.length()));
        System.out.println(def.conCat("","tellow"));
               
         }
   
}
class defaultClass{
   private int number;
   private String yayear= "ga";
   private boolean bool;
   defaultClass(int number2){
      number = number2;
      yayear = "adfad";

   }
   void changeString(String yayear){
      this.yayear = "adsfaasdfds";
   }
   void add(int number){
      this.number += number;
      
      System.out.println("Void add Funcition: "+bool);
      int i = 2+3+4*5/2;
      System.out.println(i);
      
      
   }
   String tostring(){
      number *=2;
      return "Next "+ number;
    }
  public String conCat(String a, String b) {
  
  if(a.length()== 0){
       return b;
  }else if(b.length()==0){
       return a;
  }
  String ar = a.substring(a.length()-1);
  String br = b.substring(0,1);
  if(ar.equals(br)){
        
        return a.concat(b.substring(1,b.length()));
  }else{
      
       return a.concat(b);
  }
}

}

   
