public class MultiplicationTable {

    public static void main(String[] args) {

        int[][] multiplicationTable = new int[12][12];

        for (int row = 0; row < multiplicationTable.length; row++) {
            for (int column = 0; column < multiplicationTable[row].length; column++) {
                multiplicationTable[row][column] = (row + 1) * (column + 1);
            }
        }

        System.out.println("MULTIPLICATION TABLE");
        System.out.println();


        System.out.printf("%6s", "");
        for (int column = 0; column < multiplicationTable[0].length; column++) {
            System.out.printf("%6d", column + 1);
        }
        System.out.println();


        for (int row = 0; row < multiplicationTable.length; row++) {

            System.out.printf("%6d", row + 1);

            for (int column = 0; column < multiplicationTable[row].length; column++) {
                System.out.printf("%6d", multiplicationTable[row][column]);
            }
            System.out.println();
        }
    }
}
