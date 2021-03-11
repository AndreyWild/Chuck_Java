package t_10_REGularEXpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Регулярные выражения необходимы для создания
 * шаблонов, с помощью которых производят такие
 * операции, как поиск, сравнение, замена.
 * Регулярные выражения  - это совокупность
 * символов, некоторые из которых являются
 * специальными - метасимволами, т.е. обладают
 * каким-то функционалом.
 */
public class REGEXex2 {
    public static void main(String[] args) {
        String s1 = "ABCD ABCE ABCfABCGABCH";

        /** abc – Соответствует последовательно идущим abc */
        // Создаю Pattern(Шаблон), т.к. констрктор Pattern private, используем compile("рег. выраж")
        Pattern pattern1 = Pattern.compile("ABC");

        // Matcher (находит соответствие)
        Matcher matcher = pattern1.matcher(s1); // ищет в строке шаблон

        while (matcher.find()) { // matcher.find() возвращает true если соответствие было найдено
            System.out.println("Position: " + matcher.start() + " " + matcher.group());
        }
        System.out.println("--------------------------------------------------------");
//        Position: 0 ABC
//        Position: 5 ABC
//        Position: 10 ABC
//        Position: 14 ABC
//        Position: 18 ABC

        /** [abc] – Соответствует или a, или b, или c */
        String s2 = "OPABMC";
        Pattern pattern2 = Pattern.compile("[ABC]");
        Matcher matcher2 = pattern2.matcher(s2);
        while (matcher2.find()) { // matcher.find() возвращает true если соответствие было найдено
            System.out.println("Position: " + matcher2.start() + " " + matcher2.group());}
        System.out.println("--------------------------------------------------------");
//        Position: 2 A
//        Position: 3 B
//        Position: 5 C

        /** [d-j] – Соответствует одной из букв из диапазона d - j */
        String s3 = "ABCOPABDOP";
        Pattern pattern3 = Pattern.compile("AB[C-F]OP"); // Ищет "AB [лбой символ от С до F] OP"
        Matcher matcher3 = pattern3.matcher(s3);
        while (matcher3.find()) { // matcher.find() возвращает true если соответствие было найдено
            System.out.println("Position: " + matcher3.start() + " " + matcher3.group());}
        System.out.println("--------------------------------------------------------");
//        Position: 0 ABCOP
//        Position: 5 ABDOP

        /**
         * [3-8] – Соответствует одной из цифр из диапазона 3-8
         * [B-Fd-j3-8] – Соответствует одной из букв из обоих
         * диапазонов или одной из цифр из диапазона 3 - 8
         */
        String s4 = "abcd abcf abc5abcg6abch";
        Pattern pattern4 = Pattern.compile("abc[e-g4-7]");
        Matcher matcher4 = pattern4.matcher(s4);
        while (matcher4.find()) { // matcher.find() возвращает true если соответствие было найдено
            System.out.println("Position: " + matcher4.start() + " " + matcher4.group());}
        System.out.println("--------------------------------------------------------");
//        Position: 5 abcf
//        Position: 10 abc5
//        Position: 14 abcg

        /**
         * [^d-j] – Данный символ, стоящий в начале этих
         * скобок, означает отрицание. Соответствует одной из
         * букв НЕ из диапазона d - j
         */
        String s5 = "abcd abcf abc5abcg6abch";
        Pattern pattern5 = Pattern.compile("abc[^e-g4-7]"); // ^ любой символ не входящий в указанный иапазон
        Matcher matcher5 = pattern5.matcher(s5);
        while (matcher5.find()) { // matcher.find() возвращает true если соответствие было найдено
            System.out.println("Position: " + matcher5.start() + " " + matcher5.group());}
        System.out.println("--------------------------------------------------------");
//        Position: 0 abcd
//        Position: 19 abch

        /** a|b – Соответствует либо букве a, либо букве b */
        String s6 = "abcd abce abc5abcg6abch";
        Pattern pattern6 = Pattern.compile("abc(e|5)");
        Matcher matcher6 = pattern6.matcher(s6);
        while (matcher6.find()) { // matcher.find() возвращает true если соответствие было найдено
            System.out.println("Position: " + matcher6.start() + " " + matcher6.group());}
//        Position: 5 abce
//        Position: 10 abc5
        System.out.println("--------------------------------------------------------");

        /** . – Соответствует одному любому символу. Исключение: символ новой строки */
        String s7 = "abcd abce abc5abcg6abch";
        Pattern pattern7 = Pattern.compile("abc.");
        Matcher matcher7 = pattern7.matcher(s7);
        while (matcher7.find()) { // matcher.find() возвращает true если соответствие было найдено
            System.out.println("Position: " + matcher7.start() + " " + matcher7.group());}
//        Position: 0 abcd
//        Position: 5 abce
//        Position: 10 abc5
//        Position: 14 abcg
//        Position: 19 abch
        System.out.println("--------------------------------------------------------");

        /** ^ выражение – Соответствует выражению в начале строки*/
        String s8 = "abcd abce abc5abcg6abch";
        Pattern pattern8 = Pattern.compile("^abc"); // ^ любой символ не входящий в указанный иапазон
        Matcher matcher8 = pattern8.matcher(s8);
        while (matcher8.find()) { // matcher.find() возвращает true если соответствие было найдено
            System.out.println("Position: " + matcher8.start() + " " + matcher8.group());}
//        Position: 0 abc
        System.out.println("--------------------------------------------------------");

        /** выражение$ – Соответствует выражению в конце строки */
        String s9 = "abcd abce abc5abcg6abch";
        Pattern pattern9 = Pattern.compile("bch$");
        Matcher matcher9 = pattern9.matcher(s9);
        while (matcher9.find()) { // matcher.find() возвращает true если соответствие было найдено
            System.out.println("Position: " + matcher9.start() + " " + matcher9.group());}
//        Position: 20 bch
        System.out.println("--------------------------------------------------------");

        /**
         *  \d – Соответствует одной цифре
         *  \D – Соответствует одной НЕ цифре
         * */
        String s10 = "abcd abce abc5abcg6abch";
        //Pattern pattern10 = Pattern.compile("\\d"); // вернет все цифры
//        Position: 13 5
//        Position: 18 6
        Pattern pattern10 = Pattern.compile("\\D"); // вернет все символы и пробелы

        Matcher matcher10 = pattern10.matcher(s10);
        while (matcher10.find()) { // matcher.find() возвращает true если соответствие было найдено
            System.out.println("Position: " + matcher10.start() + " " + matcher10.group());}
        System.out.println("--------------------------------------------------------");

        /**
         * \w – Соответствует одной букве, цифре или «_»
         * \W – Соответствует одному символу, который НЕ
         * буква, НЕ цифра и НЕ «_»
         */
        String s11 = "abcd abce abc5abcg6abch";
        Pattern pattern11 = Pattern.compile("\\w"); // [A-Za-z0-9_] вернет все символы но не пробелы
        Matcher matcher11 = pattern11.matcher(s11);
        while (matcher11.find()) { // matcher.find() возвращает true если соответствие было найдено
            System.out.println("Position: " + matcher11.start() + " " + matcher11.group());}

        System.out.println("--------------------------------------------------------");

        /** выражение+ – Соответствует 1 или большему количеству повторений */
        String s12 = "abcd abce abc5abcg6abch";
        Pattern pattern12 = Pattern.compile("\\w+");
        Matcher matcher12 = pattern12.matcher(s12);
        while (matcher12.find()) { // matcher.find() возвращает true если соответствие было найдено
            System.out.println("Position: " + matcher12.start() + " " + matcher12.group());}
//        Position: 0 abcd
//        Position: 5 abce
//        Position: 10 abc5abcg6abch
        System.out.println("--------------------------------------------------------");

        /** \W – Соответствует одному символу, который НЕ буква, НЕ цифра и НЕ «_» */
        String s13 = "abcd!?abce=== abc!!5abc-g6a++bch";
//        Pattern pattern13 = Pattern.compile("\\W"); // возвращает символы
//        Position: 4 !
//        Position: 5 ?
//        Position: 10 =
//        Position: 11 =
//        Position: 12 =
//        Position: 13
//        Position: 17 !
//        Position: 18 !
//        Position: 23 -
//        Position: 27 +
//        Position: 28 +
        Pattern pattern13 = Pattern.compile("\\W+");
        Matcher matcher13 = pattern13.matcher(s13);
        while (matcher13.find()) { // matcher.find() возвращает true если соответствие было найдено
            System.out.println("Position: " + matcher13.start() + " " + matcher13.group());}
//        Position: 4 !?
//        Position: 10 ===
//        Position: 17 !!
//        Position: 23 -
//        Position: 27 ++
        System.out.println("--------------------------------------------------------");

        /** выражение{n} – Соответствует количеству повторений «n» */
        String s14 = "poka abc Dima dom kino 0123456789";
        Pattern pattern14 = Pattern.compile("\\w{4}"); // [A-Za-z0-9_] вернет все символы но не пробелы
        Matcher matcher14 = pattern14.matcher(s14);
        while (matcher14.find()) { // matcher.find() возвращает true если соответствие было найдено
            System.out.println("Position: " + matcher14.start() + " " + matcher14.group());}
//        Position: 9 Dima
//        Position: 18 kino
//        Position: 23 0123
//        Position: 27 4567







    }


}
