package t_11_Other.Annotation;

import java.lang.annotation.*;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomiClass = Class.forName("t_11_Other.Annotation.Xiaomi");
        Annotation annotation = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone sm1 = (SmartPhone) annotation;
        System.out.println("Annotation info from Xiaomi class: " +
                sm1.OS() + ", " + sm1.yearCompanyCreation());

        Class iphoneClass = Class.forName("t_11_Other.Annotation.Iphone");
        Annotation annotation2 = iphoneClass.getAnnotation(SmartPhone.class);
        SmartPhone sm2 = (SmartPhone) annotation2;
        System.out.println("Annotation info from Iphone class: " +
                sm2.OS() + ", " + sm2.yearCompanyCreation());

    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME) // Рефлексия работает только с RUNTIME
@interface SmartPhone{
    /** Только примитивы + String */
    String OS(); // поле аннотации
    int yearCompanyCreation() default 2010; // присвоение дефолтного значения
}

@SmartPhone(OS = "Android")
class Xiaomi{
    String model;
    double price;
}

@SmartPhone(OS = "IOS", yearCompanyCreation = 1976)
class Iphone{
    String model;
    double price;
}