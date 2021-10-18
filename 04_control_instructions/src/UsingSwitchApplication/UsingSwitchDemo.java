/*
    Написати програму, де за номером повертається день тижня.
    Разом з номером дня повертається значення: будній чи вихідний.
    Виконатипрограму за допомогою оператора вибору.
 */

package UsingSwitchApplication;

public class UsingSwitchDemo {

    //метод для визначення дня тижня за номером
    static String getDay(int num) {
        String day;

        switch (num) {
            case 1:
                day = "понеділок";
                break;
            case 2:
                day = "вівторок";
                break;
            case 3:
                day = "середа";
                break;
            case 4:
                day = "четвер";
                break;
            case 5:
                day = "п’ятниця";
                break;
            case 6:
                day = "субота";
                break;
            case 7:
                day = "неділя";
                break;
            default:
                day = "невідомо";
        }

        return day;
    }

    //метод для визначення будніх та вихідних днів
    static String testDay(int num) {
        String day;

        switch (num) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                day = "будній день";
                break;
            case 6:
            case 7:
                day = "вихідний день";
                break;
            default:
                day = "невідомо";
        }

        return day;
    }

    //головний метод програми
    public static void main(String[] args) {
        for (int k = 0; k <= 8; k++) {
            System.out.println(k + ": " + getDay(k) + " - " + testDay(k));
        }
    }
}
