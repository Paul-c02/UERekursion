package arrays;

public class NumberHelper {
    public static void main(String[] args) {
       int[] numbers = {1, 5, 3, 1, 9, 2, 5};
        System.out.println(isSortedArray(numbers));
        int[] output = removeDuplicates(numbers);
        for (int i = 0; i < output.length; i++) {
            System.out.println("output = " + output[i]);
        }
    }
    public static boolean isSortedArray(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length-1; i++) {
            if(numbers[i]<numbers[i+1]){
                count++;
            }
            if (count== numbers.length-1) {
                return true;
            }
        }return false;
    }
    public static int[] removeDuplicates(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] == numbers[i]) {
                    numbers[i] = (-1);
                }
            }

        }
        return numbers;
    }
}
