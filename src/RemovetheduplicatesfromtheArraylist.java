import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class RemovetheduplicatesfromtheArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> alempdetails=new ArrayList<Employee>();
		Employee e1=new Employee(1,"siri","QA");
		Employee e2=new Employee(2,"santhu","Developer");
		Employee e3=new Employee(3,"srihan","Manual Tester");
		Employee e4=new Employee(1,"siri","QA");
		Employee e5=new Employee(4,"san","Manager");
		alempdetails.add(e1);
		alempdetails.add(e2);
		alempdetails.add(e3);
		alempdetails.add(e4);
		alempdetails.add(e5);
		System.out.println("employee details  before removing the duplicates");
		Iterator<Employee> it=alempdetails.iterator();
		while(it.hasNext())
		{
			Employee e=it.next();
			System.out.println(e.empid+"----->"+e.empname+"------>"+e.designation);
		}
		System.out.println("Employee details After removing the duplicates");
		
//		List<Employee> uniqueEmployee=alempdetails.stream().distinct().collect(Collectors.toList());
//		 //it will remove duplicate object, It will check duplicate using equals method
//		for(Employee emp:uniqueEmployee)
//		{
//		 System.out.println(emp.empid+"----->"+emp.empname+"----->"+emp.designation);
//		}
//		HashSet<Employee> hs=new HashSet(alempdetails);
//		for(Employee emp:hs)
//		{
//			System.out.println(emp.empname+"---->"+emp.designation);
//		}
//		
//	
//		ArrayList<Employee> uniqueemployee=new ArrayList<Employee>();
//		for(Employee emp2:alempdetails)
//		{
//			if(!uniqueemployee.contains(emp2));
//			{
//				uniqueemployee.add(emp2);
//			}
//			
//		}
//		System.out.println(uniqueemployee);
//		for(Employee uniqemp:uniqueemployee )
//		{
//			System.out.println(uniqemp.empid+"------>"+uniqemp.empname+"------>"+uniqemp.designation);
//		}
//		
//		LinkedHashSet<Employee> lhs=new LinkedHashSet<Employee>(alempdetails);
//		lhs.addAll(alempdetails);
//		alempdetails.clear();
//		alempdetails.addAll(lhs);
//		for(Employee emp1:lhs)
//		{
//			System.out.println(emp1.empname);
//		}
//		
//	
//		
		List<Employee> finalemplist=removeduplicateemployee(alempdetails);
		if(finalemplist!=null && !finalemplist.isEmpty())
		{
			for(Employee emp1:finalemplist )
			{
				System.out.println(emp1.empid+"----->"+emp1.empname+"------>"+emp1.designation);
			}
		}
		
		

	}
	public static List<Employee> removeduplicateemployee(List<Employee> emplist)
	{
		ArrayList<Employee> uniqemployee=new ArrayList<Employee>();
		for(Employee emp:emplist)
		{
			if(!uniqemployee.contains(emp))
			{
				uniqemployee.add(emp);
			}
		}
		
		return uniqemployee;
		
	}

}


class Employee
{
	int empid;
	
	String empname,designation;
	public Employee(int empid,String empname,String designation)
	{
		this.empid=empid;
		this.empname=empname;
		this.designation=designation;
	}
	 @Override
	    public boolean equals(Object obj) {
	        if (obj instanceof Employee) {
	            return ((Employee) obj).empid == empid;
	        }
	        return false;
	    }
	 @Override
	    public int hashCode() {
	        return this.empid;
	    }
	 }
