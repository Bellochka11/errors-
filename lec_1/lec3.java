// Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
// Необходимо посчитать и вернуть сумму элементов этого массива.
// При этом накладываем на метод 2 ограничения: метод может работать только с
// квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать
// только значение 0 или 1.
// Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об
// ошибке.

public class lec3 {
    public static void main(String[] args) {
        int[][] test = { { 1, 0, 1 }, { 1, 11, 1 }, { 0, 0, 0 } };
        System.out.println(sumArray2D(test));
        // try{
        // System.out.println(sumArray2D(test));
        // }catch(RuntimeException e){
        // System.out.println(e.getMessage());
        // }
    } 

    public static int sumArray2D(int[][] array) {

        int sum = 0;
        for (int[] i : array) {
            if (array.length != i.length)
                throw new RuntimeException("Массив не квадратный,размеры массива: " + array.length + "x" + i.length);
            for (int j : i) {
                if (j != 0 && j != 1)
                    throw new RuntimeException("Значение не 0 и не 1");
                sum += j;
            }
        }
        return sum;
    }
}
