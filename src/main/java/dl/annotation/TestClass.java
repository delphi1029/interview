package dl.annotation;

public class TestClass {
	
	@Description
	public void myMethod(String name) {
		
		System.out.println("Hello "+name);
	}
	
	
	public static void main(String[] args) {
		TestClass t = new TestClass();
		AnnotationProcessor ap = new AnnotationProcessor();
		ap.process(t);
		t.myMethod("Deepak");
		
	}

}
