import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistwithAddandRemoveMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<student2> aldetails=new ArrayList<student2>();
		student2 s1=new student2(1,"siri",28);
		student2 s2=new student2(2,"sai",23);
		student2 s3=new student2(3,"anu",26);
		student2 s4=new student2(4,"chintu",34);
		aldetails.add(s1);
		aldetails.add(s4);
		aldetails.add(s3);
		aldetails.remove(s2);
		
		Iterator<student2> it=aldetails.iterator();
		while(it.hasNext())
		{
			student2 s=it.next();
			System.out.println("Student Id is "+s.ID+" and name is "+s.stdntname+" and age is "+s.Age);
		}

	}
}
	
	class  student2
	{
		int ID,Age;
		String stdntname;
		public student2(int id,String name,int age)
		{
			this.ID=id;
			this.stdntname=name;
			this.Age=age;
		}
		
	}


