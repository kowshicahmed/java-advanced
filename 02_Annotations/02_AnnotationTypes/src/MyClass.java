import java.lang.reflect.Method;

public class MyClass {
    @MyCustomAnnotation(value = 10)
    public void sayHello() {
        System.out.println("My custom annotation");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        MyClass myClass = new MyClass();

        Method methodVal = myClass.getClass().getMethod("sayHello");

        MyCustomAnnotation myCustomAnnotation = methodVal.getAnnotation(MyCustomAnnotation.class);
        System.out.println("Value is: " + myCustomAnnotation.value());
    }
}
