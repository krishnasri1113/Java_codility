import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class convertStringArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr= {"sai","santhu","siri","priya"};
		ArrayList<String> alnames=new ArrayList<String>(Arrays.asList(arr));
		System.out.println("*******method1********");
		//alnames.add("anu");
		//alnames.add("balu");
		for(String str:alnames)
		{
			System.out.println(str);
		}

		String[] arr1= {"sai","santhu","siri","priya"};
		ArrayList<String> alnames1=new ArrayList<String>();
		System.out.println("*******method2********");
		Collections.addAll(alnames1, arr1);
		alnames1.add("anu");
		alnames1.add("balu");
		for(String str:alnames1)
		{
			System.out.println(str);
		}
	}

}
