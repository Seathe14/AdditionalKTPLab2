public class Exercise3 {
    private static boolean isAvgWhole(int[] array)
    {
        int sumOfIntegers = 0; // считаем сумму чисел массива в цикле
        for(int i =0;i<array.length;i++)
        {
            sumOfIntegers+=array[i];
        }
        // проверяем делится ли сумма без остатка, если да, то true, иначе false
        if(sumOfIntegers%array.length==0)
            return true;
        else return false;
    }
    public static void main(String[] args)
    {
       System.out.println(isAvgWhole(new int[] {1, 3}));
       System.out.println(isAvgWhole(new int[] {1, 2, 3, 4}));
       System.out.println(isAvgWhole(new int[] {1, 5, 6}));
       System.out.println(isAvgWhole(new int[] {1, 1, 1}));
       System.out.println(isAvgWhole(new int[] {9, 2, 2, 5}));
    }
}
