package PersonIBirthDay;


public class Person {

    private String _name;
    private String _surname;
    private String _PESEL;
    private char _gender;
    private BirthDay _birthDay;

    public Person (String name, String surname, String PESEL) {
        _name = name;
        _surname = surname;
        _birthDay = new BirthDay(PESEL);
        _gender = _birthDay.getGender();
    }

    public String getName() {
        return _name;
    }
    public String getSurname () {
        return _surname;
    }
    public char getGender () {
        return _gender;
    }
    public int getBirthdayYear() {
        return _birthDay.getYear();
    }
    public int getBirthdayMonth(){
        return _birthDay.getMonth();
    }

    public int getBirthdayDay(){
        return _birthDay.getDay();
    }

    public String getPESEL(){
        return _PESEL;
    }

    public long lifeLength(){
        return _birthDay.calculateDaysOfLife();
    }

}
