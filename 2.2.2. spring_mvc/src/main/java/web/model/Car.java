package web.model;

public class Car {
    private String mark;
    private String model;
    private String color;

    public Car(String mark, String model, String color) {
        this.mark = mark;
        this.model = model;
        this.color = color;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
