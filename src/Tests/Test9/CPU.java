package Tests.Test9;

import java.util.Objects;

public class CPU {
    public CPU(String name, double clockSpeed) {
        this.name = name;
        this.clockSpeed = clockSpeed;
    }

    private String name;
    private double clockSpeed;

    public String getName() {
        return name;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClockSpeed(double clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CPU cpu = (CPU) o;
        return clockSpeed == cpu.clockSpeed &&
                Objects.equals(name, cpu.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, clockSpeed);
    }

    @Override
    public String toString() {
        return "CPU{" +
                "Модель ='" + name + '\'' +
                ", Тактовая частота =" + clockSpeed +
                "ГГц}";
    }
}
