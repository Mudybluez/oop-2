package entities;

public class Person implements Payable {
    static private int id;
    private String name;
    private String surname;
    private String position;
    Person(){

    }

    public Person(String name,String surname) {
        setId(id);
        setName(name);
        setSurname(surname);
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
        return "student:" + id +  name + surname;
    }




    @Override
    public String getPosition(){
        return (position!=null) ? position : "Student";
    }

    public double getPaymentAmount() {
        return 0.00;
    }


    public double printData() {
        return 0;
    }
}
