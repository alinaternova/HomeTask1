//Создайте массив, содержащий 10 первых нечетных чисел.
//Выведете элементы массива на консоль в одну строку, разделяя запятой.
public class ExerciseOne {
    public static void main (String args[]) {
        int[] oddDigits = new int [10];
        int i;
        oddDigits[0] = 1;
        //System.out.print(oddDigits.length);
        for (i = 1; i < oddDigits.length; i++) {
            oddDigits[i] = oddDigits[i-1]+2;
            System.out.print(oddDigits[i-1] + ", ");
        }
        oddDigits[oddDigits.length-1] = oddDigits[oddDigits.length-2] + 2;
        System.out.print(oddDigits[oddDigits.length-1]);
    }
}
