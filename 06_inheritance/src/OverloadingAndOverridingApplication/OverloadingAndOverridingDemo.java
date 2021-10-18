package OverloadingAndOverridingApplication;

//перевантаження та переозначення
class OverloadingAndOverridingDemo {
    public static void main(String[] args) {

        Alpha objA = new Alpha();
        objA.show();
        objA.show("Object objA");

        Bravo objB = new Bravo();
        objB.show();
        objB.show("Object objB");
        objB.show(123);
    }
}
