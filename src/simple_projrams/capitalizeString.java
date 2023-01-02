package simple_projrams;

public class capitalizeString {
	
	public static String cap(String st) {
		if(st == null) {
			return st;
		}
		if(st.length()==1) {
			return st.toLowerCase();
		}
		String words[] = st.split("\\s");
		String result ="";
		
		for(String w : words) {
			String first = w.substring(0,1).toUpperCase();
			String sec= w.substring(1);
			result= result+ first+sec +" ";
		}
		return result.trim();
		
	}
	
	
	
	
	
	
	
	public static String cap2(String str) {
		
		String words[] = str.split("\\s");
		String result = "";
		for(String w : words) {
			String first = w.substring(0,1).toUpperCase();
			String sec = w.substring(1);
			
			result += first+sec+" ";
		}
		return result;
		
	}
	
		public static void main(String[] args) {
	String r1= cap("sukumar reddy from hyderabad");
	System.out.println(r1);
	
	String r2= cap2("sukumar reddy from 123 hyderabad");
	System.out.println(r2);
		
	}

}
