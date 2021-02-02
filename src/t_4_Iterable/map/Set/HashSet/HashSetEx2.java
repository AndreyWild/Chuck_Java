package t_4_Iterable.map.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(5);
        set1.add(2);
        set1.add(3);
        set1.add(1);
        set1.add(8);

        Set<Integer> set2 = new HashSet<>();
        set2.add(7);
        set2.add(4);
        set2.add(3);
        set2.add(5);
        set2.add(8);

        Set<Integer> union = new HashSet<>(set1); // объединение
        union.addAll(set2); // объеденяет множества не дублируя одинаковые значения

        Set<Integer> intersect = new HashSet<>(set1); // пересечение
        intersect.retainAll(set2); // возвращает одинаковые значения удаляе разные

        Set<Integer> subtract = new HashSet<>(set1); // разность двух множест
        subtract.removeAll(set2); // возвращает значения у которых нету дубликата

        System.out.println(set1 + "\n" + set2 + "\n" + union + "\n" + intersect + "\n" + subtract);

    }
}
