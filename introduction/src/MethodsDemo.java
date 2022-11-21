
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println(name);
		MethodsDemo2 d1 = new MethodsDemo2();
		System.out.println(d1.getUserData());
	}
	
	public String getData() {
		System.out.println("Hello World!");
		return "Deneme ";
	}

}
