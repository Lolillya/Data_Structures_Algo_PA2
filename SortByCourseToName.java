import java.util.Comparator;

public class SortByCourseToName implements Comparator<Student> {
    
    public int compare(Student a, Student b)
    {
        String a_Fullname = a.getLastname() + ", " + a.getFirstname();
        String b_Fullname = b.getLastname() + ", " + b.getFirstname();

        int courseToName = (a.getCourse() + a_Fullname).compareTo(b.getCourse() + b_Fullname);

        return courseToName;
    }
}
