public class Exercise2 {
    private static int differenceMaxMin(int[] array)
    {
        // Минимальному элементу присваиваем максимальный
        int min = Integer.MAX_VALUE;
        // Максимальному - минимальный
        int max = Integer.MIN_VALUE;
        // В цикле идем по элементам массива и сравниваем с минимальным и минимальным числом. Такаим образом находим макс и мин. элементы
        for(int i =0;i<array.length;i++)
        {
            if(min > array[i])
                min = array[i];
            if(max < array[i])
                max = array[i];
        }
        return max-min;
    }
    public static void main(String [] args)
    {
        System.out.println(differenceMaxMin(new int[] {10,4,1,4,-10,-50,32,21}));
        System.out.println(differenceMaxMin(new int[] {44,32,86,19}));
    }
}
