package org.example;

public class LifelineSite extends Site{

    /**
     * Create a lifeline site
     *
     * @param unit
     * @param rate
     */
    public LifelineSite(double unit, double rate){
        super(unit, rate);
    }

    public double getBaseAmount(){
        return _units * _rate * 0.5;
    }

    public double getTaxAmount(){
        return 1;
    }
}
