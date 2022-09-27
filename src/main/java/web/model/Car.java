package web.model;


public class Car {

    private int carId;

    private String model;

    private int series;

    public Car() {

    }

    public Car(int carId, String model, int series) {
        this.carId = carId;
        this.model = model;
        this.series = series;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int id) {
        this.carId = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + carId +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
