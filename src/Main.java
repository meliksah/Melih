import java.util.ArrayList;
import java.util.List;

public class Main {
    static int pow(int base, int power) {
        int result = base;
        for(int i = 0; i < power; i++) {
            result *=base;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] input = {{1,3,5,7},{0,0,6,6}, {0,2,1,3}, {5,3,1,1}, {1,0,1,1}};
        int rows = 5;
        int columns = 4;
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < rows; i++) {
            int number = 0;
            for(int j = 0; j < columns; j++) {
                number += input[i][j] * (Math.pow(10, (columns - j -1)));
            }
            numbers.add(number);
        }
        int max = 0;

        for(Integer number: numbers) {
            if (number > max) {
                max = number;
            }
            System.out.println(number);
        }
        System.out.println("Maximum is: " + max);


    }
}
