
/**
 * Write a description of class CheckEmPalindromes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CheckEmPalindromes
{
    public boolean isPalindrome(String S)
    {
        
       if(S.charAt(0)==S.charAt(S.length()-1))
       {
        if(S.length()>2)
        {
            return isPalindrome(S.substring(1, S.length()-1));
        }
        else
        {return true;}
        }
        
       else
       return false;
    
    }
}
