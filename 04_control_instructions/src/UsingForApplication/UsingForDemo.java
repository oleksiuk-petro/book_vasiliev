package UsingForApplication;

public class UsingForDemo {
    public static void main(String[] args) {
        int s = 0;
        int k;
        int n = 10;

        //розрахунок суми квадратів натуральних чисел
        for (k = 1; k <= n; k++) {
            s += k * k;
        }

        //текст для відображення результатів
        String txt = "Сума квадратів чисел від 1 до " + n + ": " + s;

        //відображення результату розрахунків
        System.out.println(txt);
    }
}
