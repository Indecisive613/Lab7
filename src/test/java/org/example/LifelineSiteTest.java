package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class LifelineSiteTest {

    @Test
    public void getBillableAmount() {
        LifelineSite s = new LifelineSite(15.0, 0.5);
        assertEquals(3.8475, s.getBillableAmount(), 0.01);
    }
}