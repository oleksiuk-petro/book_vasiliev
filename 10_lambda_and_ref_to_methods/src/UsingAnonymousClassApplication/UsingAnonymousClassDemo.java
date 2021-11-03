package UsingAnonymousClassApplication;

class UsingAnonymousClassDemo {

    public static void main(String[] args) {

        MyNums varA = new MyNums() {
            @Override
            public int get(int n) {
                int k;
                int s = 0;
                for (k = 1; k <= n; k++) {
                    s += k;
                }
                return s;
            }
        };

        System.out.println("Використовуємо анонімний клас:");
        varA.show(10);
        System.out.println("Перевірка: " + varA.get(10));

        MyNums varB = varA;

        System.out.println("\nНовий анонімний клас:");
        varA = new MyNums() {
            @Override
            public int get(int n) {
                return n * n;
            }
        };

        System.out.println("Виклик методу show() з varA:");
        varA.show(10);

        System.out.println("\nВиклик методу show() з varB:");
        varB.show(10);
    }
}
