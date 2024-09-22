// Student.java
public class Student implements IStudent
{
    private String fullName;
    private int id;
    private String dateOfBirth;
    private String nativePlace;
    private String studentClass;
    private String phoneNo;
    private int mobile;

    public Student(int id, String fullName, String dateOfBirth, String nativePlace, String studentClass, String phoneNo,
            int mobile)
    {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.nativePlace = nativePlace;
        this.studentClass = studentClass;
        this.phoneNo = phoneNo;
        this.mobile = mobile;
    }

    public String getStudentClass()
    {
        return studentClass;
    }

    @Override
    public void Display()
    {
        System.out.println("ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Native: " + nativePlace);
        System.out.println("Class: " + studentClass);
        System.out.println("Phone Number: " + phoneNo);
        System.out.println("Mobile: " + mobile);
        System.out.println("----------------------------");
    }
}
