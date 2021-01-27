package t4collection.arrayList;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>(); // второй раз <String> можно не указывать
        arrayList1.add("Андрей"); // метод .add() добавляет элемент с конец списка
        arrayList1.add("Саша");
        arrayList1.add("Мася");
        System.out.println(arrayList1); // [Андрей, Саша, Мася]

        ArrayList<String> arrayList2 = new ArrayList<String>(); // второй раз <String> можно не указывать
        arrayList2.add("!!!"); // метод .add() добавляет элемент с конец списка
        arrayList2.add("???");
        arrayList1.addAll(arrayList2); // метод addAll() добавляет все элементы массива из параметра
        System.out.println(arrayList1); // [Андрей, Саша, Мася, !!!, ???]

        arrayList1.addAll(1, arrayList2); // // метод addAll() добавляет все элементы массива
        // из параметра начиная с 1-го индекса
        System.out.println(arrayList1); // [Андрей, !!!, ???, Саша, Мася, !!!, ???]

        arrayList1.clear(); // очищает список
        System.out.println(arrayList1); // []

    }
}
