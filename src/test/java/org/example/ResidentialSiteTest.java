package org.example;

import static org.junit.Assert.*;

public class ResidentialSiteTest {

    @org.junit.Test
    public void getBillableAmount() {
        ResidentialSite s = new ResidentialSite(15.0, 0.5);
        assertEquals(8.475, s.getBillableAmount(), 0.01);
    }
}