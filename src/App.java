public class App {

    public static int calculateSum(int[] numbers) {
        int sum = 0;

        for (int num : numbers) {   // vòng lặp
            if (num > 0) {          // rẽ nhánh
                sum += num;
            } else if (num < 0) {
                sum -= num;
            } else {
                System.out.println("Zero detected");
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, -2, 0, 4};
        System.out.println(calculateSum(numbers));
    }
}