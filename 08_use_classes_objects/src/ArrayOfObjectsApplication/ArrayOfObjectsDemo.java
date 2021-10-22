package ArrayOfObjectsApplication;

class ArrayOfObjectsDemo {

    // статичний метод для створення масиву об’єктів
    static MyClass[] createBinoms(int n) {
        MyClass[] bins = new MyClass[n + 1];
        bins[0] = new MyClass(1);
        for (int k = 1; k <= n; k++) {
            bins[k] = new MyClass(bins[k - 1].get() * (n - k + 1) / k);
        }
        return bins;
    }

    // статичний метод для відображення значень полів
    // об’єктів, які формують масив
    static void show(MyClass[] objs) {
        String txt = "|";
        for(int k = 0; k < objs.length; k++) {
            txt += objs[k].get() + " | ";
        }
        System.out.println(txt);
    }

    // головний метод програми
    public static void main(String[] args) {
        // створюємо об’єкти класу MyClass
        MyClass[] arrayA = createBinoms(5);
        MyClass[] arrayB = createBinoms(10);
        show(arrayA);
        show(arrayB);
    }
}
