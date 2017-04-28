package com.example.yhjonathankwok.thelogbook_prototype;

/**
 * Created by YH Jonathan Kwok on 27/3/2017.
 */

public class entry {
    String type = null; //Gas / service
    double spent = 0.0;
    //datetime
    double serviceODO = 0.0;
    double trip = 0.0; //should only be available with Gas type
    double gallon = 0.0; //should only be available with Gas type

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    double mpg = 0.0; //should only be available with Gas type

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSpent() {
        return spent;
    }

    public void setSpent(double spent) {
        this.spent = spent;
    }

    public double getServiceODO() {
        return serviceODO;
    }

    public void setServiceODO(double serviceODO) {
        this.serviceODO = serviceODO;
    }

    public double getTrip() {
        return trip;
    }

    public void setTrip(double trip) {
        this.trip = trip;
    }

    public double getGallon() {
        return gallon;
    }

    public void setGallon(double gallon) {
        this.gallon = gallon;
    }
}
