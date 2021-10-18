/*
    Програма створює двовимірний масив
    у вигляді таблиці множення.
 */

package MultiplicationTableApplication;

public class MultiplicationTableDemo {
    public static void main(String[] args) {
        int rows = 10; //кількість рядків
        int cols = 10; //кількість стовпчиків
        int[][] table = new int[rows][cols]; //двовимірний масив

        //перший рядок таблиці
        String txt = "\t|\t";
        for (int i = 1; i <= cols; i++) {
            txt += i + "\t";
        }

        //перехід на наступний рядок
        txt += "\n";

        //рядок дефісів
        for (int i = 1; i <= 10 + 4 * cols; i++) {
            txt += "-";
        }

        //заповнення масиву-таблиці
        for (int i = 0; i < table.length; i++) {
            //текст на початку кожних наступних рядків таблиці
            txt += "\n" + (i + 1)+ "\t|\t";
            //подальше заповнення рядка
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (i + 1) * (j + 1);
                txt += table[i][j] + "\t";
            }
        }

        //відображення таблиці множення у консольному вікні
        System.out.println("Таблиця множення:");
        System.out.println(txt);
    }
}
