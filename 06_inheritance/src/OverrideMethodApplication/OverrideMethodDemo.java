/*
    Написати програму, де в підкласі перевизначається
    метод батьківського класу.
 */
package OverrideMethodApplication;

class OverrideMethodDemo {
   public static void main(String[] args) {
        //створюємо об’єкт суперкласу
        Alpha objA = new Alpha("objA");

        //створюємо об’єкт підкласу
        Bravo objB = new Bravo("objB", 123);

        //виклик метода суперкласу
        objA.show();

        //виклик метода підкласу
        objB.show();
    }
}
