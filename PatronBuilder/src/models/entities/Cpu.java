package models.entities;

public enum Cpu {

    Intel,AMD;

    @Override
    public String toString() {
        return name();
    }
}
