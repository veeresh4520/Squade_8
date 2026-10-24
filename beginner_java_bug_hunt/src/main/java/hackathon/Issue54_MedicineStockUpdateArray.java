public class Issue54_MedicineStockUpdateArray {
    public static void main(String[] args) {
        int[] values = {10, 20, 30};
        int index = 1;
        values[index + 1] = 99;
        System.out.print("Updated values:");
        for (int value : values) System.out.print(" " + value);
        System.out.println();
    }
}