import java.util.Arrays;

public class Exercise4 {
    private static int[] cumulativeSum(int[] array)
    {
        int newArr[] = new int [array.length]; // создаю массив размером с размер массива, переданного аргументом
        newArr[0] = array[0]; // присваиваю первому элементу нового массива элемент переданного.
        // в цикле, начиная с 1, начинаю заполнять результирующий массив.
        for(int i = 1;i<array.length;i++)
        {
            for(int j = i;j>=0;j--)
            {
                newArr[i] += array[j];
            }
        }
        return newArr;
    }
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(cumulativeSum(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(cumulativeSum(new int[]{1, -2, 3})));
        System.out.println(Arrays.toString(cumulativeSum(new int[]{3,3,-2,408,3,3})));
    }
}
