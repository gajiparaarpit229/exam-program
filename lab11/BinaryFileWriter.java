import java.io.FileOutputStream;

class FileWriterThread extends Thread {
    private final String fileName;
    private final int start;
    private final int end;

    public FileWriterThread(String fileName, int start, int end) {
        this.fileName = fileName;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        try (FileOutputStream fos = new FileOutputStream(fileName, true)) {
            for (int i = start; i <= end; i++) {
                fos.write(i);
            }
        } catch (Exception e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

public class BinaryFileWriter {
    public static void main(String[] args) {
        String fileName = "output.bin";
        int fileSize = 1000;
        int numThreads = 5;
        int chunkSize = fileSize / numThreads;

        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = start + chunkSize - 1;
            if (i == numThreads - 1) {
                end = fileSize - 1;
            }
            threads[i] = new FileWriterThread(fileName, start, end);
            threads[i].start();
        }

        // Demonstrate interrupting a thread using yield() and join()
        try {
            // Interrupt a thread using yield()
            threads[1].yield();

            // Interrupt a thread using join()
            threads[2].join();

            // Interrupt a thread using interrupt()
            threads[3].interrupt();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}
