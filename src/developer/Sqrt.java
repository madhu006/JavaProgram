package developer;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("sqrt of 50 is" + sqrt(50));
		System.out.println("sqrt of 20 is" + sqrt(20));
		System.out.println("sqrt of 0.34 is" + sqrt(0.34));
		System.out.println("sqrt of 99 is" + sqrt(99));

	}
	
	public static double sqrt(double a)
	{
		if(a<0)
			return -1;
		if(a==0|| a==1)
			return a;
		
		double precision =0.00001;
		double start =0;
		double end =a;
		
		if(a<1)
			end =1;
		while(end-start>precision)
		{
			double mid = (start+end)/2;
			double midSqr = mid*mid;
			if(midSqr == a)
				return mid;
			else if(midSqr<a)
				start =mid;
			else
				end =mid;
			
		}
		return (start+end)/2;
	}

}
