package com.openxc.measurements;

import junit.framework.TestCase;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertNotNull;

import com.openxc.units.NewtonMeter;

public class PowertrainTorqueTest extends TestCase {
    PowertrainTorque measurement;

    @Override
    public void setUp() {
        measurement = new PowertrainTorque(new NewtonMeter(1.0));
    }

    public void testGet() {
        assertThat(measurement.getValue().doubleValue(), equalTo(1.0));
    }

    public void testHasRange() {
        assertTrue(measurement.hasRange());
    }

    public void testHasId() {
        assertNotNull(PowertrainTorque.ID);
    }
}