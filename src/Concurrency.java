import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class  Concurrency {
	static  volatile int atomicInt = 10;

class Reservation implements Callable<Integer> {
  int seats;
public Reservation(int seats) {

			this.seats = seats;

		}

public Integer call() {

			atomicInt = atomicInt - seats;

			return atomicInt;

		}

	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newFixedThreadPool(4);

		Reservation t1 = new Concurrency().new Reservation(6);

		Reservation t2 = new Concurrency().new Reservation(2);

		Reservation t3 = new Concurrency().new Reservation(2);

		Reservation t4 = new Concurrency().new Reservation(2);

   List<Callable<Integer>> callables = Arrays.asList(

				t1,t2,t3,t4);
   executor.invokeAll(callables).forEach((future)->{

				try {

					int seats = future.get();

					if(seats<1){

						System.out.println(" No more seats available");

					}else{

						System.out.println(seats);

					}

					

				} catch (InterruptedException | ExecutionException e) {

					// TODO Auto-generated catch block

					e.printStackTrace();

	}

			

		});



	}



	}


