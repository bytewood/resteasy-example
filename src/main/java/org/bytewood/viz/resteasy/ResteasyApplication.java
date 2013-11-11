package org.bytewood.viz.resteasy;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class ResteasyApplication extends Application {
    HashSet<Object> singletons = new HashSet<Object>();

    public ResteasyApplication()
    {
       singletons.add(new Endpoint());
    }

    @Override
    public Set<Class<?>> getClasses()
    {
       HashSet<Class<?>> set = new HashSet<Class<?>>();
       return set;
    }

    @Override
    public Set<Object> getSingletons()
    {
       return singletons;  
    }

}
