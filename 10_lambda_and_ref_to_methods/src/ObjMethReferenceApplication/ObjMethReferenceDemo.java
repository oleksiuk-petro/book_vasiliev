package ObjMethReferenceApplication;

class ObjMethReferenceDemo {

    public static void main(String[] args) {

        // створення об’єкта
        MyClass obj = new MyClass(100);
        System.out.println("\nСтворено об’єкт obj з полем 100");
        // використовуємо посилання на методи
        MyGetter varA = obj::get;
        MySetter varB = obj::set;
        System.out.println("Змінна varA: " + varA.myGet());
        System.out.println("Змінна obj: " + obj.get());

        obj.set(200);
        System.out.println("\nПолю obj присвоєно значення 200");
        System.out.println("Змінна varA: " + varA.myGet());

        varB.mySet(300);
        System.out.println("\nВиконана команда varB.mySet(300)");
        System.out.println("Змінна varA: " + varA.myGet());
        System.out.println("Змінна obj: " + obj.get());

        obj = new MyClass(400);
        System.out.println("\nСтворено об’єкт obj з полем 400");
        System.out.println("Змінна varA: " + varA.myGet());
        System.out.println("Змінна obj: " + obj.get());

        varB.mySet(500);
        System.out.println("\nВиконана команда varB.mySet(500)");
        System.out.println("Змінна varA: " + varA.myGet());
        System.out.println("Змінна obj: " + obj.get());
    }
}
