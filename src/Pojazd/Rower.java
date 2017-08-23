package Pojazd;


public class Rower implements IDwukolowy {
    @Override
    public void jedz() {
        System.out.println("Jade I I I I");
    }

    @Override
    public void hamuj() {
        System.out.println("Hamuje, ale slabo ....");
    }

    @Override
    public void przewrocSie() {
        System.out.println("I na boku ... auuuuaaaa");
    }
}
