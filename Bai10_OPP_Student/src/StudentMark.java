class StudentMark implements IStudentMark
{
    private String fullName;
    private int id;
    private String studentClass;
    private int semester;
    private float averageMark;
    private int[] subjectMarkList = new int[5];

    public StudentMark(int id, String fullName, String studentClass, int semester, int[] subjectMarkList)
    {
        this.id = id;
        this.fullName = fullName;
        this.studentClass = studentClass;
        this.semester = semester;
        this.subjectMarkList = subjectMarkList;
        this.averageMark = AveCal();
    }

    @Override
    public void Display()
    {
        System.out.println("ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("Class: " + studentClass);
        System.out.println("Semester: " + semester);
        System.out.println("Average Mark: " + averageMark);
    }

    public float AveCal()
    {
        int sum = 0;
        for (int mark : subjectMarkList)
        {
            sum += mark;
        }
        return sum / (float) subjectMarkList.length;
    }
}
