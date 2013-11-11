package org.bytewood.viz.resteasy;

import java.math.BigDecimal;
import java.util.HashMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.bytewood.viz.resteasy.util.DateUtil;

@Path("things")
public class Endpoint {

    private HashMap<String, Thing> things = new HashMap<>();
    
    public Endpoint() {
        super();
        things.put("Person", new Thing(1, "Person", DateUtil.parse("2013-01-01"), BigDecimal.valueOf(1.01)));
    }
    
    @GET
    @Path("/persons")
    @Produces("application/json")
    public Thing getPerson() {
       return things.get("Person");
    }

}

