package t4collection.arrayList;

import java.util.ArrayList;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>(); // второй раз <String> можно не указывать
        arrayList1.add("Андрей"); // метод .add() добавляет элемент с конец списка
        arrayList1.add("Саша");
        arrayList1.add("Мася");
        arrayList1.add("Дима");
        arrayList1.add("Андрей");

        ArrayList<String> arrayList2 = new ArrayList<String>(); // второй раз <String> можно не указывать
        arrayList2.add("Андрей"); // метод .add() добавляет элемент с конец списка
        arrayList2.add("Саша");
        arrayList2.add("Мария");

        // arrayList1.removeAll(arrayList2); // метод оставляет в списке элементы массива которые сходятся в массивом из параметра
        System.out.println(arrayList1); // [Мася, Дима]

        arrayList1.retainAll(arrayList2); // метод удаляет элементы массива которые сходятся в массивом из параметра
        System.out.println(arrayList1); // [Андрей, Саша, Андрей]

    }
}
