import java.util.Scanner;
public  class Jconhelp
{
  static int lans=0,lifecount=0;
 public static boolean lifeline5050(int input)
 {


   if(lifecount>=1){
     return false;
   }
   Scanner lsc=new Scanner(System.in);
   switch(input)
   {
     case 1:{
       lifecount++;
       System.out.println("You chose the lifeline. Your options are now : \n 1.V=IR \n 2.V=I/R");
       lans=lsc.nextInt();
       if(lans==1)
        return true;
      else
      return false;


     }

   case 2:{
     System.out.println("You chose the lifeline. Your options are now : \n 1.NaCl soln\n 2.CCL4");
     lans=lsc.nextInt();
     if(lans==1)
      return true;
    else
    return false;


   }
   default:{
     System.out.println("\n");
     return false;
   }
 }

 }
}
