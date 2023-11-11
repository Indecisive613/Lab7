package org.example;

public class LifelineSite extends Site{
    double _units;
    double _rate;

    /**
     * Create a lifeline site
     *
     * @param unit
     * @param rate
     */
    public LifelineSite(double unit, double rate){
        this._units = unit;
        this._rate = rate;
    }

    /**
     * @return the billable amount
     */
    public double getBillableAmount(){
        double base = _units * _rate * 0.5;
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }
}
