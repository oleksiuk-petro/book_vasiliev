package MethodArgumentsApplication;

public class MethodArgumentsApplication {

    static void swap(int a, int b) {
        System.out.println("Виконується метод swap()");
        System.out.println("Аргументи до зміни значень: " + a + " та " + b);

        //обмін значеннями
        int x = b;
        b = a;
        a = x;

        System.out.println("Аргументи після зміни значень: " + a + " та " + b);
        System.out.println("Завершення виконання методу swap()");
    }

    public static void main(String[] args) {
        int m = 100;
        int n = 200;
        System.out.println("Змінні до виклику методу swap(): " + m + " та " + n);
        swap(m, n);
        System.out.println("Змінні після виклику методу swap(): " + m + " та " + n);
    }
}
