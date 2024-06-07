import java.util.*;
public class StudentGrade
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    String Subjects[]={"ENGLISH LANGUAGE","ENGLISH LITERATURE","MATHS","PHYSICS","CHEMISTRY","COMPUTER SCIENCE"};
    double marks[]=new double[Subjects.length];
    System.out.println("Enter all your marks out of 100");
    double TotalMarks=0;
    for(int i=0;i<Subjects.length;i++){
        System.out.println("Enter the marks in "+ Subjects[i]);
        marks[i]=sc.nextDouble();
        TotalMarks += marks[i];
    }
    double Avg= (TotalMarks)/Subjects.length;
    System.out.println("YOUR GRADES ARE CALCULATED AS FOLLOWS:"+"\n"+ "90 and above - A+" + "\n" + "80-89 - A!" + "\n" + "70-79 - B!" + "\n" + "60-69 - C!" + "\n"+ "41-59 - C+!" + "\n" + "40 and above - D!" );
    System.out.println("Total Marks obtained is " + TotalMarks);
    System.out.println("Average percentage Scored by the student is "+ Avg);
    System.out.println("Grade Scored by the student is "+ grade(Avg));
    System.out.println("CONGRATULATIONS!!!!");
}

public static String grade ( double Avg )
{
    if(Avg>=90)
    {
        return "A+;
    }
    else 
    if(Avg>=80 && Avg<90)
    {
        return "A";
    }
    else 
    if(Avg>=70 && Avg<80)
    {
        return "B";
    }
    else 
    if(Avg>=60 && Avg<70)
    {
        return "C";
    }
    else 
    if(Avg>40 && Avg<60){
    return "C+";
    }
    else 
    return "D";
}
}
