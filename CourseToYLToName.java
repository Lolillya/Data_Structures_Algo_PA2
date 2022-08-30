import java.util.Comparator;

public class CourseToYLToName implements Comparator<Student>{
    
    public int compare(Student a, Student b)
    {
        String a_Fullname = a.getLastname() + ", " + a.getFirstname();
        String b_Fullname = b.getLastname() + ", " + b.getFirstname();

        int sortAll = (a.getCourse() + a.getYearLevel() + a_Fullname)
        .compareTo(b.getCourse() + b.getYearLevel() + b_Fullname);

        return sortAll;
    }
}
