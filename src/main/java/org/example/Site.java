package org.example;

public abstract class Site {
    public static final double TAX_RATE = 0.13;
    protected double _units;
        protected double _rate;

    /**
     * Create a site
     */
    public Site(double units, double rate){
        this._units = units;
        this._rate = rate;
    }

    /**
     * @return the billable amount
     */
    public double getBillableAmount(){
        return getBaseAmount() + getTaxAmount();
    }

    /**
     * @return the base amount
     */
    public abstract double getBaseAmount();

    /**
     * @return the tax amount
     */
    public abstract double getTaxAmount();
}
