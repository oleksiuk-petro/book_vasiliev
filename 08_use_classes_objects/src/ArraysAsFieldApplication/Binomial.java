package ArraysAsFieldApplication;

class Binomial {

    // закрите поле містить посилання на одновимірний масив
    private int[] binoms;

    // конструктор класу
    Binomial(int n) {
        binoms = new int[n + 1];
        binoms[0] = 1;
        for (int k = 1; k <= n; k++) {
            // біноміальний коефіцієнт розраховується за формулою
            // C(n, k) = C(n, k-1) * (n-k+1) / k
            binoms[k] = binoms[k - 1] * (n - k + 1) / k;
        }
    }

    // переозначення методу toString()
    @Override
    public String toString() {
        String txt = "|";
        for (int k = 0; k < binoms.length; k++) {
            txt += binoms[k] + " | ";
        }
        return txt;
    }
}
