package t_7_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("OK");
        list.add("poka");

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
        // создаем второй список типа Integer, чтобы перевести слова в их длину
        List<Integer> list2 =
                // создаем stream() из list
                list.stream()
                        // вызываем метод map() который по очереди берет каждый элемент стрима
                        // и применяет к нему тот лямбда метод, который прописан у него в параметре
                        // (получаем длину элемента) и возвращает другой streame вида 6 9 2 4
                        .map(element -> element.length())
                        // метод преобразовал поток в List
                        .collect(Collectors.toList());
        System.out.println(list);

        int[] array = {5, 9, 3, 8, 1};
        // при помощи вызова метода  stream() из станд. класса Arrays преобр array в stream
        Arrays.stream(array)
                // вызываем метод map() который по очереди берет каждый элемент стрима
                .map(element -> {
                    // если элемент делится на 3 без остатка
                    if (element % 3 == 0) {
                        // то делим элемент на 3 и возвращаем его
                        element = element / 3;
                    }
                    // ксли нет, то возвращаем элемент
                    return element; // 5, 3, 1, 8, 1
                });

    }
}
