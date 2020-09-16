import java.util.Arrays;
import java.util.Iterator;

class College {
	 String name;
	 int Id;
	 public College(int id,String name)
	 {
		 this.Id=id;
		 this.name=name;
	 }
	@Override
	public String toString() {
		return "College [name=" + name + ", Id=" + Id + "]";
	}
	 

}
class customArraylist<E>
{
	private static final int INITIAL_CAPACITY =15;
	private Object elmentArray[]= {};
	private int size=0;
	
	public customArraylist()
	{
		elmentArray=new Object[INITIAL_CAPACITY];
	}
	public void add(E e)
	{
		if(size==elmentArray.length)
		{
		ensurecapacity();
		}
		elmentArray[size++]=e;
	}
	public Object remove(int index)
	{
		if(index < 0 || index >=size)
		{
			throw new IndexOutOfBoundsException("Index out of bound exception. Please provide valid index");
		}
		Object removedElement=elmentArray[index];
	    for(int i=index;i<size - 1;i++){
	    	elmentArray[i]=elmentArray[i+1];
	    }
	    size--;   
	    return removedElement;
	}
	private void ensurecapacity() {
		// TODO Auto-generated method stub
		int newIncreasedCapacity = elmentArray.length * 2;
	    elmentArray = Arrays.copyOf(elmentArray, newIncreasedCapacity);
		
	}
	public void display() {
	      System.out.print("College details in the ArrayList : ");
	      for(int i=0;i<size;i++){
	             System.out.print(elmentArray[i]+" ");
	      }
	}
}
public class customArraylistwithAddandRemove
{
	public static void main(String[] args) {
		customArraylist<College> calist=new customArraylist<College>();
		calist.add(new College(1,"sbce"));
		calist.add(new College(2,"sbit"));
		calist.add(new College(3,"bomma"));
		calist.add(new College(4,"kits"));
		calist.add(new College(5,"vijaya"));
		calist.display();
		//Iterator<College> it=calist.iterator();
		 System.out.println("college removed from index "+4+" = "+calist.remove(4));
		//calist.remove(4);
		calist.display();
		
		
	}
}
	
	

