/*
    Виклик різних версій переозначеного методу.
 */

package MoreOverridingApplication;

class MoreOverridingDemo {
    public static void main(String[] args) {
        Alpha objA = new Alpha("objA");
        Bravo objB = new Bravo("objB", 123);
        objA.show();
        objB.show();
    }
}
