import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class uniqelements {

	public static void main(String[] args) {
		// TODO Auto-generated me thod stub
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1");
	    int num1=sc.nextInt();
	    if(!hm.containsKey(num1))
	    {
	    	hm.put(num1, 1);
	    }
	    else
	    {
	    	System.out.println("num already exists in the map");
	    }
		System.out.println("Enter num2");
		int num2=sc.nextInt();
		if(!hm.containsKey(num2))
		{
			hm.put(num2, 1);
		}
		else
		{
			System.out.println("num is alraedy exists in the map");
		}
		System.out.println("Enter num3");
		int num3=sc.nextInt();
		if(!hm.containsKey(num3))
		{
			hm.put(num3, 1);
		}
		
		else
		{
			System.out.println("num is already exists in the map");
		}
		for(Map.Entry<Integer, Integer> m:hm.entrySet())
		{
			if(m.getValue()==1)
			{
				System.out.println(m.getKey());
			}
		}
		
		//System.out.println(hm);
		

	}

}
