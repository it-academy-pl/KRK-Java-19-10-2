package pl.itacademy.lesson17;

public enum Planet {
    EARTH(6371),
    VENUS(6051.8),
    MARS(3389.5);

    private double radius;

    Planet(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getEquatorLength() {
        return radius * 2 * Math.PI;
    }

}
