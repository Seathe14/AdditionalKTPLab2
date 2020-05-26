public class Exercise6 {
    // Сумма следующего элемента равна сумме двух предыдущих
    private static int Fibonacci(int number)
    {
        int n1 = 0, n2 = 1;
        int n3 = 0; // результирующая сумма для фибоначчи
        // До числа number будут считаться числа фибоначчи.
        for(int i =0;i<number;i++)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        return n3;
    }
    public static void main(String []args)
    {
        System.out.println(Fibonacci(3));
        System.out.println(Fibonacci(7));
        System.out.println(Fibonacci(12));
    }
}
