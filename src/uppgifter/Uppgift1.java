package uppgifter;

public class Uppgift1 {
	public static int addition(int... a) {
		int b = 0;
		for(int c:a)
			b+=c;
		return b;
	}
}
