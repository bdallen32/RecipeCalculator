package com.green.recipecalculator;

/**
 * Created by BAllen on 3/8/2018.
 */

public class Conversion {
    private double desiredMeasurement;
    private int startUOM;
    private int desiredUOM;

    // teaspoons = 0, tablespoons = 1, ounces = 2, cups = 3
    private final static double[][] CONVERSION_FACTOR = {{1.0, 3.0, 6.0, 48.0},
                                                        {3.0, 1.0, 2.0, 16.0},
                                                        {6.0, 2.0, 1.0, 8.0},
                                                        {48.0, 16.0, 8.0, 1.0}};

    public double convert(double measurement, int startUOM, int desiredUOM){
        if (startUOM > desiredUOM) {
            desiredMeasurement = measurement / CONVERSION_FACTOR[startUOM][desiredUOM];
        }
        else {
            desiredMeasurement = measurement * CONVERSION_FACTOR[startUOM][desiredUOM];
        }
        return desiredMeasurement;
    }
}
