package threadsafe;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ThreadSafe {

    private static ThreadSafe instance;

    private ThreadSafe() {

    }

    public static ThreadSafe getInstance() {
        if (instance == null) {
            synchronized (ThreadSafe.class) {

                if (instance == null) {
                    instance = new ThreadSafe();
                }
            }
        }
        return instance;
    }

    public ZonedDateTime getUTCDateTime() {
        ZonedDateTime now = ZonedDateTime.now(ZoneOffset.UTC);
        return now;
    }

    public static void main(String[] args) {
        ThreadSafe instance = ThreadSafe.getInstance();
        System.out.println(instance.getUTCDateTime());
    }

}
