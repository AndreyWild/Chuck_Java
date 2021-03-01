import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        int num = 5;
        int num2 = -5;
        double num3 = 5.0;
        double num4 = -5.0;
        System.out.println(methodInt1(num)); // false
        System.out.println(methodInt1(num2)); // true
        System.out.println(methodDouble(num3)); // false
        System.out.println(methodDouble(num4)); // true

        System.out.println(num < 0);
    }

    public boolean methodInt(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean methodDouble(double a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean methodInt1(int a) {
        return a < 0;
    }




}


class Test{
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.toArray();
    }
}












