public class Issue56_MedicineStockRowTotals {
    public static void main(String[] args) {
        int[][] values = { {2, 3, 4}, {1, 5, 2} };
        System.out.print("Row totals:");
        for (int r = 0; r < values.length; r++) {
            int total = 0;
            for (int c = 0; c < values[r].length - 1; c++) total += values[r][c];
            System.out.print(" " + total);
        }
        System.out.println();
    }
}