public class Exercise1 {

   private static String repeat(String word, int times)
   {
       String answer = "";
       for(int i =0;i<word.length();i++)
       {
           for(int j =0;j<times;j++)
           {
               answer += word.charAt(i);
           }
       }
       return answer;
   }
    public static void main(String[] args)
    {
        System.out.println(repeat("mice",5));
        System.out.println(repeat("hello",3));
        System.out.println(repeat("stop",2));
    }
}
