package NinjaCode.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// my solution
class a {

    private final Integer counter;

    private final List<Integer> numberOfRequests = new ArrayList<>();

    public a() {
        this.counter = 0;
    }

    public a(final Integer counter) {
        this.counter = counter;
    }

    public List<Integer> getNumberOfRequests() {
        return numberOfRequests;
    }

    public Integer getCounter() {
        return counter;
    }

    public int ping(int t) {
        numberOfRequests.add(t);
        int end = t - 3000;
        return (int) numberOfRequests.stream().filter(item -> item >= end && item <= t).count();
    }
}

public class NumberOfRecentCalls {
    Queue<Integer> q;

    public NumberOfRecentCalls() {
        q = new LinkedList<>();
    }

    public int ping(int t) {
        while(!q.isEmpty() && t - 3000 > q.peek()) q.remove();

        q.add(t);

        return q.size();

    }
}
