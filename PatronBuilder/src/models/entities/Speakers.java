package models.entities;

public enum Speakers {

    Stereo,Surround;

    @Override
    public String toString() {
        return name();
    }
}
