class employee{
    private String employeeName;
    private int employeeID;
    private String employeeDesignation;
    private String department;
    private long mobileNumber;
    private int salary;

    public employee(final String employeeName,final int employeeID,final String employeeDesignation,final String department,final long mobileNumber,final int salary){
        this.employeeName=employeeName;
        this.employeeID=employeeID;
        this.employeeDesignation=employeeDesignation;
        this.department=department;
        this.mobileNumber=mobileNumber;
        this.salary=salary;
    }

    public void show(){
        System.out.println("Employee Name: "+this.employeeName);
        System.out.println("Employee ID: "+this.employeeID);
        System.out.println("Employee Designation: "+this.employeeDesignation);
        System.out.println("Employee Department: "+this.department);
        System.out.println("Employee Mobile No: "+this.mobileNumber);
        System.out.println("Employee Salary: "+this.salary);
        System.out.println();
    }

}

public class assign2 {
    public static void main(String args[]){
        //creating ARRAY TO STORE EMPLOYEE DETAILS
        employee list[]=new employee[5];

        //creating 5 employee details
        employee vk = new employee("Virat Kohli", 18, "Batting At No.3", "India",123456 , 80000000);
        list[0]=vk;
        employee rs=new employee("Rohit Sharma", 45, "Batting At No. 1", "India", 636373, 100000000);
        list[1]=rs;
        employee abd=new employee("AB De Villiers", 17, "Agressive Batsman", "South Africa", 998273, 50000000);
        list[2]=abd;
        employee bs=new employee("Ben Stokes",55, "All Rounder", "England", 190963, 40000000);
        list[3]=bs;
        employee pc=new employee("Pat Cummins", 30, "Bowler", "Australia", 476298, 30000000);
        list[4]=pc;

        //iterating through list and showing details
        for (employee employeeI : list) {
            employeeI.show();
        }
    }
}
