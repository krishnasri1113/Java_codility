import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class parkedvehicleinformation {
  public static void main(String[] args) {
	  ArrayList<vehicle1> v1=new ArrayList<vehicle1>();
	  v1.add(new vehicle1("honda","7ldf558",20));
	  v1.add(new vehicle1("bmw","7abc558",15));
	  v1.add(new vehicle1("Audi","7egf567",90));
	  ArrayList<vehicle2> v2=new ArrayList<vehicle2>();
	  v2.add(new vehicle2("Tesla","8rst678",45));
	  v2.add(new vehicle2("porche","6jhf546",60));
	  v2.add(new vehicle2("ferari","9hfh776",50));
	  //merging two vehicles
	  //v1.addAll(v2);
	  ArrayList<vehicle3> v3= new ArrayList<vehicle3>();
     // v3.addAll(v1);
     // v3.addAll(v2);

	  Collections.sort(v1,Collections.reverseOrder());
	  System.out.println("highest parked hour vehicle information is");
	  for(vehicle1 v:v1)
	  {
		  System.out.println(v.vehiclemodel+"----->"+v.vehiclenumber+"----->"+v.parkedhours);
		  break;
	  }
	  
	
}
}
  
  class vehicle1 
  {
	  String vehiclemodel;
	  String vehiclenumber;
	  float parkedhours;
	  public vehicle1(String vehiclemodel,String vehiclenumber,float parkedhours)
	  {
		  this.vehiclemodel=vehiclemodel;
		  this.vehiclenumber=vehiclenumber;
		  this.parkedhours=parkedhours;
		}
	
  }
  
  class vehicle2
  {
	  String vehiclemodel;
	  String vehiclenumber;
	  float parkedhours;
	  public vehicle2(String vehiclemodel,String vehiclenumber,float parkedhours)
	  {
		  this.vehiclemodel=vehiclemodel;
		  this.vehiclenumber=vehiclenumber;
		  this.parkedhours=parkedhours;
		}
  }
  class vehicle3 implements Comparable<vehicle3>
  {
	  String vehiclemodel;
	  String vehiclenumber;
	  float parkedhours;
	  public vehicle3(String vehiclemodel,String vehiclenumber,float parkedhours)
	  {
		  this.vehiclemodel=vehiclemodel;
		  this.vehiclenumber=vehiclenumber;
		  this.parkedhours=parkedhours;
		}
	public int compareTo(vehicle3 v) {
		// TODO Auto-generated method stub
		return (int) ((float) this.parkedhours-v.parkedhours);
	}
  }
