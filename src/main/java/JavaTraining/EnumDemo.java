package JavaTraining;

public class EnumDemo
{
	  enum Day
	  {
	    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY 
	  };
  
  public static void main(String[] a)
  {

	  
    Day today = Day.WEDNESDAY;
    //JavaTraining.EnumDemo ed = new JavaTraining.EnumDemo();
    printWorkload(today);
  }
 
  //an enum type can be used as local variable, parameter
  static public void printWorkload(Day today)
  {
    if (today == Day.WEDNESDAY)
    {
      System.out.println("Higly Hectice");
    }
    else if(today == Day.MONDAY)
    {
    	System.out.println("Just Started");
    }
    else
    {
      System.out.println("Some other day");
    }
  }
}