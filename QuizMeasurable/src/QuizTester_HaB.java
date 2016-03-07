import java.util.*;

/*
   Do	E10.1	and E10.2. in one	file:	QuizTester_Lastna

   Copy the	Data class and	add the max	method to the class.

   Create the basic Quiz class and in your main, test	out yoiur max method	and the
   already created	average method	with your Quiz	objects.


   Create at least 10 Quiz	objects in your tester.

   Print	out the quiz scores and	the average	and max quiz score.
   ••e10.1 Add	a method
   public static Measurable max(Measurable[]	objects)
   to	the Data	class	that returns the object	with the	largest measure.
   •e10.2 Implement a class Quiz	that implements the Measurable interface.	A quiz has a score
   and a	letter grade (such as B+).	Use the Data class of Exercise E10.1 to process	an	array
   of	quizzes.	Display the	average score and	the quiz	with the	highest score (both letter
   grade	and score).
*/
public class QuizTester_HaB {
    public static void main(String[] args){
        Quiz[] quizArray = new Quiz[]{new Quiz(), new Quiz(), new Quiz(),
                new Quiz(), new Quiz(), new Quiz(), new Quiz(),
                new Quiz(), new Quiz(), new Quiz()};

        Data data = new Data();
        System.out.println("Average grade: "+data.average(quizArray));
        System.out.println("Max grade: "+data.max(quizArray));


}

}

/**
 * Describes any class whose objects can measure other objects.
 */
interface Measurerable {
    /**
     * Computes the measure of an object.
     *
     * @return the measure
     */
    double getMeasure();
}


class Data {
    /**
     * Computes the average of the measures of the	given	objects.
     *
     * @param objects an array of object
     * @return the average	of	the measures
     */
    public static double average(Measurerable[] objects) {
        double sum = 0;
        for (Measurerable obj : objects) {
            sum = sum + obj.getMeasure();
        }
        if (objects.length > 0) {
            return sum / objects.length;
        } else {
            return 0;
        }
    }

    public static Measurerable max(Measurerable[] objects) {
        Measurerable max = objects[0];
        for (Measurerable object : objects) {
            if (object.getMeasure() > max.getMeasure()) {
                max = object;
            }
        }
        return max;

    }
}

//4- A
//3-B
//2-C
//1-D
class Quiz implements Measurerable {
    private double score;
    private String grade;
    public Quiz(){
        score = (Math.random()*100);
        if(score >90){
            grade = "A";
        }else if(score < 90 && score > 80){
            grade = "B";
        }else if(score < 80 && score > 70){
            grade = "C";
        }else if (score < 70 && score > 60){
            grade = "D";
        }else{
            grade = "F";
        }

    }
    public double getMeasure() {
        return score;
    }
    public String toString(){
        return grade + " Great job. Just like Lindy's quizes!";
    }

}



