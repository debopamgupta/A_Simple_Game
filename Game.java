import java.util.Scanner;
public class Game
{
  public static void main(String args[])
  {
    String name;//storing the name
    int ch,ans,points=0;// choice,answer and points
    Scanner sc=new Scanner(System.in);//Scanner object
    System.out.println("enter your name");
    name=sc.nextLine();
    System.out.println("Hi there "+name+" lets start with the game right away");
    System.out.println("choose a category:\n 1.physics\n 2.chemistry");// add more topics if you want
    ch=sc.nextInt();//choice of topic
    switch(ch)
    {
      case 1:
      {
        System.out.println("what is ohms law \n 1.V=IR \n 2.V=I/R \n 3.I=RV \n 4.lifeline 5050");//add more questions if u want
        ans=sc.nextInt();//input should be the option number 
       if(ans==1)
        {
          points++;
         System.out.println("Right answer!! ");
        }
        else if(ans==4)
        {
          if(Gamehelp.lifeline5050(1))//calling the lifeline func in the other class Gamehelp to help with lifelines
           points++;//pts should increase if the answer from lifeline is right
        }
        else
        System.out.println("Wrong answer or invalid input");
        break;
      }
      case 2:
      {
        System.out.println(" Which of these is a strong electrolyte\n 1.NaCl soln \n 2.acetic acid  \n 3.CCl4 \n 4.lifeline 5050");
        //add more questions if u want
        ans=sc.nextInt();//input should be the option number 
        if(ans==1)
        {
          points++;
         System.out.println("Right answer!! ");
        }
        else if(ans==4)
        {
          if(Jconhelp.lifeline5050(2))//calling the lifeline func in the other class Gamehelp to help with lifelines
           points++;//pts should increase if the answer from lifeline is right
        }
        else
        System.out.println("Wrong answer or invalid input");
        break;
      }
      default:
        System.out.println("invalid input");//default option if input is something other than the option no.s for the subjects
    }
   System.out.println("your points are"+points);//print the total points at last
 }
}
