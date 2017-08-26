package PersonStudentStaff;

public class Staff extends Person{

    private String _school;
    private double _pay;

    public Staff (String name, String address, String school, double pay) {
        super(name, address);
        _school = school;
        _pay = pay;
    }
    public String getSchool () {
        return _school;
    }
    public void setSchool (String school) {
        _school = school;
    }
    public double getPay () {
        return _pay;
    }
    public void setPay (double pay) {
        _pay = pay;
    }
    public String toString () {
        return String.format("Staff [Person [name=%s, address=%s, school=%s, pay=%f", getName(), getAddress(), _school, _pay);
    }
}
