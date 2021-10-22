/*
    Створити "ланцюг" об’єктів не використовуючи масиву.
    Підказка: кожен об’єкт (крім останнього) містить посилання на наступний об’єкт.
 */

package ListOfObjectsApplication;

class ListOfObjectsDemo {

    // метод створює ланцюг об’єктів
    static MyClass createList(int n) {
        // створюється перший об’єкт ланцюга
        MyClass obj = new MyClass();
        // значення поля "1"
        obj.number = 1;
        // спочатку перший об’єкт є і останнім
        MyClass t = obj;

        for (int k = 1; k <= n; k++) {
            //створення наступного об’єкту ланцюга
            t.next = new MyClass();
            t.next.number = t.number * (n - k + 1) / k;
            // наступний об’єкт є останнім
            t = t.next;
        }

        t.next = null;
        return obj;
    }

    // метод виводить ланцюг об’єктів
    // аргумент методу - посилання на перший об’єкт класу MyClass
    static void showList(MyClass obj) {
        String txt = "|";
        // t - перший об’єкт ланцюга
        MyClass t = obj;

        do {
            txt += t.number + " | ";
            t = t.next; // перекидання на наступний об’єкт ланцюга
        } while (t != null);

        System.out.println(txt);
    }

    public static void main(String[] args) {
        MyClass objA = createList(5);
        MyClass objB = createList(10);
        showList(objA);
        showList(objB);
    }
}
