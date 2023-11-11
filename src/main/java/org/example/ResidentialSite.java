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
        return _units * _rate;
    }

    public double getTaxAmount(){
        return getBaseAmount() * Site.TAX_RATE;
    }
}
