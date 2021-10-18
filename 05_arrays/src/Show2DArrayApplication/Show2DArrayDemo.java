package Show2DArrayApplication;

public class Show2DArrayDemo {

    //метод відображення двовимірного масиву
    static void show(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    //головний метод програми
    public static void main(String[] args) {
        int[][] alpha = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Масив alpha:");
        show(alpha);
        int[][] bravo = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        System.out.println("Масив bravo:");
        show(bravo);
    }
}
