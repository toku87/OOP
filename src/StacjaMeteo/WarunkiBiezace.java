package StacjaMeteo;


public class WarunkiBiezace implements IWyswietl,IObserwator{
    private float _temperatura;
    private float _cisnienie;
    private float _wilgotnosc;
    private IPodmiot _danePogodowe;

    WarunkiBiezace(IPodmiot danePogodowe) {
        _danePogodowe = danePogodowe;
        _danePogodowe.zarejestrujObserwatora(this);
    }


    @Override
    public void wyswietl() {
        System.out.printf("Aktualne dane : %f st C, %f  hPa, %f %% \n",_temperatura,_cisnienie,_wilgotnosc);

    }

    @Override
    public void aktualizuj(float temperatura, float cisnienie, float wilgotnosc) {
        _cisnienie = cisnienie;
        _temperatura = temperatura;
        _wilgotnosc = wilgotnosc;
        wyswietl();
    }
}
