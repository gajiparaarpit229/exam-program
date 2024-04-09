public class GreetingThread implements Runnable {
    private final String greeting;
    private final long interval;

    public GreetingThread(String greeting, long interval) {
        this.greeting = greeting;
        this.interval = interval;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(greeting);
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread morningThread = new Thread(new GreetingThread("Good Morning", 1000));
        Thread afternoonThread = new Thread(new GreetingThread("Good Afternoon", 3000));

        morningThread.start();
        afternoonThread.start();
    }
}
