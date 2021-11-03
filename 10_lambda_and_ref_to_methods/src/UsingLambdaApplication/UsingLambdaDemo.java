package UsingLambdaApplication;

// головний клас
class UsingLambdaDemo {

    // головний метод
    public static void main(String[] args) {

        // лябда-вираз присвоює значення
        // змінній інтерфейсного типу
        MyNums varA = (int n) -> {
            // розрахунок суми натуральний чисел
            int k;
            int s = 0;
            for (k = 1; k <= n; k++) {
                s += k;
            }
            // повертаємо результат
            return s;
        };

        System.out.println("Використовуємо лябда-вираз:");
        // виклик методу з інтерфейсної змінної
        varA.show(10);
        System.out.println("Перевірка: " + varA.get(10));

        // альтернативне посилання
        MyNums varB = varA;

        System.out.println("Новий лябда-вираз:");
        // інтерфейсній змінній присвоюється
        // новий лябда-вираз
        varA = n -> n * n;

        System.out.println("Виклик методу show() з varA:");
        varA.show(10);

        System.out.println("Виклик методу show() з varB:");
        varB.show(10);
    }
}