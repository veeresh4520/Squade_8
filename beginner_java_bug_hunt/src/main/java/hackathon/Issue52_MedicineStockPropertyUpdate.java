public class Issue52_MedicineStockPropertyUpdate {
    static class Record { int quantity = 3; int unitAmount = 25; }
    public static void main(String[] args) {
        Record record = new Record();
        int newQuantity = 7;
        record.unitAmount = newQuantity;
        System.out.println("Quantity: " + record.quantity);
        System.out.println("Unit amount: " + record.unitAmount);
    }
}