package org.example;

public class ResidentialSite extends Site{
    double _units;
    double _rate;

    /**
     * Create a residential site
     *
     * @param unit
     * @param rate
     */
    public ResidentialSite(double unit, double rate){
        this._units = unit;
        this._rate = rate;
    }

    /**
     * @return the billable amount
     */
    public double getBillableAmount(){
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
