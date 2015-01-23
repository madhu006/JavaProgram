package developer;


public class EnumDemo2 {

	public enum EnumStutus {
		PENDING("P"), ACTIVE("A"), INACTIVE("I"), DELETED("D");
	 
		private String statusCode;
	 
		private EnumStutus(String s) {
			statusCode = s;
		}
	 
		public String getEnumDemo2() {
			return statusCode;
		}
	 
	}
	
	
	
	public static void main(String[] args) {
		 
		System.out.println(EnumStutus.ACTIVE.getEnumDemo2());
 
	}	

}

