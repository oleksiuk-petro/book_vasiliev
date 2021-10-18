/*
    В користувальницькому класі MyPane успадковується
    бібліотечний клас JOptionPane.
 */

package ExtendingJOptionPaneApplication;

public class ExtendingJOptionPaneDemo {
    public static void main(String[] args) {
        //відображення діалогового вікна з повідомленням
        MyPane.showMessage("Всім привіт!");

        //відображення діалогового вікна з полем уводу
        //і зчитування цілочислового значення
        int number = MyPane.getInteger("Уведіть ціле число");

        //текст для відображення у діалоговому вікні
        String txt = "Числа від 1 до " + number + ":\n";
        //формування послідовності чисел
        for (int k = 1; k <= number; k++) {
            txt += k + "  ";
        }
        //діалогове вікно з повідомленням
        MyPane.showMessage(txt, "Цілі числа");
    }
}
