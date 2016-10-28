import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConverListtoSet {

	public static void main(String[] args) {
		
		
		  	System.out.println("List values .....");
		    	List<String> list = new ArrayList<String>();
		        list.add("1");
		        list.add("3");
		        list.add("5");
		        list.add("3");
		        list.add("7");
		        list.add("3");
		        list.add("1");
		        list.add("1");
		        list.add("5");

		        for (String a : list){
		        	System.out.println(a);
		        }

		        Set<String> set = new HashSet<String>(list);

		        System.out.println("Set values .....");
		        for (String b : set){
		        	System.out.println(b);
		        }
		    }
		}


