package developer;

public class ConvertRational {
	
	public static String GetRational(double a){
		int tenPoly =1;
		while(a*tenPoly - (int)(a*tenPoly) !=0)
		{
			System.out.println((int)(a*tenPoly));
			tenPoly *= 10;
		}
		
		int divident = (int)(a*tenPoly);
		int divisor = tenPoly;		
		int gcd =0;
		if(divident >divisor)
			gcd = GCD(divident,divisor);
		else gcd = GCD(divisor,divident);
		
		divident /= gcd;
		divisor /=gcd;
		
		String output = a+" = ";
		output += divident  + "/"+ divisor;
		return output;
		
		
	}
	
	private static int GCD(int a,int b){
		int remainder = a%b;
		if(remainder == 0)
			return b;
		else
			return GCD(b,remainder);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(GetRational(0.125));

	}

}
