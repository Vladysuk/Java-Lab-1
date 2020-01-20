package ua.lviv.iot;

public class Bicycle {
    private int numberOfGears;
    private int weightInKg;
    private int usersMaxWeightInKg;
    private String manufacturer;

    private String material;
    private String colour;

    private static int sizeOfFrame;

    protected String type;
    protected String typeOfBrakes ;

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public int getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(int weightInKg) {
        this.weightInKg = weightInKg;
    }

    public int getUsersMaxWeightInKg() {
        return usersMaxWeightInKg;
    }

    public void setUsersMaxWeightInKg(int usersMaxWeightInKg) {
        this.usersMaxWeightInKg = usersMaxWeightInKg;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeOfBrakes() {
        return typeOfBrakes;
    }

    public void setTypeOfBrakes(String typeOfBrakes) {
        this.typeOfBrakes = typeOfBrakes;
    }

    Bicycle(){}
    Bicycle(int numberOfGears, int weightInKg, int usersMaxWeightInKg, String manufacturer, String material , String colour, int sizeOfFrame, String type, String typeOfBrakes ){
        this.numberOfGears = numberOfGears;
        this.weightInKg = weightInKg;
        this.usersMaxWeightInKg = usersMaxWeightInKg;
        this.manufacturer = manufacturer;
        this.material = material;
        this.colour = colour;
        Bicycle.sizeOfFrame = sizeOfFrame;
        this.type = type;
        this.typeOfBrakes = typeOfBrakes;
    }
    Bicycle(int numberOfGears, int weightInKg, int usersMaxWeightInKg, String manufacturer){
        this(numberOfGears, weightInKg, usersMaxWeightInKg, manufacturer, null, null, 0, null, null);
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "Number Of Gears = " + numberOfGears +
                ", Weight In Kg = " + weightInKg +
                ", User's Max Weight In Kg = " + usersMaxWeightInKg +
                ", Manufacturer = '" + manufacturer + '\'' +
                ", Material = '" + material + '\'' +
                ", Colour = '" + colour + '\'' +
                ", Type = '" + type + '\'' +
                ", Type Of Brakes ='" + typeOfBrakes + '\'' +
                '}';
    }

    public String printSizeOfFrame(){
        return "Size Of Frame = " + sizeOfFrame;
    }
    public static String printStaticSizeOfFrame(){
        return "Static Size Of Frame = " + sizeOfFrame;
    }

    public void resetValues(int numberOfGears, int weightInKg, int usersMaxWeightInKg, String manufacturer, String material , String colour, int sizeOfFrame, String type, String typeOfBrakes ){
        this.numberOfGears = numberOfGears;
        this.weightInKg = weightInKg;
        this.usersMaxWeightInKg = usersMaxWeightInKg;
        this.manufacturer = manufacturer;
        this.material = material;
        this.colour = colour;
        Bicycle.sizeOfFrame = sizeOfFrame;
        this.type = type;
        this.typeOfBrakes = typeOfBrakes;
    }

}

