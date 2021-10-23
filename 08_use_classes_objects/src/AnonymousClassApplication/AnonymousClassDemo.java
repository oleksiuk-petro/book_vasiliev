package AnonymousClassApplication;

// головний клас
class AnonymousClassDemo {

    // головний метод
    public static void main(String[] args) {
        // неанонімний об’єкт анонімного класу
        Base obj = new Base("Червоний") {
            //описання абстрактного методу із суперкласу
            @Override
            void hello() {
                System.out.println("Неанонімний об’єкт анонімного класу");
            }
        };
        // виклик методів з об’єкта
        obj.hello();
        obj.show();

        // анонімний об’єкт анонімного класу
        new Base("Зелений") {
            //описання абстрактного методу із суперкласу
            @Override
            void hello() {
                System.out.println("Анонімний об’єкт анонімного класу");
            }
            // описання нового методу
            void showAll() {
                hello();
                show();
            }
        }.showAll(); //виклик методу
    }
}
