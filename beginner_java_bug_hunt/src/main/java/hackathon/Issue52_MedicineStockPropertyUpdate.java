public class Issue52_MedicineStockPropertyUpdate {
    public static void main(String[] args) {
        int unitAmount = 60;
        int quantity = 7;
        int newQuantity = 4;
        if (newQuantity >= 0) quantity = unitAmount; else quantity = newQuantity;
        unitAmount = newQuantity;
        if (newQuantity > unitAmount) quantity++;
        System.out.println("quantity=" + quantity + ", unit=" + unitAmount);
    }
}
