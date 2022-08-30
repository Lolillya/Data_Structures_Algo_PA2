import java.util.Comparator;

public class SortByName implements Comparator<Student>{

    public int compare(Student a, Student b)
    {
        int lastname_order = (a.getLastname() + a.getFirstname()).compareTo((b.getLastname() + b.getFirstname())),
            firstname_order = a.getFirstname().compareTo(b.getFirstname());

        if (lastname_order != 0 && firstname_order != 0)
            return lastname_order;
        else
            return firstname_order;
    }
    
}
