import java.util.Random;

//Найти среднее арифметическое всех элементов массива.
public class ExerciseThree {
    public static void main(String args[]) {
        int[] array = new int[5];
        Random rand = new Random();
        int i, sum = 0;
        double middle = 0d;

        //print array with random elements
        System.out.print("Array: ");
        for (i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100)+1;
            System.out.print(array[i] + " ");
        }

        for (i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        middle = (double)sum / i;
        System.out.print("\nMiddle = " + middle);

    }
}
