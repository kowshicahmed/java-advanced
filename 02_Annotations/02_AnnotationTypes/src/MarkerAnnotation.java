import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // when the annotation will be evaluated
@Target(ElementType.TYPE)   // where the annotation will be applied
public @interface MarkerAnnotation {
}
