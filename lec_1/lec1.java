// Реализуйте метод, принимающий в качестве аргументацелочисленный массив.
// Если длина массива меньше некоторого заданного минимума,метод возвращает -1, в качестве кода ошибки, иначе - длину массива.
public class lec1 {
    public static int checkLength(int[] array, int minLen){
        if (array.length < minLen) {
            return -1;
        }
        else{
            return array.length;
        }
    }
    
}