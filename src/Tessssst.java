public class Tessssst {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        p1.display();
        p2.display();
        p3.display();




//        p1.setA(1);
//        System.out.println(p1.getA() + " " + p2.getA() + " " + p3.getA());
//        p2.setA(2);
//        System.out.println(p1.getA() + " " + p2.getA() + " " + p3.getA());
//        p3.setA(3);
//        System.out.println(p1.getA() + " " + p2.getA() + " " + p3.getA());
//
//        Pars pa1 = new Pars(1);
//        Pars pa2 = new Pars(2);
//        Pars pa3 = new Pars(3);
//        System.out.println(pa1.getA() + " " + pa2.getA() + " " + pa3.getA());






//        String text = "FIFA will never regret it";
//        String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");
//        for(String word : words){
//            System.out.println(word);
//        }
//        FIFA
//        will
//        never
//        regret
//        it


//        String str1 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
//        System.out.println(str1); // hello
//        char[] helloArray = str1.toCharArray();
//        System.out.println(helloArray); // hello

//        String str1 = "Java";
//        String str2 = "Hello";
//        str2 = str2.concat(str1); // HelloJava

//        String str1 = "Java";
//        String str2 = "Hello";
//        String str3 = String.join(" ", str2, str1); // Hello Java

//        boolean regionMatches(int toffset, String other, int oofset, int len)
//        boolean regionMatches(boolean ignoreCase, int toffset, String other, int oofset, int len)
//
//        String str1 = "Hello world";
//        String str2 = "I work";
//        boolean result = str1.regionMatches(6, str2, 2, 3);
//        System.out.println(result); // true
    }
}

class Person {
    private int id;
    static int counter;
    static {counter = 105;
        System.out.println("Инициализировали");}

    public Person() {
        id = counter++;
    }
    public static void display(){

        System.out.println("id: ");
    }
}


class Pars{
    final int a;

    public Pars(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
}