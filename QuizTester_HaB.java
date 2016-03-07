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
public class QuizTester_HaB{
 
}

/**
 Describes any class whose objects can measure other objects.
 */
 public interface Measurer
 {
 /**
 Computes the measure of an object.
 @param anObject the object to be measured
 @return the measure
 */
 double measure(Object anObject);
 }


 
 
 
 
class	Data
{
 /**
 Computes the average of the measures of the	given	objects.
 @param objects an array of objects
 @param meas the measurer for	the objects
 @return	the average	of	the measures
 */
 public double average(Object[]	objects,	Measurer	meas){
   double sum	= 0;
   for (Object obj : objects)
   {
      sum = sum + meas.measure(obj);
   }
   if(objects.length >	0)	{ return	sum /	objects.length; }
      else	{ return	0;	}
    }
 }
 public Measurable max(Measurable[] objects){
   for(Mesaurable object : objects ){
      
   }
 }
}

class Quiz implements Measurer{
   public double measure(Object anObject){
      
   }

   
}
	
 
