import java.util.Random;

//Поменять наибольший и наименьший элементы массива местами.
//Пример: дан массив {3, -7, 0, 6, 9}.
//После замены будет выглядеть {3, 9, 0, 6, -7}.
public class ExerciseTwo {
    public static void main (String args[]) {
        int [] maxmin = new int[5];
        Random rand = new Random();
        int i, min, max, tmp;
        int minLocation = 0, maxLocation = 0;

        //print array with random elements
        System.out.print("Array: ");
        for (i = 0; i < maxmin.length; i++) {
            maxmin[i] = rand.nextInt(50)+1;
            System.out.print(maxmin[i] + " ");
        }

        //find min
        min = maxmin[0];
        for (i = 0; i < maxmin.length; i++) {
            if (maxmin[i] < min) {
                min = maxmin[i];
                minLocation = i;
            }
        }
        System.out.println("\nMin = " + "array[" + minLocation + "] = " + min);

        //find max
        max = maxmin[0];
        for (i = 0; i < maxmin.length; i++) {
            if (maxmin[i] > max) {
                max = maxmin[i];
                maxLocation = i;
            }
        }
        System.out.println("Max = " + "array[" + maxLocation + "] = " + max);

        //replace min and max
        tmp = maxmin[minLocation];
        maxmin[minLocation] = maxmin[maxLocation];
        maxmin[maxLocation] = tmp;
        System.out.print("New Array: ");
        for (i = 0; i < maxmin.length; i++)
            System.out.print(maxmin[i] + " ");
    }
}
