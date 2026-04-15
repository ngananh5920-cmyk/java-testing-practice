public class AppTest {

    public static void main(String[] args) {

        // Test 1: toàn số dương
        int[] case1 = {1, 2, 3};
        System.out.println("Test1: " + App.calculateSum(case1));

        // Test 2: toàn số âm
        int[] case2 = {-1, -2};
        System.out.println("Test2: " + App.calculateSum(case2));

        // Test 3: có số 0
        int[] case3 = {0};
        System.out.println("Test3: " + App.calculateSum(case3));
   // Test 4: mix đủ case
int[] case4 = {5, -3, 0, 2};
System.out.println("Test4: " + App.calculateSum(case4));
    }
}