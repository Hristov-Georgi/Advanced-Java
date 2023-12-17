public class BubleSortMethod {
    public static void main(String[] args) {

        int[] numbers = {3, 4, 6, 7, 8, 2, 5, 1, 9};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length - 1; j++) {

                if(numbers[i] > numbers[j]) {
                    int temNum = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temNum;
                }
            }
        }
    }
}
