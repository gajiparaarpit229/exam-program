public class Student {
    private int idNo;
    private int noOfSubjectsRegistered;
    private int[] subjectCode;
    private int[] subjectCredits;
    private char[] gradeObtained;
    private double spi;

    public Student(int idNo, int noOfSubjectsRegistered, int[] subjectCode, int[] subjectCredits, char[] gradeObtained) {
        this.idNo = idNo;
        this.noOfSubjectsRegistered = noOfSubjectsRegistered;
        this.subjectCode = subjectCode;
        this.subjectCredits = subjectCredits;
        this.gradeObtained = gradeObtained;
    }

    public void calculateSpi() {
        double totalGradePoints = 0;
        int totalCredits = 0;
        for (int i = 0; i < noOfSubjectsRegistered; i++) {
            double gradePoint;
            switch (gradeObtained[i]) {
                case 'S':
                    gradePoint = 10;
                    break;
                case 'A':
                    gradePoint = 9;
                    break;
                case 'B':
                    gradePoint = 8;
                    break;
                case 'C':
                    gradePoint = 7;
                    break;
                case 'D':
                    gradePoint = 6;
                    break;
                default:
                    gradePoint = 0;
            }
            totalGradePoints += gradePoint * subjectCredits[i];
            totalCredits += subjectCredits[i];
        }
        spi = totalGradePoints / totalCredits;
    }

    public static void main(String[] args) {
        int n = args.length / 4; // Assuming each student has 4 arguments (id, noOfSubjects, subjects, credits, grades)
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            int idNo = Integer.parseInt(args[i * 4]);
            int noOfSubjectsRegistered = Integer.parseInt(args[i * 4 + 1]);
            int[] subjectCode = new int[noOfSubjectsRegistered];
            int[] subjectCredits = new int[noOfSubjectsRegistered];
            char[] gradeObtained = new char[noOfSubjectsRegistered];
            for (int j = 0; j < noOfSubjectsRegistered; j++) {
                subjectCode[j] = Integer.parseInt(args[i * 4 + 2 + j * 2]);
                subjectCredits[j] = Integer.parseInt(args[i * 4 + 3 + j * 2]);
                gradeObtained[j] = args[i * 4 + 4 + j * 2].charAt(0);
            }
            students[i] = new Student(idNo, noOfSubjectsRegistered, subjectCode, subjectCredits, gradeObtained);
            students[i].calculateSpi();
            System.out.println("Student " + students[i].idNo + ": SPI = " + students[i].spi);
        }
    }
}
