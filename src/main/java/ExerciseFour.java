import org.testng.annotations.Test;

import java.util.Random;

// Создайте массив из 13 случайных целых чисел из отрезка [-1;1],
// выведите массив на экран в строку.
// Определите какой элемент встречается в массиве чаще всего и выведите
// об этом сообщение на экран (element + count).
public class ExerciseFour {
    public static void main (String args[]){
        int[] array = new int[13];
        Random rand = new Random();
        int i, countLess = 0, countEql = 0, countMore = 0, often = 0, oftenDigit = 0;

        //print array with random elements
        System.out.print("Array: ");
        for (i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*3)-1;
            System.out.print(array[i] + "  ");
        }

        //count number of meets
        for (i = 0; i < array.length; i++) {
            if (array[i] == -1)
                countLess++;
            if (array[i] == 0)
                countEql++;
            if (array[i] == 1)
                countMore++;
        }

        //find max of meets
        if (countLess > countEql && countLess > countMore) {
            often = countLess;
            oftenDigit = -1;
        }
        if (countEql > countLess && countEql > countMore) {
            often = countEql;
            oftenDigit = 0;
        }
        if (countMore > countLess && countMore > countEql) {
            often = countMore;
            oftenDigit = 1;
        }

        if (countLess == countEql && countLess > countMore)
            System.out.print("\nDigits -1 and 0" + " meet " + countLess + " times ");
        else if (countLess == countMore && countLess > countEql)
            System.out.print("\nDigits -1 and 1" + " meet " + countLess + " times ");
        else if (countEql == countMore && countEql > countLess)
            System.out.print("\nDigits 0 and 1" + " meet " + countEql + " times ");
        else
            System.out.println("\nDigit is " + oftenDigit + " meets " + often + " times ");
    }
}
