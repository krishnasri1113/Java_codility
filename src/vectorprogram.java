import java.util.Iterator;
import java.util.Vector;

public class vectorprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Vector<Character> vect=new Vector<Character>();
            vect.add('t');
            vect.add('e');
            vect.add('k');
            vect.add('a');
            vect.add('r');
            vect.add('c');
            vect.add('h');
            //System.out.println(vect);
            System.out.println("String in vector is ");
            Iterator<Character> it=vect.iterator();
            while(it.hasNext())
            {
            	System.out.print(it.next());
            }
            System.out.println(" ");
            for(int i=0;i<5;i++)
            {
            	vect.add(3, 'Z');
            }
            System.out.println("insert 5 charcters into vector ");
            Iterator<Character> it1=vect.iterator();
            while(it1.hasNext())
            {
            	System.out.print(it1.next());
            }
            System.out.println(" ");
            for(int i=0;i<5;i++)
            {
            	vect.remove(6);
            }
            System.out.println("removing 5 characters from 6th postion");
            for(Character ch:vect)
            {
            	System.out.print(ch);
            }
            
            
           
	}

}
