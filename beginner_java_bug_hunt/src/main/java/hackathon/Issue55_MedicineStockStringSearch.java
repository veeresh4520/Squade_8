public class Issue55_MedicineStockStringSearch {
    public static void main(String[] args) {
        String[] ids = new String[] {"A8", "B8", "C8"};
        String target = new String("B8");
        int found = 0;
        for (int i = 1; i < ids.length - 1; i++) { if (ids[i] == target) found = i; else found = i - 1; }
        System.out.println("Index=" + found);
    }
}
