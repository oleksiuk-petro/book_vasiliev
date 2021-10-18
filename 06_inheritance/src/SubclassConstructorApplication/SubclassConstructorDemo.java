/*
    Написати програму, де буде
    реалізовано конструктор підкласу.
 */

package SubclassConstructorApplication;

class SubclassConstructorDemo {
    public static void main(String[] args) {
        Bravo obj; //об’єктна змінна підкласу

        //різні способи створення об’єкта підкласу
        obj = new Bravo();
        obj = new Bravo("Червоний");
        obj = new Bravo(100);
        obj = new Bravo("Зелений", 200);
        obj = new Bravo('Y');
        obj = new Bravo("Синій", 300, 'Z');
    }
}
