package FasadaRobot;

public class FormaTabletek implements IZwazMaterial{

    @Override
    public void zwazMaterial() {
        System.out.println("Odmierzam odpowiednią porcje");
    }
    public void przygotujForme(){
        System.out.println("Przygotowuję formę do tabletek");
    }
    public void zrobTabletki() {
        System.out.println("Robię tabletki");
    }
}
