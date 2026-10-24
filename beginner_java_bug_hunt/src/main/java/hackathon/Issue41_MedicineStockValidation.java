public class Issue41_MedicineStockValidation {
    public static void main(String[] args) {
        int requested = 0;
        int available = 8;
        boolean memberActive = true;
        boolean overdueFine = false;
        // A request is valid only when positive, within stock, active, and free of overdue fines.
        boolean accepted = requested >= 0 && requested < available && memberActive || overdueFine;
        System.out.println(accepted ? "Request accepted" : "Request rejected");
    }
}
