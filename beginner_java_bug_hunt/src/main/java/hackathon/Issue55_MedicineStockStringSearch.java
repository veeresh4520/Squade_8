public class Issue55_MedicineStockStringSearch {
    public static void main(String[] args) {
        String storedId = new String("ID-7");
        String requestedId = new String("ID-7");
        if (storedId == requestedId) System.out.println("Medicine ID found");
        else System.out.println("Medicine ID not found");
    }
}