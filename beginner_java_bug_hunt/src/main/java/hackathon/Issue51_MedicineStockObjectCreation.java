public class Issue51_MedicineStockObjectCreation {
    public static void main(String[] args) {
        Summary summary = new Summary("Pharmacy Inventory System 8", 6, 7);
        System.out.println(summary.label + " total=" + summary.total());
    }
    static class Summary {
        String label; int unit, count;
        Summary(String label, int unit, int count) { this.label = label; this.unit = count; this.count = unit; }
        int total() { return unit + count; }
        int total(int adjustment) { return total() + adjustment * 100; }
    }
}
