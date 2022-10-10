//This Program is prepared by 21CE118 Shruti Sangani
/*Aim :: (Display nonduplicate names in ascending order) Given one or more text files, each
representing a day’s attendance in a course and containing the names of the students
who attended the course on that particular day, write a program that displays, in
ascending order, the names of those students who have attended at least one day of the
course. The text file(s) is/are passed as command-line argument(s).
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Practical13 {
    public static void sortArray(String[] student, int k) {
        for (int i = 0; i < k - 1; i++) {
            for (int j = 0; j < k - i - 1; j++) {
                if (student[j].compareTo(student[j + 1]) > 0) {
                    String temp = student[j];
                    student[j] = student[j + 1];
                    student[j + 1] = temp;
                }
            }
        }
        // print the student array in ascending order
        for (int i = 0; i < k; i++) {
            System.out.println(student[i]);
        }
    }

    public static void main(String[] args) {
        // an string array to store the names of student
        String student[] = new String[500];
        // counter to count the number of students
        int counter = 0;
        try {
            // loop to read all the file names given as command line arguments
            for (int i = 0; i < args.length; i++) {
                // file class object to read the open the file
                File file = new File(args[i]);
                // scanner object to read the file
                Scanner scnr = new Scanner(file);
                while (scnr.hasNextLine()) {
                    // reads one line
                    String line = scnr.nextLine();
                    int flag = 0;
                    // store the name in the array
                    /*
                     * check if the name is already present in the student
                     * array.. if only one occurence od the name is not kept in the
                     * array then the name will appear
                     * multiple times in the sorted list
                     */
                    for (int j = 0; j < counter; j++) {
                        if (line.compareTo(student[j]) == 0) {
                            flag = 1;
                            break;
                        }
                    }
                    // if flag==0.. the name has appeared first time in the list
                    if (flag == 0) {
                        student[counter] = line;
                        counter++;
                    }
                }
            }
            System.out.println("the list of students in ascending order:");
            // call the sortArray() to sort the student array and print it
            sortArray(student, counter);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
