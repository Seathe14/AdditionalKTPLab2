public class Exercise10 {
    private static int boxSeq(int step)
    {
        // шаг 0, присваием результату 0
        int result = 0;
        for(int i =0;i<step;i++)
        {
            // Если шаг делится на 2 без остатка, то прибавляем 3, если нет, то вычитаем 1
            if(i%2 == 0)
                result +=3;
            else if(i%2 == 1)
                result -=1;
        }
        return result;
    }
    public static void main(String[] args)
    {
        System.out.println(boxSeq(0));
        System.out.println(boxSeq(1));
        System.out.println(boxSeq(2));
        System.out.println(boxSeq(3));
        System.out.println(boxSeq(4));
    }
}
