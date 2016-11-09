
public class ReverseString {

	public String reverseString(String s){
	    if (s.length() == 0) 
	         return s;
	    //System.out.println(s);

	    return reverseString(s.substring(1)) + s.charAt(0);

	}
	
	public String reverseString2(String s){
	    if (s.length() == 0) 
	         return s;
	   // System.out.println(s);
	    return s.charAt(s.length() - 1) + reverseString2(s.substring(0, s.length() - 1));

	}
	

	public static void main(String[] args) {

		ReverseString rs = new ReverseString();
		System.out.println(rs.reverseString("Ian"));
		System.out.println(rs.reverseString2("TacoCat"));

	}

}
