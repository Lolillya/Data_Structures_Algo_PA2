import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Main{
    public static void main(String[] args)throws FileNotFoundException {
        String lastname = null, firstname = null, 
        studentid = null, course = null;
        char gender = ' ';
        int yearLevel = 0;
    
        Student stud = new Student
        (lastname, firstname, studentid, course, gender, yearLevel);
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner in = new Scanner(new FileReader("student.txt"));

        while(in.hasNext()){

            studentid = in.nextLine();
            lastname = in.nextLine();
            firstname = in.nextLine();
            gender = in.next().charAt(0);
            in.nextLine();
            course = in.nextLine();
            yearLevel = in.nextInt();

            
            stud = new Student
            (lastname, firstname, studentid, course, gender, yearLevel);
            list.add(stud);

            if(in.hasNextLine())
                in.nextLine();
            else
                break;
        }

        for(Student ii : list)
            ii.display();

        System.out.println();

        Scanner input = new Scanner(System.in);
        int choice;

        System.out.println("1. Name");
        System.out.println("2. Course then Name");
        System.out.println("3. Year Level then Name");
        System.out.println("4. Course then Year Level and then Name");
        System.out.println("5. Exit");

        
        while(true){
            System.out.print("Sort by >> ");
            choice = input.nextInt();


            switch(choice){
                case 1:{
                    SortByName temp = new SortByName();
                    list.sort(temp);
    
                    System.out.println();
                    System.out.println("Sort By Name: ");
                    for(Student ii : list)
                      ii.display();
                    System.out.println();
                    break;
                }
                case 2:{
                    SortByCourseToName temp = new SortByCourseToName();
                    list.sort(temp);

                    System.out.println();
                    System.out.println("Sort By Course then Name: ");
                    for(Student ii : list)
                      ii.display();
                    System.out.println();
                    break;
                }
                case 3:{
                    YLToName temp = new YLToName();
                    list.sort(temp);
    
                    System.out.println();
                    System.out.println("Sort By Year Level then Name: ");
                    for(Student ii : list)
                      ii.display();
                    System.out.println();
                    break;
                }
                case 4:{
                    CourseToYLToName temp = new CourseToYLToName();
                    list.sort(temp);
    
                    System.out.println();
                    System.out.println("Sort By Course then Year Level then Name: ");
                    for(Student ii : list)
                      ii.display();
                    System.out.println();
                      break;
                }
                case 5: break;
                default: System.out.println("input out of bounds! \n");
            }
            if(choice == 5)
                break;
            else
                continue;
        }
        System.out.print("Thank you for using the program :)");
        input.close();
        in.close();
    }
}