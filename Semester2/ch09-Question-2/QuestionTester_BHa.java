import java.util.*;
public class QuestionTester_BHa{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
     
      ChoiceQuestion first = new ChoiceQuestion();
      
      NumericQuestion numQuestion = new NumericQuestion();
      numQuestion.display(scan.nextDouble());
      
      FillInQuestion fillQuestion = new FillInQuestion("What is your _name_?");
      fillQuestion.display();
   }

   /**
      Presents a question to the user and checks the response.
      @param q the question
   */
   public static void presentQuestion(Question q)
   {
      q.display();
      System.out.print("Your answer: ");
      Scanner in = new Scanner(System.in);
      String response = in.nextLine();
      System.out.println(q.checkAnswer(response));
   }
}

class FillInQuestion extends Question{
   private String questionAsked;
   private String response;
   
   public FillInQuestion(String questionAsked){
      this.questionAsked = questionAsked;  
      editQuestion();
      super.display();
      Scanner in = new Scanner(System.in);
      this.response = in.nextLine();
   }
   public void editQuestion(){
      int countNumberDash = 0;
      String answer = "";
      int index1 = 0;
      int index2 = 0;
      for(int i = 0; i<questionAsked.length();i++){
         if(questionAsked.substring(i,i+1).equals("_")){
            
            index1 = i;
            break;
         }
      }
      for(int i = index1; i<questionAsked.length();i++){
        if(questionAsked.substring(i,i+1).equals("_")&&i!=index1){
            
            index2 = i;
            break;
         }
      }
         
      answer = questionAsked.substring(index1+1,index2);
      setAnswer(answer);
      
      this.questionAsked = questionAsked.replace(answer,"_");
      setText(this.questionAsked);
   }
   @Override
   public void display(){
      System.out.println(super.checkAnswer(response));
      
   }
}
/** Number Question Class
*/
class NumericQuestion extends Question{
   
   public NumericQuestion(){
      setText("9*1");
      setAnswer("9");
      super.display();
     
   }
   /**
      Gets if answer is correct
   */
  
   public Boolean checkAnswer(double answer){
      double subtraction = Math.abs(answer - 9*1);
      return subtraction < 0.01;
   }
   public void display(double answer){
      
      System.out.println(checkAnswer(answer));
   }
}


/**
   A question with multiple choices.
*/
class ChoiceQuestion extends Question
{
   private ArrayList<String> choices;

   /**
      Constructs a choice question with no choices.
   */
   public ChoiceQuestion()
   {
      choices = new ArrayList<String>();
   }

   /**
      Adds an answer choice to this question.
      @param choice the choice to add
      @param correct true if this is the correct choice, false otherwise
   */
   public void addChoice(String choice, boolean correct)
   {
      choices.add(choice);
      if (correct) 
      {
         // Convert choices.size() to string
         String choiceString = "" + choices.size();
         setAnswer(choiceString);
      }
   }
   
   public void display()
   {
      // Display the question text
      super.display();
      // Display the answer choices
      for (int i = 0; i < choices.size(); i++)
      {
         int choiceNumber = i + 1;
         System.out.println(choiceNumber + ": " + choices.get(i));     
      }
   }
}






/**
   A question with a text and an answer.
*/
class Question
{
   private String text;
   private String answer;

   /**
      Constructs a question with empty question and answer.
   */
   public Question() 
   {
      text = "";
      answer = "";
   }

   /**
      Sets the question text.
      @param questionText the text of this question
   */
   public void setText(String questionText)   
   {
      text = questionText;
   }

   /**
      Sets the answer for this question.
      @param correctResponse the answer
   */
   public void setAnswer(String correctResponse)
   {
      answer = correctResponse;
   }

   /**
      Checks a given response for correctness.
      @param response the response to check
      @return true if the response was correct, false otherwise
   */
   public boolean checkAnswer(String response)
   {
      return response.equals(answer);
   }

   /**
      Displays this question.
   */
   public void display()
   {
      System.out.println(text);
   }
}


