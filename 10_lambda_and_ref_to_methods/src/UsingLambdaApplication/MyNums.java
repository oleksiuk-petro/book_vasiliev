package UsingLambdaApplication;

// функціональний інтерфейс
interface MyNums {

    // метод з кодом за замовчуванням
    default void show(int n) {
        System.out.println("Аргумент: " + n);
        System.out.println("Результат: " + get(n));
    }

    // абстрактний метод
    int get(int n);
}