package uppgifter;

public class Box <T>{
	T[] objects;
	public Box(T... temp) {
		objects = temp;
	}
}
