package entities;

public class Employee extends Person {
    static private int id;
    private String name;
    private String surname;
    private String position;
    private double salary;
    public Employee() {

    }

    public Employee(String name, String surname,String position, double salary){
        super();
        //setId(id);
        setName(name);
        setSurname(surname);
        setPositon(position);
        setSalary(salary);
    }


    public int getId(){
        return id;}



    public void setId(int id ){
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname (String surname){
        this.surname = surname;
    }


    @Override
    public String toString() {
        return id + ": " + name  + " " + surname + ":" + position + "-" + salary;
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }


    @Override
    public String getPosition(){
        return position;
    }
    
    public void setPositon(String position){
        this.position = position;
    }
}