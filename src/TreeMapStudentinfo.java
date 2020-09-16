import java.util.Map;
import java.util.TreeMap;

public class TreeMapStudentinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,Student> tm=new TreeMap<Integer,Student>();
		Student s1=new Student("siri",101);
		Student s2=new Student("sai",102);
		Student s3=new Student("santhu",103);
		Student s4=new Student("sunny",104);
		Student s5=new Student("sam",105);
		Student s6=new Student("sudha",106);
		tm.put(1, s1);
		tm.put(2, s2);
		tm.put(3, s3);
		tm.put(4, s4);
		tm.put(5, s5);
		tm.put(6, s6);
		
		for(Map.Entry<Integer, Student> m:tm.entrySet())
		{
			int key=m.getKey();
			Student s=m.getValue();
			System.out.println(key+" Details");
			System.out.println(s.studentname+"----->"+s.studentregno);
		}
		

	}
}

class  Student
{
	String studentname;
   int studentregno;
	
	public Student(String stdntname,int stdntregno)
	{
		this.studentname=stdntname;
		this.studentregno=stdntregno;
	}
	
}

	
	
	
	
