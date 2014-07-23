package com.epam.aem.taglib.osgi;

import com.squeakysand.jsp.tagext.EnhancedSimpleTagSupport;
import com.squeakysand.jsp.tagext.annotations.JspTag;

import javax.servlet.jsp.JspException;
import java.io.IOException;

/**
 * Created by zetsubou_0 on 21.7.14.
 */
@JspTag(name = "resource")
public class ResourceTag extends EnhancedSimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        getJspWriter().write("I am work");
    }
}
