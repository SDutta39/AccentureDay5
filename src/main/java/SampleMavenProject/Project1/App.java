package SampleMavenProject.Project1;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TreeMap<Integer,String>treemap=new TreeMap<Integer,String>();
        treemap.put(4, "Orange");
        treemap.put(3,"Mango");
        treemap.put(1,"Apple");
        treemap.put(2,"Banana");
		System.out.println("Descending Map:"+treemap.descendingMap());

    }
}
