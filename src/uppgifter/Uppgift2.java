package uppgifter;

public class Uppgift2 {
	public static String uppgift2(String ord, String slut) {
		
		slut += ord.charAt(ord.length()-1);
		
		String a = "";
		for(int i = 0; i < ord.length()-1; i++)
		a+=ord.charAt(i);
		
		if(a.equals(""))
			return slut;
		else
			return uppgift2(a,slut);
	}
}
