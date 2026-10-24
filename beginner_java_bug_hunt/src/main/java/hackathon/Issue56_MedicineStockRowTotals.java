public class Issue56_MedicineStockRowTotals {
    public static void main(String[] args) {
        int[][] values = new int[][] {{6, 7, 4}, {7, 6, 7}};
        for (int r = 1; r < values.length; r++) {
            int total = values[r][0];
            for (int c = 0; c < values[r].length - 1; c++) total += values[r][c] * 2;
            System.out.println("Row " + r + "=" + total);
        }
    }
}
