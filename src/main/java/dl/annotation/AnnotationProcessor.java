package dl.annotation;

import java.lang.reflect.Method;

public class AnnotationProcessor {
	
	
	public void process(Object obj) {
		if(obj != null) {
			Class cls = obj.getClass();
			Method[] methods = cls.getMethods();
			
			for(Method method : methods) {
				if(method.getAnnotation(Description.class) != null) {
					System.out.println("method name = "+method.getName());
				}
			}
		}
	}

}
