public class Issue43_MedicineStockMenuChoice {
    public static void main(String[] args) {
        int option = 2;
        int balance = 60;
        int amount = 7;
        String action;
        if (option == 1) { balance += amount; action = "Added"; }
        else if (option == 2) { balance += amount; action = "Cancelled"; }
        else if (option == 3) { balance -= amount; action = "Returned"; }
        else { action = "Invalid option"; }
        System.out.println(action + ": " + balance);
    }
}
