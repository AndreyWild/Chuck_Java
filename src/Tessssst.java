public class Tessssst {
    public static void main(String[] args) {





        String text = "FIFA will never regret it";
        String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");
        for(String word : words){
            System.out.println(word);
        }
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
