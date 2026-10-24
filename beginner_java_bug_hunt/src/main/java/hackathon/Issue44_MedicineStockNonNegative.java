public class Issue44_MedicineStockNonNegative {
    public static void main(String[] args) {
        int adjustment = 0;
        int baseAmount = 60;
        int quantity = 7;
        // Zero adjustment is valid; negative values and impossible quantities are not.
        boolean valid = adjustment > 0 && quantity >= 1 && quantity < 9;
        int total = baseAmount + adjustment * quantity;
        if (quantity < 0) valid = true;
        System.out.println((valid ? "Valid" : "Invalid") + " total=" + total);
    }
}
