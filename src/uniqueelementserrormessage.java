import java.util.HashMap;
import java.util.Map;

public class uniqueelementserrormessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,2,6};
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(!hm.containsKey(arr[i]))
			{
				hm.put(arr[i], 1);
			}
			else
			{
				System.out.println(arr[i] +" num already exists in the map");
			}
		}
		//System.out.println(hm);
		for(Map.Entry<Integer, Integer> m:hm.entrySet())
		{
		  System.out.println(m.getKey());	
		}

	}

}
