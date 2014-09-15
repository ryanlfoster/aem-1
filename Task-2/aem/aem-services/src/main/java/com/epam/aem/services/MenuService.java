package com.epam.aem.services;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;
import org.osgi.framework.Constants;

/**
 * Created by zetsubou_0 on 19.8.14.
 */
@Component(immediate = true, metatype = true)
@Service(MenuService.class)
@Properties({
        @Property(name = Constants.SERVICE_VENDOR, value = ""),
        @Property(name = Constants.SERVICE_DESCRIPTION, value = "Provides repository session")
})
public class MenuService {

}
