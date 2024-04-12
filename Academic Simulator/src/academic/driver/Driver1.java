package academic.driver;

import java.util.*;
import academic.model.Controller;

/**
 * @author 12S22011 Wilson Eksaudi Sihombing
 * @author 
 */

public class Driver1 {

    public static void main(String[] _args) {
        Controller controller = new Controller();
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.nextLine();
            if(str.equals("---")){
                break;
            }

            String[] tokens = str.split("#");
            if(tokens[0].equals("student-add")){
                controller.addStudent(tokens);

            }else if(tokens[0].equals("course-add")){
                controller.addCourse(tokens);

            }else if(tokens[0].equals("enrollment-add")){
                controller.addEnrollment(tokens);
                
            }else if(tokens[0].equals("lecturer-add")){
                controller.addLecture(tokens);
                
            }else if(tokens[0].equals("enrollment-grade")){
                controller.Add_EnrGrade(tokens);
                
            }else if(tokens[0].equals("student-details")){
                controller.Students_detail(tokens);

            }else if(tokens[0].equals("enrollment-remedial")){
                controller.Enrollment_remedial(tokens);
                
            }else if(tokens[0].equals("course-open")){
                controller.Course_open(tokens);
                
            }else if(tokens[0].equals("course-history")){
                controller.Course_history(tokens);
            }
        }

        //controller.print_EverythingDetails();
        System.out.println(controller);
        sc.close();
    }

}