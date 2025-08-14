
class College {
    public void studentDetails() {
        System.out.println("College Student Details: Name, Roll Number, Course");
    }
    public void examTimings() {
        System.out.println("College Exam Timings: 9:00 AM to 12:00 PM");
    }
}
class School extends College {
    @Override
    public void studentDetails() {
        System.out.println("School Student Details: Name, Grade, Section");
    }
    @Override
    public void examTimings() {
        System.out.println("School Exam Timings: 8:30 AM to 11:30 AM");
    }
}
public class CollegeManagementSystem {
    public static void main(String[] args) {
        College college = new College();
        college.studentDetails();
        college.examTimings();
        System.out.println();
        School school = new School();
        school.studentDetails();
        school.examTimings();
    }
}
                }
            }
        }


