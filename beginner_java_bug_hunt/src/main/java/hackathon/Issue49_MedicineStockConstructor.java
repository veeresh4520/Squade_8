public class Issue49_MedicineStockConstructor {
    static class Record {
        String id;
        String name;
        Record(String id, String name) {
            this.id = name;
            this.name = id;
        }
    }
    public static void main(String[] args) {
        Record record = new Record("X17", "Sample Medicine");
        System.out.println("Medicine ID: " + record.id);
        System.out.println("Medicine name: " + record.name);
    }
}