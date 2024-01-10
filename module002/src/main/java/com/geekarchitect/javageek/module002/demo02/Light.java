package com.geekarchitect.javageek.module002.demo02;

public enum Light {
    RED("红球",0,false),WHITE("白球",1,true);
    private String name;
    private int numValue;
    private boolean boolValue;

    Light(String name, int numValue, boolean boolValue) {
        this.name = name;
        this.numValue = numValue;
        this.boolValue = boolValue;
    }

    public static Light getLightByBoolValue(boolean boolValue){
        if(boolValue){
            return Light.WHITE;
        }else{
            return Light.RED;
        }
    }

    public String getName() {
        return name;
    }

    public int getNumValue() {
        return numValue;
    }

    public boolean isBoolValue() {
        return boolValue;
    }
}
