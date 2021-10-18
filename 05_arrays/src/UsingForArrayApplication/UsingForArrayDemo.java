/*
    Створити цілочисловий масив.
    Заповнити його випадковими числами
    (в діапазоні значень 1...10).
    Вміст масиву відобразити в діалоговому вікні.
 */

package UsingForArrayApplication;

import javax.swing.JOptionPane;
import java.util.Random;

public class UsingForArrayDemo {
    public static void main(String[] args) {
        int size = 10;
        Random rnd = new Random();
        int[] nums = new int[size];
        String txt = "Масив випадкових чисел:\n| ";

        //заповнення масиву випадковими числами
        for (int k = 0; k < nums.length; k++) {
            nums[k] = rnd.nextInt(10) + 1;
            txt += nums[k] + " | ";
        }

        //доповнення текстового значення
        txt += "\nПеревірка:\n| ";

        //цикл за колекцією
        for (int s : nums) {
            txt += s + " | ";
        }

        //діалогове вікно з відображеними масивами
        JOptionPane.showMessageDialog(null,
                txt,
                "Випадкові числа",
                JOptionPane.PLAIN_MESSAGE
        );
    }
}
