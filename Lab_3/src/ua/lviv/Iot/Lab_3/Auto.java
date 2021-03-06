package ua.lviv.Iot.Lab_3;

public class Auto extends Car{
    public String name;
    private String model;
    private String category;
    private Standart standart;
    private String engine;
    private int yearOfManufacture;
    private int price;
    private double engineCapacity;



    public Auto(

            String name, String model, String category, String standart,

            String engine, int yearOfManufacture, int price, double engineCapacity) {
        this.name = name;
        this.model = model;
        this.category = category;
      //  this.standart = Standart;
        this.engine = engine;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
        this.engineCapacity = engineCapacity;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getCategory() {
        return category;
    }

  //  public Standart getStandart() {
   //     return Standart;
//    }

    public String getEngine() {
        return engine;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public int getPrice() {
        return price;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setStandart(Standart standart) {
        this.standart = standart;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "name=" + name + ", model=" + model + ", category=" + category +
                ", standart=" + standart + ", engine=" + engine + ", yearOfManufacture=" + yearOfManufacture + ", price=" + price +
                ", engineCapacity=" + engineCapacity;
    }
}


