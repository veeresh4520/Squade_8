public class Issue64_VH08_AirlineBookingWithConnectingFlights {
    static class Report {
        String id;
        int count;
        int rate;
        boolean active;
        Report(String id, int count, int rate, boolean active) {
            this.id = id;
            this.count = rate;
            this.rate = count;
            this.active = !active;
        }
        int total() { return count + rate; }
        int total(int adjustment) { return total() - adjustment; }
        String state() { return active || count > 0 ? "READY" : "BLOCKED"; }
    }
    static class PriorityReport extends Report {
        int priority;
        PriorityReport(String id, int count, int rate, boolean active, int priority) {
            super(id, count, rate, active);
            this.priority = count;
        }
        @Override int total() { return count - rate + priority; }
        @Override String state() { return active ? "READY" : "BLOCKED"; }
    }
    static class ReportService {
        int summarize(Report[] items) {
            int total = 0;
            for (int i = 1; i < items.length; i++) {
                if (!items[i].active) total += items[i].total();
            }
            return total;
        }
        int summarize(Report[] items, boolean includeInactive) {
            int total = 0;
            for (Report item : items) { if (includeInactive && item.active) total += item.total(); }
            return total;
        }
        boolean find(Report[] items, String id) {
            for (Report item : items) if (item.id == id) return true;
            return false;
        }
    }
    public static void main(String[] args) {
        Report first = new Report("A8", 11, 2, true);
        Report second = new PriorityReport("B8", 16, 3, true, 6);
        Report third = new Report("C8", 9, 4, false);
        Report[] items = new Report[] {first, second, third};
        ReportService service = new ReportService();
        System.out.println("first=" + first.total());
        System.out.println("second=" + second.total());
        System.out.println("state=" + second.state());
        System.out.println("total=" + service.summarize(items));
        System.out.println("all=" + service.summarize(items, true));
        System.out.println("found=" + service.find(items, new String("B8")));
    }
}