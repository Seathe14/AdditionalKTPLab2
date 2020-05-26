public class Exercise7 {
    private static boolean isValid(String PostIndex)
    {
        // Если длина не равна 5, то возвращаем false
        if(PostIndex.length()!=5)
            return false;
        else
        {
            // Если у нас строковое число парсится в интовое, то возвращаем true
            try
            {
                Integer.parseInt(PostIndex);
                return true;
            }
            // Если эксепшен, то false
            catch(NumberFormatException e)
            {
                return false;
            }
        }
    }
    public static void main(String[] args)
    {
        System.out.println(isValid("59001"));
        System.out.println(isValid("853a7"));
        System.out.println(isValid("732 32"));
        System.out.println(isValid("393939"));
        System.out.println(isValid("60182"));
    }
}
