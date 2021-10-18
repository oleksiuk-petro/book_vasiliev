/*
    Написати програму, яка записує біноміальні
    коефіцієнти в одновимірний масив.
    C(n,m) = C(n,m-1)*(n-m+1)/m
    C(n,0) = 1
    Оформити відображення у діалоговому вікні.
 */

package UsingArrayApplication;

import javax.swing.JOptionPane;

public class UsingArrayDemo {
    public static void main(String[] args) {
        String input;
        String title = "Біноміальні коефіцієнти";

        //вікно із полем вводу
        input = JOptionPane.showInputDialog(null,
                "Вкажіть значення індексу \"n\"",
                title,
                JOptionPane.INFORMATION_MESSAGE
        );

        //якщо натиснуто "Cancel"
        if (input == null) {
            System.exit(0); //завершення виконання програми
        }

        //індекс біноміального роподілу
        int n = Integer.parseInt(input);

        //коректність вводу
        if (n < 0) {
            JOptionPane.showMessageDialog(null,
                    "Вказано некоректний індекс",
                    title,
                    JOptionPane.ERROR_MESSAGE
            );
            System.exit(0);
        }

        //створення масиву розподілу
        int[] binoms = new int[n + 1];
        binoms[0] = 1;

        //текст для діалогового вікна
        String txt = "Вміст масиву:\n| " + binoms[0] + " | ";

        //розрахунок елементів масиву
        for (int m = 1; m < binoms.length; m++) {
            binoms[m] = binoms[m - 1] * (n - m + 1) / m;
            txt += binoms[m] + " | ";
        }

        //діалогове вікно
        JOptionPane.showMessageDialog(null,
                txt,
                title,
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
