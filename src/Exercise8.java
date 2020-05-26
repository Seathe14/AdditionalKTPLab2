public class Exercise8 {
    private static boolean isStrangePair(String first,String second)
    {
        //Если длина больше нуля, то сравниваем
        if(first.length()>0 && second.length() > 0 ) {
            if (first.charAt(0) == second.charAt(second.length() - 1) && first.charAt(first.length()-1) == second.charAt(0))
                return true;
           // else return false;
        }
        else
        {

            if (first.compareTo(second) == 0)
                return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        System.out.println(isStrangePair("ratio","orator"));
        System.out.println(isStrangePair("sparkling","groups"));
        System.out.println(isStrangePair("bush","hubris"));
        System.out.println(isStrangePair("hubris","hubris"));
        System.out.println(isStrangePair("noga","aruk"));
        System.out.println(isStrangePair("",""));
    }
}
