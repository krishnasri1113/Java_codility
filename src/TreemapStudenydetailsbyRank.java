import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreemapStudenydetailsbyRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,Student1> tm=new TreeMap<Integer,Student1>();
		Student1 s1=new Student1("siri",90,101);
		Student1 s2=new Student1("sai",95,102);
		Student1 s3=new Student1("santhu",76,103);
		Student1 s4=new Student1("sunny",92,104);
		Student1 s5=new Student1("sam",75,105);
		tm.put(1, s1);
		tm.put(2, s2);
		tm.put(3, s3);
		tm.put(4, s4);
		tm.put(5, s5);
		Collection<Integer> keys=tm.keySet();
		Collection<Student1> values=tm.values();
		List<Student1> stdnlist=new ArrayList<Student1>(values);
		Collections.sort(stdnlist,Collections.reverseOrder());
		System.out.println(stdnlist.size());
		int i=1;
		for(Student1 stdnt:stdnlist)
		{
		System.out.println(i+" Rank Student Deatils "+stdnt.studentname+"------>"+stdnt.marks+"---->"+stdnt.studentregno);
			i++;
			if(i==4)
			{
				break;
			}
		}
		

	}
}

class  Student1 implements Comparable<Student1>
{
	String studentname;
	int marks;
   int studentregno;
	
	public Student1(String stdntname,int marks,int stdntregno)
	{
		this.studentname=stdntname;
		this.marks=marks;
		this.studentregno=stdntregno;
	}

	public int compareTo(Student1 o) {
		// TODO Auto-generated method stub
		return this.marks-o.marks;
	}
	
}

	
	
	


