public class App2 {
    public static void main(String[] args) {

        String[][] ans = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        ElementArraySum(ans, 4);
    }

    public static int ElementArraySum(String[][] inputArray, int n) throws MyArraySizeException {
        int sum = 0;
        if (inputArray.length != n || inputArray[0].length != n) {
            throw new MyArraySizeException();

        }
        int length = inputArray.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                sum += Integer.parseInt(inputArray[i][j]);
            }
        }
        return sum;
    }
}

class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super("Неверный размер массива");
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException() {
        super("Неверная");
    }
}
