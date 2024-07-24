import model.Student;
import service.FileService;
import service.StudentService;

import java.io.File;
import java.nio.file.FileSystem;

public class Lesson {
    public static final String URL = "Test.txt";

    public static void main(String[] args) throws Exception {


        String[] lines = FileService.read(URL);
        Student[] students = StudentService.convert(lines);

//        for(Student student : students) {
//            FileService.write("nameFiles\\" + student.getName(), student.toString());
//        }


        Student minGirlMark = StudentService.minMarkGirl(students);
        FileService.writeStandardOpenOption(URL, "\nYoungest Girl: " + minGirlMark.toString());

        StudentService.sortByYear(students);
        String studentChain = "";
        for(Student student : students) {
            studentChain += student + "|";
        }
        FileService.writeStandardOpenOption(URL,"\n" + studentChain);


    }
}
