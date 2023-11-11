package org.example;

public class ResidentialSite extends Site{
    /**
     * Create a residential site
     *
     * @param unit
     * @param rate
     */
    public ResidentialSite(double unit, double rate){
        super(unit, rate);
    }

    public double getBaseAmount(){
        return 1;
    }

    public double getTaxAmount(){
        return 1;
    }
}
