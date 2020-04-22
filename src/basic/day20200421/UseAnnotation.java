package basic.day20200421;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class UseAnnotation {

    private void check(String method, int num) throws Exception {
        int max;
        int min;
        Class cls = UseAnnotation.class;
        Method thisMethod = cls.getMethod(method, int.class);
//        if(thisMethod.isAnnotationPresent(MyAnno.class))
        MyAnno annotation = thisMethod.getAnnotation(MyAnno.class);
        max = annotation.max();
        min = annotation.min();
        if (num < min || num > max) {
            throw new Exception("arguments error");
        }
    }

    @MyAnno(max=100)
    public void seats(int num) throws Exception {
        check("seats", num);
    }
}
