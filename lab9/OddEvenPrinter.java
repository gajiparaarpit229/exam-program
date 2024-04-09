public class OddEvenPrinter {

    public static void main(String[] args) {
        Thread oddThread = new Thread(new OddPrinter());
        Thread evenThread = new Thread(new EvenPrinter());

        oddThread.start();
        evenThread.start();
        try{
            oddThread.join();
            evenThread.join();
        }catch(Exception e){
    e.printStackTrace();
        }
    }
    static class OddPrinter extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 20; i = i + 2) {
                System.out.println("Odd :" + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    static class EvenPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println("Even :" + i);
                try {
                    Thread.sleep(500); 
                    } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
