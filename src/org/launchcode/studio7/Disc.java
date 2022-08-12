package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class Disc {
    private String name;
    private int storageCapacity;
    private int usedCapacity =0;
    private int remainingCapacity;
    private String discType;
    private int maxSpeed;
    private ArrayList<String> contents;

    public Disc(String name, int storageCapacity, String discType, int maxSpeed) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.remainingCapacity = this.storageCapacity;
        this.discType = discType;
        this.maxSpeed = maxSpeed;

    }

    public void writeData(int dataUsed, ArrayList<String> data) {
        // this.contents is initialized with data
        // this.usedCapacity = += dataUsed
        // remainingCapacity is updated (remainingCapacity - dataUsed)
        // console message telling user that the write was successful
    }

    public void showInfo() {
        //make string literal displaying all fields of the disc and write to console
    }


}
