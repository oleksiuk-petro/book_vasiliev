/*
    Написати програму, де доступ до об’єкта підкласу
    виконується через об’єктну змінну суперкласу.
 */

package SuperAndSubApplication;

class SuperAndSubDemo {

    public static void main(String[] args) {

        Alpha objA = new Alpha();
        objA.name = "alpha";
        objA.show();

        Bravo objB = new Bravo();
        objB.name = "bravo";
        objB.code = 123;
        objB.show();

        // змінній суперкласу присвоюється
        // посилання об’єкта підкласу
        objA = objB;

        // усі дії відбуваються над об’єктом підкласу
        objA.name = "charlie";
        // objA.code = 123; //команда не виконається
        objA.show();
        objB.show();
    }
}
