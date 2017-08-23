package Computer;


public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Lenovo", "PS40", "Celeron", "Intel P240YY");
        System.out.println(computer);
        Computer computer2 = new Computer("IBM", "Yoga", "Pentium", "Intel PX44", 16, false, false);
        System.out.println(computer2);
    }

}
