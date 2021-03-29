package com.company;

public class HSVColor implements Comparable<HSVColor> {
    private int hue;
    private double saturation;
    private double value;

    public HSVColor(int hue, double saturation, double value) {
        if (hue > 360 || saturation > 1 || value > 1)
            throw new ColorFormatException("zle");

            this.hue = hue;
        this.saturation = saturation;
        this.value = value;
    }

    public int getHue() {
        return hue;
    }

    public double getSaturation() {
        return saturation;
    }

    public double getValue() {
        return value;
    }

    @Override
    public int compareTo(HSVColor o) {
        int logic = 0;
        if (this.value - o.value < 0) logic = 1;
        else logic = -1;

        return logic;

    }
}
