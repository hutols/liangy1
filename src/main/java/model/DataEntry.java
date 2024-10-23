package model;

public class DataEntry {
    private String a;
    private String b;
    private String c;

    public DataEntry(String a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "DataEntry{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                '}';
    }

    // Getters and Setters (可选)
}