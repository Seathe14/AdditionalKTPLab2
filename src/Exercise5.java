public class Exercise5 {
    private static int getDecimalPlaces(String number)
    {
        int indexOfPoint = 0;
        if(number.indexOf('.') != -1) {
            indexOfPoint = number.indexOf('.');
            return number.length() - indexOfPoint-1; // Возвращаем длину строки(числа) - индекс точки и минус 1, чтобы получить число знаков после точки.
        }
        //System.out.println(Double.parseDouble(number));
        else return 0; // Если точки нет, то возвращаем 0, т.к после точки ничего нет, потому что нет самой точки.
    }
    public static void main(String[] args)
    {
        System.out.println(getDecimalPlaces("43.20"));
        System.out.println(getDecimalPlaces("400"));
        System.out.println(getDecimalPlaces("3.1"));
        System.out.println(getDecimalPlaces("5.350"));

    }
}
