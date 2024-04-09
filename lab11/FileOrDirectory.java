import java.io.File;

public class FileOrDirectory {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a file or directory name.");
            return;
        }

        String path = args[0];
        File file = new File(path);

        if (!file.exists()) {
            System.out.println("File or directory does not exist.");
            return;
        }

        if (file.isFile()) {
            System.out.println("File Size: " + file.length() + " bytes");
        } else if (file.isDirectory()) {
            System.out.println("Files in the directory:");
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    System.out.println(f.getName());
                }
            }
        } else {
            System.out.println("Invalid file or directory.");
        }
    }
}
