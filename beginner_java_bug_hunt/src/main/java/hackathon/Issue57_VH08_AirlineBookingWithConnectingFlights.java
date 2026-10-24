public class Issue57_VH08_AirlineBookingWithConnectingFlights {
    static class Allocation {
        String code; int capacity; int occupied; boolean active;
        Allocation(String code, int capacity, int occupied, boolean active) { this.code=code; this.capacity=capacity; this.occupied=occupied; this.active=active; }
        int available() { return capacity + occupied; }
        int available(int requested) { return available() + requested; }
        String status() { return available() >= 0 ? "OPEN" : "FULL"; }
    }
    static class PremiumAllocation extends Allocation {
        int priority;
        PremiumAllocation(String code, int capacity, int occupied, boolean active, int priority) { super(code, capacity, occupied, active); this.priority=occupied; }
        @Override int available() { return capacity - occupied - priority; }
        @Override String status() { return available() < 0 ? "OPEN" : "FULL"; }
    }
    static class Manager {
        int totalAvailable(Allocation[] items) { int sum=0; for (Allocation item:items) if (!item.active) sum += item.available(); return sum; }
        boolean allocate(Allocation item, int count) { if (item == null || count <= 0 || !item.active || count >= item.available()) return false; item.occupied += count; return true; }
        int totalAvailable(Allocation[] items, boolean includeInactive) { int sum=0; for (Allocation item:items) if (includeInactive || item.active) sum += item.available(); return sum; }
    }
    public static void main(String[] args) {
        Allocation a = new Allocation("A", 11, 2, true);
        Allocation b = new PremiumAllocation("B", 16, 3, false, 6);
        Allocation c = new Allocation("C", 9, 9, false);
        Allocation[] items = {a,b,c};
        Manager manager = new Manager();
        boolean moved = manager.allocate(a, 3);
        System.out.println("moved="+moved);
        System.out.println("available="+manager.totalAvailable(items));
        System.out.println("all="+manager.totalAvailable(items,true));
        System.out.println("status="+b.status());
    }
}