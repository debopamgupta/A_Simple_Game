import java.util.Scanner;
public class Jcon
{
  public static void main(String args[])
  {
    String name;
    int ch,ans,points=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your name");
    name=sc.nextLine();
    System.out.println("Hi there "+name+" lets start with the game right away");
    System.out.println("choose a category:\n 1.physics\n 2.chemistry");
    ch=sc.nextInt();
    switch(ch)
    {
      case 1:
      {
        System.out.println("what is ohms law \n 1.V=IR \n 2.V=I/R \n 3.I=RV \n 4.lifeline 5050");
        ans=sc.nextInt();
       if(ans==1)
        {
          points++;
         System.out.println("Right answer!! ");
        }
        else if(ans==4)
        {
          if(Jconhelp.lifeline5050(1))
           points++;
        }
        else
        System.out.println("Wrong answer or invalid input");
        break;
      }
      case 2:
      {
        System.out.println(" Which of these is a strong electrolyte\n 1.NaCl soln \n 2.acetic acid  \n 3.CCl4 \n 4.lifeline 5050");
        ans=sc.nextInt();
        if(ans==1)
        {
          points++;
         System.out.println("Right answer!! ");
        }
        else if(ans==4)
        {
          if(Jconhelp.lifeline5050(2))
           points++;
        }
        else
        System.out.println("Wrong answer or invalid input");
        break;
      }
      default:
        System.out.println("invalid input");
    }
   System.out.println("your points are"+points);
 }
}
