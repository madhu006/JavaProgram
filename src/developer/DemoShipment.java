package developer;


/**
 * @author Madhulika
 * This program demo multilevel inheritance.
 */

	
	class Box {
		private double width;
		private double height;
		private double depth;
		
		Box(Box ob){
			width = ob.width;
			height = ob.height;
			depth = ob.depth;
		}
		Box(double w, double h, double d){
			width =w;
			height = h;
			depth = d;
		}
		Box(double len){
			width = height = depth = len;
		}
		Box(){
			width =-1;
			height =-1;
			depth = -1;
		}
		double volume(){
			return width*height*depth;
		}
	}
	
	class BoxWeight extends Box {
		private double weight;
		BoxWeight(BoxWeight ob){
			super(ob);
			weight = ob.weight;
		}
		BoxWeight(double w,double h,double d, double wt){
			super(w,h,d);
			weight = wt;
		}
		BoxWeight(){
			super();
			weight =-1;
		}
		BoxWeight(double len,double m){
			super(len);
			weight = m;
		}
	}
	class Shipment extends BoxWeight{
		double cost;
		Shipment(Shipment ob){
			super(ob);
			cost = ob.cost;
		}
		Shipment(double w, double h, double d, double wt, double c){
			super(w,h,d,wt);
			cost =c;
		}
		Shipment(){
			super();
			cost = -1; 
		}
		Shipment(double len, double m, double c){
			super(len,m);
			cost =c;
		}
		
	}

	public class DemoShipment {
	public static void main(String[] args) {
			
		Shipment shipment2 = new Shipment(2,3,4,0.76,1.28);
		
		double vol;
		
		vol = shipment2.volume();
		
		System.out.println("volume is " + vol);
		System.out.println("weight is " +shipment2.cost);
	}

}
