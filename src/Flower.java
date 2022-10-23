import java.util.Date;

public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    private String name;

    public Flower(String name, String flowerColor, String country, double cost, int lifeSpan) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Цветок";
        }
        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "белый";
        }
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "белый";
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String formattedDouble = String.format("%.2f", cost);
        return name +
                ", цвет " + flowerColor + ", страна " + country +
                ", стоимость " + formattedDouble + " рублей" +
                ", время стояния " + lifeSpan + " суток";
    }
}
