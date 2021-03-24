package edu.escuelaing.arep.parcial2tercio.service.impl;

import org.json.JSONObject;

import edu.escuelaing.arep.parcial2tercio.service.Calculator;

/**
 * Calulator
 * @author Alan Marin
 */
public class CalculatorImpl implements Calculator {
    
    private String tempOperation = "";
    private String tempNumber = "";

    @Override
    public Double tan(Double num){
        tempOperation = "tan";
        tempNumber =  "" + num;
        return Math.tan(num);
    }
    @Override
    public Double sqrt(Double num){
        tempOperation = "sqrt";
        tempNumber = ""+ num;
        return Math.sqrt(num);
    }
    
    @Override
    public JSONObject defaultOut(Double res){
        String temp = "{ operation:" + tempOperation + ",input:" + tempNumber +",output:"+ res +"}";
        JSONObject jsonObject = new JSONObject(temp);
        System.out.println(jsonObject.toString());
        return jsonObject;
    }
}