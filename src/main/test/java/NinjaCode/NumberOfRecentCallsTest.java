package NinjaCode;

import NinjaCode.queue.NumberOfRecentCalls;
import org.junit.Test;


/*
You have a RecentCounter class which counts the number of recent requests within a certain time frame.

Implement the RecentCounter class:

RecentCounter() Initializes the counter with zero recent requests.
int ping(int t) Adds a new request at time t, where t represents some time in milliseconds, and returns the number of requests that has happened in the past 3000 milliseconds (including the new request).
Specifically, return the number of requests that have happened in the inclusive range [t - 3000, t].
It is guaranteed that every call to ping uses a strictly larger value of t than the previous call.
 */
public class NumberOfRecentCallsTest {
    @Test
    public void one() {
        NumberOfRecentCalls numberOfRecentCalls = new NumberOfRecentCalls();
        int param_1 = numberOfRecentCalls.ping(1);
        int param_2 = numberOfRecentCalls.ping(100);
        int param_3 = numberOfRecentCalls.ping(3001);
        int param_4 = numberOfRecentCalls.ping(3002);
        System.out.println(param_1);
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
    }
}
