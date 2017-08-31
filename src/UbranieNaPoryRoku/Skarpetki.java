package UbranieNaPoryRoku;

/**
 * Created by RENT on 2017-08-31.
 */
public class Skarpetki implements IUbranie {
    @Override
    public void ubierzUbranie() {
        System.out.println("Ubieram skarpetki");
    }

    @Override
    public void zdejmijUbranie() {
        System.out.println("Zdejmuje skarpetki");
    }
}
