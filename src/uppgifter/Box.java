package uppgifter;

public class Box<T> {
	T[] objects;

	public Box(T... temp) {
		objects = temp;
	}

	public static boolean uppgift5(Box a, Box b) {

	//	if (a.objects[0] instanceof b.objects[0].getClass())
			return true;

	//	return false;
	}

	public static void main(String[] args) {
		Box a = new Box(10, 10);
		Box b = new Box(10, 20);

		System.out.println(uppgift5(a, b) ? "ja" : "nej");
	}
}
