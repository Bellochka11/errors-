// Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое
// значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом,
// например:
// 1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в
// качестве кода ошибки.
// 2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
// 3. если вместо массива пришел null, метод вернет -3
// 4. придумайте свои варианты исключительных ситуаций и верните соответствующие
// коды ошибок.
// Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот
// метод запросит искомое число у пользователя, вызовет первый, обработает возвращенное
// значение и покажет читаемый результат пользователю. Например, если вернулся -2,
// пользователю выведется сообщение: “Искомый элемент не найден”.

public class lec2 {
public static void main(String[] args) {
int[] test = new int[]{1,2,3,4,5,6};
findIndexElementMessage(test, 3, 7);
findIndexElementMessage(test, 7, 3);
findIndexElementMessage(null, 7, 3);
findIndexElementMessage(test, 4, 3);
}
public static int findIndexElement(int[] array, int value, int minLen){
if(null == array)
return -3;
if(array.length < minLen)
return -1;
for (int i = 0; i < array.length; i++) {
if(array[i] == value)
return i;
}
return -2;
}

public static void findIndexElementMessage(int[] array, int value, int minLen){
int result = findIndexElement(array,value,minLen);
if(result == -1) {
System.out.println("Длина массива меньше некоторого заданного минимума");
return;
}
if(result == -2){
System.out.println("Искомый элемент не найден");
return;
}
if(result == -3){
System.out.println("Bместо массива пришел null");
return;
}
if(result >= 0)
System.out.println("Индекс искомого элемента: " + result);
}
}
