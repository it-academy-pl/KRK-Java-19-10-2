package pl.itacademy.lesson17;

import java.io.Closeable;

public enum Planet {
    VENUS(6051.8, "Wenus"),
    EARTH(6371, "Ziemia"),
    MARS(3389.5, "Mars");

    private double radius;

    private String polishName;

    Planet(double radius, String polishName) {
        this.radius = radius;
        this.polishName = polishName;
    }

    public double getRadius() {
        return radius;
    }

    public double getEquatorLength() {
        return radius * 2 * Math.PI;
    }

    public String getPolishName() {
        return polishName;
    }

    public static Planet fromPolishName(String polishName) {
        for(Planet planet : values()) {
            if(planet.polishName.equals(polishName)) {
                return planet;
            }
        }
        throw new IllegalArgumentException("There are no planet with Polish name: " + polishName);
    }
}
