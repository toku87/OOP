package Computer;

/**
 * do poprawy true/false w booleanach, przyjmuje stałą wartość true
 */

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
    public String getManufacturerAndModel() {
        return String.format("Computer [producer=%s, model=%s", _manufacturer,_model);
    }
    public String getProcessorModel () {
        return _processorModel;
    }
    public String getMainboardModel () {
        return _mainBoardModel;
    }
    public float getAmountOfRam () {
        return _amountOfRam;
    }
    public void setAmountOfRam (float amountOfRam) {
        _amountOfRam = amountOfRam;
    }
    public void installWindows () {
        if (_hasOperatingSystem) {
            System.out.println("The operating system is not installed");
        }else {
            System.out.println("The operating system is already installed");
        }
    }
    public boolean isOperatingSystemInstalled () {
        if (_hasOperatingSystem) {
            System.out.println("System not installed");
        }else {
            System.out.println("System installed");
        }
        return isOperatingSystemInstalled();
    }
    public void mountSSD () {
        if (_hasSSD) {
            System.out.println("Mount SSD");
        }else {
            System.out.println("SSD is already mounted in your computer");
        }
    }

    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("Computer [")
               .append("producer=" + _manufacturer)
               .append(" model=" + _model)
               .append(" processor=" + _processorModel)
               .append(" mainBoard=" + _mainBoardModel)
               .append(" RAM=" + _amountOfRam);
       if (_hasOperatingSystem = false) {
           sb.append(" Without Windows");
       }else {
           sb.append(" Windows installed");
       }
       if (_hasSSD = false) {
           sb.append(" Without SSD");
       }else {
           sb.append(" With SSD");
       }
       return sb.toString();
    }
}
