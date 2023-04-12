//Пусть дан список сотрудников:
//Иван Иванов
//Светлана Петрова
//Кристина Белова
//Анна Мусина
//Анна Крутова
//Иван Юрин
//Петр Лыков
//Павел Чернов
//Иван Иванов
//Петр Чернышов
//Мария Федорова
//Марина Светлова
//Мария Савина
//Иван Иванов
//Мария Рыкова
//Анна Крутова
//Марина Лугова
//Анна Владимирова
//Петр Лыков
//Иван Мечников
//Петр Петин
//Петр Лыков
//Иван Ежов
//Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
package Homework5;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Task52 {
    public static void name() {
        Map<Integer, String> listpeople = new HashMap<>();
        Map<String, Integer> listpeople1 = new HashMap<>();
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Иван Иванов", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов",
                "Иван Иванов","Петр Чернышов","Мария Федорова", "Марина Светлова", "Мария Савина", "Иван Иванов", "Мария Рыкова", "Анна Крутова",
                "Марина Лугова", "Анна Владимирова", "Петр Лыков", "Иван Мечников", "Петр Петин", "Петр Лыков", "Иван Ежов");

        int i = 0;
        for (var item : list) {

            listpeople.put(i, item.split(" ")[0]);
            i++;
        }
        System.out.println(listpeople);

        for (String name : list) {
            int j = 0;
            int k = 0;
            var name1 = name.split(" ")[0];
            for (String item1 : listpeople.values()) {
                if (name1.equals(item1)) {
                    k++;
                }
            }
            listpeople1.put(name1, k);

        }
        System.out.println(listpeople1);

//        Map<String, Integer> map =
//                Map.of("Анна", 3, "Борис", 2, "Вова", 2, "Гена", 5, "Дима", 1);
        Map<String, Integer> result = new LinkedHashMap<>();

        List<Map.Entry<String, Integer>> entries = new LinkedList<>(listpeople1.entrySet());
        entries.sort(comparator); // Comparator.comparing(o -> (o.getValue())) OR Map.Entry.comparingByValue()


        for (Map.Entry<String, Integer> entry : entries) {
            result.put(entry.getKey(), entry.getValue());
        }

        System.out.println(result);
    }

    static Comparator<Map.Entry<String, Integer>> comparator = new Comparator<>() {
        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            return o1.getValue().compareTo(o2.getValue());
        }
    };
}





