package com.example.yhjonathankwok.thelogbook_prototype;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by YH Jonathan Kwok on 27/3/2017.
 */

public class vehicle {
    //list of class entry objects
    int year = 1900;
    String make = null;
    String nakeName = null;
    double overAllMpg = 0.0;

    public void oampgAjdust(double newMpg){
        if (overAllMpg == 0.0)
            setOverAllMpg(newMpg);
        overAllMpg = (overAllMpg + newMpg) / 2.0;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getNakeName() {
        return nakeName;
    }

    public void setNakeName(String nakeName) {
        this.nakeName = nakeName;
    }

    //return the overall mpg with only 2 decimal place
    public double getOverAllMpg() {
        return BigDecimal.valueOf(overAllMpg).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public void setOverAllMpg(double overAllMpg) {
        this.overAllMpg = overAllMpg;
    }
}
