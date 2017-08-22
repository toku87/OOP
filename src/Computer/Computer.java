package Computer;

public class Computer {

    private String _manufacturer;
    private String _model;
    private String _processorModel;
    private String _mainBoardModel;
    private float _amountOfRam = 8;
    private boolean _hasOperatingSystem = false;
    private boolean _hasSSD = false;

    public Computer(String manufacturer, String model, String processorModel, String mainBoardModel) {
        _manufacturer = manufacturer;
        _model = model;
        _processorModel = processorModel;
        _mainBoardModel = mainBoardModel;
    }
    public Computer (String manufacturer, String model, String processorModel, String mainBoardModel, int amountOfRam,
                     boolean hasOperatingSystem, boolean hasSSD){
        _manufacturer = manufacturer;
        _model = model;
        _processorModel = processorModel;
        _mainBoardModel = mainBoardModel;
        _amountOfRam = amountOfRam;
        _hasOperatingSystem = hasOperatingSystem;
        _hasSSD = hasSSD;
    }

    public String toString() {
        return String.format("Computer [manufacturer =%s, model =%s, processorModel =%s, mainBoardModel =%s",
                _manufacturer,_model,_processorModel,_mainBoardModel);
    }
}
