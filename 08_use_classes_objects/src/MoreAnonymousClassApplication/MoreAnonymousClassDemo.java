package MoreAnonymousClassApplication;

// головний клас
class MoreAnonymousClassDemo {

    public static void main(String[] args) {
        // неанонімний об’єкт анонімного класу
        Base obj = new Base() {
            //описання абстрактного методу з інтерфейсу Base
            @Override
            public void hello() {
                System.out.println("\nНеанонімний об’єкт анонімного класу");
            }
        };
        // виклик методів з об’єкта
        obj.hello();
        obj.show();

        // анонімний об’єкт анонімного класу
        new Base() {
            //описання абстрактного методу із суперкласу
            @Override
            public void hello() {
                System.out.println("\nАнонімний об’єкт анонімного класу");
            }
            // описання нового методу
            void showAll() {
                hello();
                show();
            }
        }.showAll(); //виклик методу
    }
}
