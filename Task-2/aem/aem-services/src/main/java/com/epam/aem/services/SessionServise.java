package com.epam.aem.services;

import org.apache.felix.scr.annotations.*;
import org.apache.sling.jcr.api.SlingRepository;
import org.osgi.framework.Constants;

import javax.jcr.Session;

/**
 * Created by zetsubou_0 on 7.8.14.
 */
@Component(immediate = true, metatype = true)
@Service(SessionServise.class)
@Properties({
        @Property(name = Constants.SERVICE_VENDOR, value = ""),
        @Property(name = Constants.SERVICE_DESCRIPTION, value = "Provides repository session")
})
public class SessionServise {

    public String test() {
        String str = "";
        return str;
    }
}
