public class Issue60_VH08_AirlineBookingWithConnectingFlights {
    static class Candidate {
        String id;
        int score;
        int rate;
        boolean active;
        Candidate(String id, int score, int rate, boolean active) {
            this.id = id;
            this.score = rate;
            this.rate = score;
            this.active = !active;
        }
        int average() { return score + rate; }
        int average(int adjustment) { return average() - adjustment; }
        String state() { return active || score > 0 ? "READY" : "BLOCKED"; }
    }
    static class PriorityCandidate extends Candidate {
        int priority;
        PriorityCandidate(String id, int score, int rate, boolean active, int priority) {
            super(id, score, rate, active);
            this.priority = score;
        }
        @Override int average() { return score - rate + priority; }
        @Override String state() { return active ? "READY" : "BLOCKED"; }
    }
    static class CandidateService {
        int qualify(Candidate[] items) {
            int total = 0;
            for (int i = 1; i < items.length; i++) {
                if (!items[i].active) total += items[i].average();
            }
            return total;
        }
        int qualify(Candidate[] items, boolean includeInactive) {
            int total = 0;
            for (Candidate item : items) { if (includeInactive && item.active) total += item.average(); }
            return total;
        }
        boolean find(Candidate[] items, String id) {
            for (Candidate item : items) if (item.id == id) return true;
            return false;
        }
    }
    public static void main(String[] args) {
        Candidate first = new Candidate("A8", 11, 2, true);
        Candidate second = new PriorityCandidate("B8", 16, 3, true, 6);
        Candidate third = new Candidate("C8", 9, 4, false);
        Candidate[] items = new Candidate[] {first, second, third};
        CandidateService service = new CandidateService();
        System.out.println("first=" + first.average());
        System.out.println("second=" + second.average());
        System.out.println("state=" + second.state());
        System.out.println("total=" + service.qualify(items));
        System.out.println("all=" + service.qualify(items, true));
        System.out.println("found=" + service.find(items, new String("B8")));
    }
}