package t_10_REGularEXpressions;

import java.util.regex.Pattern;

public class RegExEx6 {
    void checkIP(String ip){
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                "(25[0-5]|2[0-4]\\d |[01]?\\d?\\d)";

        // 25[0-5]      |   2[0-4]\d    |       [01]?\d?\d   (\.)  {3} 3 раза
        // (250-255)    |   200-249     |       0-199           .



        System.out.println(ip + " is OK? " + Pattern.matches(regex, ip));
    }

    public static void main(String[] args) {
        //0-225.0-225.0-225.0-255
        String ip1 = "255.38.192.99";
        String ip2 = "182.262.91.05";
        RegExEx6 r6 = new RegExEx6();
        r6.checkIP(ip1);
        r6.checkIP(ip2);




    }
}
