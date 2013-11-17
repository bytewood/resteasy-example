package org.bytewood.viz.resteasy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EndpointTest {

    private Endpoint testObject;
    
    @Before
    public void setUp() throws Exception {
        testObject = new Endpoint();
    }

    @Test
    public void testGetPerson() {
        Thing person = testObject.getPerson();
        Assert.assertNotNull(person);
    }

}
