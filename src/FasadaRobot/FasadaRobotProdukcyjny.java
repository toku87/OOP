package FasadaRobot;


public class FasadaRobotProdukcyjny {

    private CukierPuder _cukierPuder;
    private Ibuprofen _ibuprofen;
    private Talk _talk;
    private FormaTabletek _formaTabletek;

    public FasadaRobotProdukcyjny (CukierPuder cukierPuder, Ibuprofen ibuprofen, Talk talk, FormaTabletek formaTabletek){
        _cukierPuder = cukierPuder;
        _ibuprofen = ibuprofen;
        _talk = talk;
        _formaTabletek = formaTabletek;
    }

    public void przygotujPorcje(){
        _ibuprofen.zwazMaterial();
        _ibuprofen.rozdrobnijMaterial();
        _ibuprofen.dodajPorcje();
        _cukierPuder.zwazMaterial();
        _cukierPuder.usunGrodki();
        _cukierPuder.rozdrobnijMaterial();
        _cukierPuder.dodajPorcje();
        _talk.zwazMaterial();
        _talk.rozdrobnijMaterial();
        _talk.przesiejMaterial();
        _talk.dodajPorcje();
        _ibuprofen.zapakujMaterial();
    }
    public void przygotujTabletki(){
        _ibuprofen.zwazMaterial();
        _ibuprofen.rozdrobnijMaterial();
        _ibuprofen.dodajPorcje();
        _cukierPuder.zwazMaterial();
        _cukierPuder.usunGrodki();
        _cukierPuder.rozdrobnijMaterial();
        _cukierPuder.dodajPorcje();
        _talk.zwazMaterial();
        _talk.rozdrobnijMaterial();
        _talk.przesiejMaterial();
        _talk.dodajPorcje();
        _formaTabletek.zwazMaterial();
        _formaTabletek.przygotujForme();
        _formaTabletek.zrobTabletki();
    }

}
