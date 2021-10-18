/*
    Створити двовимірний масив з рядками різної довжини.
    Масив заповнюється числами в алфавітному порядку.
    Кількість елементів у різних рядках визначається
    значеннями елементів в іншому цілочисловому масиві.
 */

package Using2DCharArrayApplication;

import javax.swing.*;

public class Using2DCharArrayDemo {
    public static void main(String[] args) {
        int[] size = {3, 12, 4, 7}; //алфавіт - це 4 різних рядка
        char[][] symbs = new char[size.length][];
        char s = 'A';
        String txt = "";

        for (int i = 0; i < symbs.length; i++) {
            symbs[i] = new char[size[i]]; //рядок
            for (int j = 0; j < symbs[i].length; j++) {
                symbs[i][j] = s;
                s++;
                txt += "| " + symbs[i][j] + " ";
            }
            txt += "|\n";
        }

        JOptionPane.showMessageDialog(null,
                txt,
                "Масив з рядками різної довжини",
                JOptionPane.PLAIN_MESSAGE,
                new ImageIcon("src/pictures/wolf.jpg"));
    }
}
