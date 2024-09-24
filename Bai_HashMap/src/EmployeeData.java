class EmployeeData 
{
    private String name;
    private int salary;

    public EmployeeData(String nm) 
    {
        name = nm;
        salary = 60000; 
    }

    
    public String toString() 
    {
        return "[name=" + name + ", salary=" + salary + "]";
    }
}