package PersonIBirthDay;


public class Person {

    private String _name;
    private String _surname;
    private String _PESEL;
    private char _gender;
    private String _birthDay;

    public Person (String name, String surname, String PESEL) {
        this._name = name;
        this._surname = surname;
        this._PESEL = PESEL;
    }

    public String getUserData () {
        return _name + _surname + _PESEL + _gender + _birthDay;
    }
    public BirthDay setUserData() {
        String yearInPesel = "";
        String monthInPesel = "";
        String dayInPesel="";

        if (Integer.parseInt(_PESEL.substring(2,4))>=81 && Integer.parseInt(_PESEL.substring(2,4))<=92 ){
            StringBuilder sb = new StringBuilder();
            sb.append("18").append(_PESEL.substring(0,2));
            yearInPesel = sb.toString();
            monthInPesel = _PESEL.substring(2,4);
            int monthTemp = Integer.parseInt(monthInPesel);
            int month = Math.abs(80 - monthTemp);
            monthInPesel = Integer.toString(month);
            dayInPesel = _PESEL.substring(4,6);
        }
        else if (Integer.parseInt(_PESEL.substring(2,4))>=1 && Integer.parseInt(_PESEL.substring(2,4))<=12 ){
            StringBuilder sb = new StringBuilder();
            sb.append("19").append(_PESEL.substring(0,2));
            yearInPesel = sb.toString();
            monthInPesel = _PESEL.substring(2,4);
            dayInPesel = _PESEL.substring(4,6);
        }
        else  {
            StringBuilder sb = new StringBuilder();
            sb.append("20").append(_PESEL.substring(0,2));
            yearInPesel = sb.toString();
            monthInPesel = _PESEL.substring(2,4);
            int monthTemp = Integer.parseInt(monthInPesel);
            int month = (20 - monthTemp);
            monthInPesel = Integer.toString(month);
            dayInPesel = _PESEL.substring(4,6);
        }
        String gender = _PESEL.substring(9,10);
        if (Integer.parseInt(gender)%2 ==0 || (Integer.parseInt(gender))%2==2){
            _gender = 'F';
        }else
            _gender = 'M';
        
        return setUserData();
    }
}
