/*
    Написати програму, яка виводить масивом біноміальні коефіцієнти.
 */

package ArraysAsFieldApplication;

class ArrayAsFieldDemo {

    public static void main(String[] args) {
        // створюємо об’єкти класу Binomial
        Binomial objA = new Binomial(5);
        Binomial objB = new Binomial(10);

        // відображаємо біноміальні коефіцієнти
        System.out.println(objA);
        System.out.println(objB);
    }
}
