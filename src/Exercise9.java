public class Exercise9 {
    private static boolean isPrefix(String firstString, String prefix)
    {
        //Проверяем, если знак - стоит в конце префикса
        if(prefix.indexOf('-') == prefix.length()-1)
        {
            // проверяем, есть ли в строке firstString подстрока prefix
            int fsp = firstString.indexOf(prefix.substring(0,prefix.length()-1));
            if(fsp == 0)
                return true; // Если результат равен 0(т.е строка начинается с префикса), то возвращаем true
        }
        return false;
    }
    private static boolean isSuffix(String firstString, String suffix)
    {
        //Проверяем, если знак - стоит в начале суффикса
        if(suffix.indexOf('-') == 0)
        {
            // проверяем, есть ли в строке firstString подстрока suffix
            int firstStringSuffix = firstString.indexOf(suffix.substring(1));
            if(firstStringSuffix == firstString.length()-suffix.length() + 1)
                return true; // Если результат найден в конце(как суффикс), то возвращаем true
        }
        return false;
    }
    public static void main(String[] args)
    {
        System.out.println(isPrefix("automation","auto-"));
        System.out.println(isPrefix("autodasd","auto-"));
        System.out.println(isPrefix("tobasco","toba-"));
        System.out.println(isPrefix("tobasco","bas-"));
        System.out.println(isPrefix("retrospect","sub-"));
        System.out.println(isSuffix("arachnophobia","-phobia"));
        System.out.println(isSuffix("vocation","-logy"));
        System.out.println(isSuffix("vocation","-ation"));
    }
}
