package LambdaAndInterfacesApplication;

class LambdaAndInterfacesDemo {

    public static void main(String[] args) {

        Alpha varA = () -> System.out.println("Використовуємо лябда-вираз");
        varA.showA();

        Bravo varB = () -> System.out.println("Використовуємо лябда-вираз");
        varB.showB();

        // значенням інтерфейсній змінній
        // присвоюється посилання на метод
        Charlie varC = varA::showA;
        varC.showC();
    }
}