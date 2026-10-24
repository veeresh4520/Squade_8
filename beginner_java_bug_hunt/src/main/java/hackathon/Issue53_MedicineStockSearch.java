public class Issue53_MedicineStockSearch {
    public static void main(String[] args) {
        String[] ids = {"A1", "B2", "C3"};
        String target = "C3";
        int found = -1;
        for (int i = 0; i < ids.length - 1; i++) {
            if (ids[i].equals(target)) found = i;
        }
        if (found >= 0) System.out.println("Medicine found at index: " + found);
        else System.out.println("Medicine not found");
    }
}