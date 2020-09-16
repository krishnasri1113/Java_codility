
public class customstack {
	private int arr[];
	private int top;
	private int capacity;
	
	customstack(int size)
	{
		arr=new int[size];
		capacity=size;
		top=-1;
	}
	public void push(int a)
	{
		if(isFull())
		{
			System.out.println("overflow program terminated");
			System.exit(1);
		}
		System.out.println("Inserting "+a);
		arr[++top]=a;
	}
	public int pop() {
		if(isEmpty())
		{
			System.out.println("underflow program terminated");
			System.exit(1);
		}
		System.out.println("removing "+peek());
		return arr[top--];
	}
	private int peek() {
		// TODO Auto-generated method stub
		if(!isEmpty())
		{
			return arr[top];
		}
		else
		{
			System.out.println("stack is empty ,no top element in the stack");
			System.exit(1);
		}
	return -1;
	}
	public int size()
	{
		return top + 1;
	}
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}
	private boolean isFull() {
		// TODO Auto-generated method stub
		return top==capacity -1;
	}
	
	public static void main(String[] args) {
		customstack stack=new customstack(3);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		//stack.pop();
		//stack.pop();
		System.out.println("top element is "+stack.peek());
		System.out.println("stack sizes is "+stack.size());
		
		if(stack.isEmpty())
		{
			System.out.println("stack is empty");
			
		}
		else
		{
			System.out.println("stack is not empty");
		}
	}

}
