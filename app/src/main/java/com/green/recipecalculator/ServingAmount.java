package com.green.recipecalculator;

/**
 * Created by JTipton on 3/17/2018.
 */

public class ServingAmount {
    private double servingSize = 1.0;
    private double servingSizeNew = 1.0;
    private double[] ingredientAmount = new double[20];
    private double[] updateIngredientAmount = new double[20];
    private double ratio;

    public ServingAmount() {
        super();
    }
    public ServingAmount(double Num){
        servingSize = Num;
    }
    public double getServingAmount(){
    return servingSize;
    }

    public void setServingAmount(double Num){
    servingSize = Num;
    }

    public double getNewServingAmount(){
    return servingSizeNew;
    }

    public void setNewServingAmount(double Num){
    servingSizeNew = Num;
    }

    public double getIngredientAmount(int index){
    return ingredientAmount[index];
    }

    public void setIngredientAmount(int index, double amount){
    ingredientAmount[index] = amount;
    }

    public double setUpdateIngredientAmount(int index) {
        ratio = servingSizeNew/servingSize;
        for (int i = 0; i<updateIngredientAmount.length; i++) {
            updateIngredientAmount[i] = ingredientAmount[i]*ratio;
        }
        return updateIngredientAmount[index];
    }

    public double getUpdateIngredientAmount(int index) {
    return updateIngredientAmount[index];
    }
}
