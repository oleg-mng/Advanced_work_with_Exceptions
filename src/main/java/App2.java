public class App2 {
    public static void main(String[] args) {

        String[][] ans = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        try {
            ElementArraySum(ans, 4);
        }catch (MyArrayDataException | MyArraySizeException e){
            System.out.println(e.getMessage());
        }

    }

    public static int ElementArraySum(String[][] inputArray, int n) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (inputArray.length != n || inputArray[0].length != n) {
            throw new MyArraySizeException();

        }
        int length = inputArray.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                try {
                    sum += Integer.parseInt(inputArray[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }
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
    public MyArrayDataException(int row, int col) {
        super("Невозможно преобразовать элемент массива в число" + row +", " + col);
    }
}
