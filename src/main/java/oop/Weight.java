package oop;

import assignments.Distance;

import java.util.Queue;

public class Weight {
    private int kilogram;
    private int gram;
    private int weight;

    public Weight(int kilogram, int gram) {
        this.kilogram = kilogram + gram / 1000;
        this.gram = gram % 1000;
    }

    public Weight() {
        this(2000, 300);
    }

    public Weight(int gram) {
        this(0, 600);
    }

    public int getGram() {
        return gram;
    }

    public int getWeight() {
        return weight;
    }

    public int getKilogram() {
        return kilogram;
    }

    public void setGram(int gram) {
        this.gram = gram;
    }

    public void setKilogram(int kilogram) {
        this.kilogram = kilogram;
    }

    @Override
    public String toString() {
        return "Weight{" +
                "kilogram=" + kilogram +
                ", gram=" + gram +
                '}';
    }

    static Weight add(Weight first, Weight second) {
        int kilogram = first.kilogram + second.kilogram;
        int gram = first.gram + second.gram;
        return new Weight(kilogram, gram);
    }

    void add(Weight weight) {
        int temp;
        int gram = this.gram + weight.gram;
        int kilogram = this.kilogram + weight.kilogram;
        this.kilogram = kilogram + gram / 1000;
        this.gram = gram % 1000;

    }

    @Override
    public int hashCode() {
        int r = 1;
        r = r * 31 + kilogram;
        r = r * 31 + gram;
        return r;
    }

}

