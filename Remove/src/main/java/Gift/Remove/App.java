package Gift.Remove;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if (s.charAt(0)=='A' && s.charAt(1)=='A'){
        		s=s.substring(2);
        }
        else if (s.charAt(0)=='A'){
        		s=s.substring(1);
        }
        else if (s.charAt(1)=='A'){
        		s=s.charAt(0)+s.substring(2);
        }
        System.out.println(s);
    }
}
