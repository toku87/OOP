package FasadaRobot;


public class Talk implements IZwazMaterial,IRozdrobnijMaterial,IDodajPorcje{
    @Override
    public void dodajPorcje() {
        System.out.println("Dodaje odważoną porcję");
    }

    @Override
    public void zwazMaterial() {
        System.out.println("Ważę całość ");
    }

    @Override
    public void rozdrobnijMaterial() {
        System.out.println("Rozcieram materiał blenderem");
    }
    public void przesiejMaterial(){
        System.out.println("Przesiewam talk przez sitko");
    }
}
