import java.math.*;
/**
 * Write a description of class binarite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class binarite
{
    
   public void checkPalindrom()
   {
    CheckEmPalindromes pal = new CheckEmPalindromes();
    for(int i=0;i<10000000;i++)
    {
        if(pal.isPalindrome(printBinary(i)))
        {
            System.out.println(""+i+" - "+printBinary(i));
        }
    }
    
    }
   public String printBinary(int i)
   {
       if(i<2)
       {
           return ""+i;
       }
       else
       {
            return ""+printBinary(i/2)+(i%2);
        }
       
    }

}
