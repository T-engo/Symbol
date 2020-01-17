package com.meditation.pojo;

import java.util.HashMap;
import java.util.Map;

public class vowels {
    private HashMap<String,String> shortTone;
    private HashMap<String,String> longTone;
    private HashMap<String,String> RTone;
    private HashMap<String,String> OTone;
    private HashMap<String,String> Tongue;

    public HashMap<String, String> getShortTone() {
        return shortTone;
    }

    public HashMap<String, String> getLongTone() {
        return longTone;
    }

    public HashMap<String, String> getRTone() {
        return RTone;
    }

    public HashMap<String, String> getOTone() {
        return OTone;
    }

    public HashMap<String, String> getTongue() {
        return Tongue;
    }

    public void setShortTone(HashMap<String, String> shortTone) {
        this.shortTone = shortTone;
    }

    public void setLongTone(HashMap<String, String> longTone) {
        this.longTone = longTone;
    }

    public void setRTone(HashMap<String, String> RTone) {
        this.RTone = RTone;
    }

    public void setOTone(HashMap<String, String> OTone) {
        this.OTone = OTone;
    }

    public void setTongue(HashMap<String, String> tongue) {
        Tongue = tongue;
    }

    public vowels(HashMap<String, String> shortTone, HashMap<String, String> longTone, HashMap<String, String> RTone, HashMap<String, String> OTone, HashMap<String, String> tongue) {
        this.shortTone = shortTone;
        this.longTone = longTone;
        this.RTone = RTone;
        this.OTone = OTone;
        Tongue = tongue;
    }

    @Override
    public String toString() {
        return "vowels{" +
                "shortTone=" + shortTone +
                ", longTone=" + longTone +
                ", RTone=" + RTone +
                ", OTone=" + OTone +
                ", Tongue=" + Tongue +
                '}';
    }
}
