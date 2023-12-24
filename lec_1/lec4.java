// Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
// Метод должен пройтись по каждому элементу и проверить что он не равен null.
// А теперь реализуйте следующую логику:
// Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
// Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

import java.util.ArrayList;
import java.util.List;

public class lec4 {
    public static void checkArray(Integer[] arr){
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                list1.add(i);
            }
        }
        if (!list1.isEmpty()) {
            throw new RuntimeException("null встретились в нескольких ячейках" + list1);
        }
    }
}
