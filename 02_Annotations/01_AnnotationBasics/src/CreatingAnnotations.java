import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CreatingAnnotations {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        @SuppressWarnings("unused")
        Cat myCat = new Cat("Stella");

        if (myCat.getClass().isAnnotationPresent(VeryImportant.class))
            System.out.println("This class is very important");

        for(Method method : myCat.getClass().getDeclaredMethods()) {
            if(method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                for(int i = 0; i < annotation.times(); i++)
                    method.invoke(myCat);
            }
        }

        for (Field field : myCat.getClass().getDeclaredFields()) {
            if(field.isAnnotationPresent(ImportantString.class)) {
                Object objectValue = field.get(myCat);
                // if objectValue is instance of String put the value to stringValue
                if(objectValue instanceof String stringValue) {
                    System.out.println(stringValue.toUpperCase());
                }
            }
        }
    }
}
