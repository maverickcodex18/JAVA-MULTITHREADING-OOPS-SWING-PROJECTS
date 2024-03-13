package ass3;

class Employees{
    private String name;
    private int id;
    public Employees(final String name,final int id){
        this.name=name;
        this.id=id;
    }
}

class HourlyEmployee extends Employees{
    private int hourlyRate;
    private int hourlyWorked;
    public HourlyEmployee(final String name,final int id,final int hr,final int hw){
        super(name,id);
        hourlyRate=hr;
        hourlyWorked=hw;
    }
    public int getGrosspay(){
        return this.hourlyRate*this.hourlyWorked;
    }
}

public class q3 {
    public static void main(String[] args) {
        HourlyEmployee e=new HourlyEmployee("VK", 23, 6, 11);
        System.out.println(e.getGrosspay());
    }
}
