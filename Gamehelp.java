import java.util.Scanner;
public  class Gamehelp
{
  static int lans=0,lifecount=0;//static variables dont worry about them..
 public static boolean lifeline5050(int input)//function for 5050 lifeline call from the class Game.java
 {


   if(lifecount>=1)// checking if the lifeline had already been used up or not
   {
     return false;// if the lifeline is used up i.e lifecount >1
   }
   Scanner lsc=new Scanner(System.in);
   switch(input)
   {
     case 1:{//lifeline for physics question 1 called from Game.javang the count  to make sure the lifeline is 
       lifecount++;//increasing the count  to make sure the lifeline is used up
       System.out.println("You chose the lifeline. Your options are now : \n 1.V=IR \n 2.V=I/R");
       lans=lsc.nextInt();
       if(lans==1)
        return true;
      else
      return false;


     }

   case 2:{//lifeline for physics question 1 called from Game.java
     lifecount++;//increasing the count  to make sure the lifeline is used up
     System.out.println("You chose the lifeline. Your options are now : \n 1.NaCl soln\n 2.CCL4");
     lans=lsc.nextInt();
     if(lans==1)
      return true;
    else
    return false;


   }
   default:{//return false to function lifeline called from Game.java
     System.out.println("\n");
     return false;
   }
 }

 }
}
