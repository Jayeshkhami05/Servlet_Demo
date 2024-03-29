package servletcookie;

public class A {
	private static A a;

	private A() {

	}

	public static A getobject() {

		if (a != null) {
			return a;
		} else {
			a = new A();
			return a;
		}
	}

	
}
