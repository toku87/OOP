package House;




public class House {
    private String _number;
    private String _street;
    private String _city;
    private String _postalCode;
    private int _floors = 1;

    public House(String number, String street, String city, String postalCode) {
        _number = number;
        _street = street;
        _city = city;
        _postalCode = postalCode;
    }
    public House(String number, String street, String city, String postalCode, int floors) {
        _number = number;
        _street = street;
        _city = city;
        _postalCode = postalCode;
        _floors = floors;
    }
    public String getNumber () {
        return _number;
    }
    public void setNumber (String number) {
        _number = number;
    }
    public String getStreet () {
        return _street;
    }
    public void setStreet (String street) {
        _street = street;
    }
    public String getCityAndPostalCode () {
        return String.format(_city + " , " + _postalCode);
    }
    public void setCityAndPostalCode (String city, String postalCode) {
        _city = city;
        _postalCode = postalCode;
    }
    public int getFloors () {
        return _floors;
    }
    public void setFloors (int floors) {
        _floors = floors;
    }
    public String toString () {
        return String.format("House [street=%s, number=%s, city=%s, postalCode=%s, floors=%d]",_street,_number,_city,_postalCode,_floors);
    }


}
