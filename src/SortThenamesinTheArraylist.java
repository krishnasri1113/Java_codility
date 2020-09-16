import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortThenamesinTheArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> alnames=new ArrayList<String>();
		alnames.add("siri");
		alnames.add("anu");
		alnames.add("chintu");
		alnames.add("chintu");
		alnames.add("balu");
		alnames.add("deepu");
		System.out.println("efore sorting arraylist is:");
		Iterator<String> it=alnames.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		Collections.sort(alnames);
		System.out.println("After sorting arraylist is:");
		Iterator<String> it1=alnames.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		System.out.println("using foreach loop");
		for(String temp:alnames)
		{
			System.out.println(temp);
		}
	
	}
}
