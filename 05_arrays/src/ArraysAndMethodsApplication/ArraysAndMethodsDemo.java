/*
    Реалізувати математичну задачу про розрахунок
    добутку матриці на вектор, результатом якого
    є інший вектор.
 */

package ArraysAndMethodsApplication;

public class ArraysAndMethodsDemo {

    //метод для відображення вмісту двовимірної матриці
    static void show2D(int[][] nums) {
        for (int[] p : nums) { //проходимось по рядкам
            for (int s : p) { //проходимось всередині рядка
                System.out.printf("%4d", s);
            }
            System.out.println();
        }
    }

    //метод для відображення вмісту одиничного вектора
    static void show1D(int[] nums) {
        for (int s : nums) {
            System.out.printf("%4d", s);
        }
        System.out.println();
    }

    //метод для розрахунку добутку матриці на вектор
    static void prod(int[][] A, int[] B) {
        int[] C = new int[A.length]; //розмірність масиву - це кількість рядків у матриці
        //добуток матриці та вектора
        for (int i =0; i < C.length; i++) {
            C[i] = 0; //початкова сума добутків
            for (int j = 0; j < B.length; j++) {
                C[i] += A[i][j] * B[j];
            }
            System.out.printf("%4d", C[i]);
        }
    }

    //головний метод
    public static void main(String[] args) {
        //двовимірна матриця
        int[][] A = {
                {1, 0, 3, -1},
                {2, -1, -2, 3},
                {-1, 1, 0, 2}
        };
        //одновимірний вектор
        int[] B = {1, -1, 3, 2};

        //відображення вмісту матриці А
        System.out.println("Матриця А:");
        show2D(A);

        //відображення вмісту вектора
        System.out.println("Вектор В:");
        show1D(B);

        //результат множення матриці на вектор
        System.out.println("Вектор C = A * B:");
        prod(A, B);
    }
}
