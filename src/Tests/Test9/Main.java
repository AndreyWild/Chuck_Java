package Tests.Test9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {
        List<CPU> listCpu = new ArrayList<>();
        CPU cpu1 = new CPU("AMD Ryzen 5 2600", 3.4);
        CPU cpu2 = new CPU("Intel Core i5", 4.3);
        CPU cpu3 = new CPU("Процессор AMD Ryzen 5 5600X", 4.6);
        CPU cpu4 = new CPU("Процессор Intel Core i3", 4.3);
        CPU cpu5 = new CPU("AMD Ryzen 7 3700X", 4.4);
        CPU cpu6 = new CPU("Intel Core i9", 5.0);
        CPU cpu7 = new CPU("AMD Ryzen 5 PRO", 4.2);
        CPU cpu8 = new CPU("AMD FX-6300", 4.1);
        CPU cpu9 = new CPU("AMD Ryzen 9 5950X", 4.9);
        CPU cpu10 = new CPU("AMD Ryzen 5 2600", 3.4);

        Stream<CPU> streamCPU = Stream.<CPU>builder(). // начали создавать стрим через Stream.builder()
                add(cpu1). // добавили объект CPU
                add(cpu2).
                add(cpu3).
                add(cpu4).
                add(cpu5).
                add(cpu6).
                add(cpu7).
                add(cpu8).
                add(cpu9).
                add(cpu10).
                build(). // создали
                distinct(). // вернули стрим без дубликатов
                sorted(new ClockSpeedComparator()). // отсортировали через компаратор по частоте
                filter(cpu -> cpu.getClockSpeed() > 4.0). // отфильтровали частота должна быть больше 4,0 ГГц
                skip(1). // пропускаем первый элемент
                peek(cpu -> cpu.setName(cpu.getName() + "+")); // добавляем к названию "+"


        listCpu = streamCPU.collect(Collectors.toList()); // Преобразовали стрим в коллекцию
        for(CPU cpu : listCpu){
            System.out.println(cpu);
        }






    }
}
