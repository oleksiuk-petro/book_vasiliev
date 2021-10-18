package AssigningArraysApplication;

public class AssigningArraysDemo {

    //статичний метод для відображення вмісту масиву
    static void show(int[] nums) {
        for (int s: nums) {
            System.out.print("| " + s + " ");
        }
        System.out.println("|");
    }

    //головний метод програми
    public static void main(String[] args) {
        int[] odd = {1, 3, 5, 7, 9};
        System.out.println("Масив odd:");
        show(odd);

        int[] even = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println("Масив even:");
        show(even);

        //присвоєння масивів
        System.out.println("\nВиконується присвоєння.");
        even = odd;
        even[0] = -1;

        System.out.println("Масив odd:");
        show(odd);
        System.out.println("Масив even:");
        show(even);
    }
}
