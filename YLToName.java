import java.util.Comparator;

public class YLToName implements Comparator<Student> {

    public int compare(Student a, Student b)
    {
        String a_Fullname = a.getLastname() + ", " + a.getFirstname();
        String b_Fullname = b.getLastname() + ", " + b.getFirstname();

        int yearLevelToName = (a.getYearLevel() + a_Fullname)
        .compareTo(b.getYearLevel() + b_Fullname);

        return yearLevelToName;
    }
    
}
