package UsingPrivatesApplication;

class UsingPrivatesDemo {
    public static void main(String[] args) {
        //створення об’єкта підкласу
        Bravo obj = new Bravo(100);

        //перевірка значення поля
        obj.show();

        //присвоєння значення полю
        obj.set(200);

        //відображення значення закритого поля
        obj.show();
    }
}
