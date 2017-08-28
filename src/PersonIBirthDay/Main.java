package PersonIBirthDay;


public class Main {

    public static void main(String[] args) {
        Person person = new Person("Jan", "Kowalski", "85232556557");
        System.out.println(person.getGender());
        System.out.println(person.lifeLength());
        System.out.println(person.getBirthdayDay());
        System.out.println(person.getBirthdayMonth());
        System.out.println(person.getBirthdayYear());
        System.out.println(person.getName());
        System.out.println(person.getGender());

    }
}
