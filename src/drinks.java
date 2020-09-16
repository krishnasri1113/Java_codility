import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class drinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("coco", 1);
		hm.put("pepsi", 2);
		hm.put("lassi", 4);
		hm.put("soda", 3);
		for(Entry<String,Integer> m:hm.entrySet())
		{
			int quantity=m.getValue();
		if(m.getKey()=="pepsi" && quantity>1)
		{
			hm.put("pepsi", quantity-1);
		}
		else
		{
			System.out.println("no avaliability");
		}
		//System.out.println(hm);
		
	}
		for(Map.Entry<String, Integer> m1:hm.entrySet())
		{
			if(m1.getValue()>=1)
			{
				System.out.println(m1.getKey()+"=====>"+m1.getValue());
			}
		}


}
}
