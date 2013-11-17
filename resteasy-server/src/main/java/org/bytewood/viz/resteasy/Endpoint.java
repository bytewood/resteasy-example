package org.bytewood.viz.resteasy;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.bytewood.viz.resteasy.util.DateUtil;
import org.jboss.resteasy.links.AddLinks;
import org.jboss.resteasy.links.LinkResource;

@Path("things")
public class Endpoint {

    private HashMap<String, Thing> things = new HashMap<>();
    
    public Endpoint() {
        super();
        things.put("Person".toLowerCase(), new Thing(1, "Person", DateUtil.parse("2013-01-01"), BigDecimal.valueOf(1.01)));
        
    }
    
    @AddLinks
	@LinkResource(value = Thing.class)
	@GET
    public Collection<Thing> getThings() {
    	return things.values();
    }
    
    @AddLinks
    @LinkResource
    @GET
    @Path("/{name}")
    @Produces({"application/xml", "application/json"})
    public Thing getThing(@PathParam("name") String name) {
       return things.get(name.toLowerCase());
    }

}

