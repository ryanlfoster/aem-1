package com.epam.aem.taglib;

import com.cqblueprints.taglib.CqSimpleTagSupport;
import com.squeakysand.jsp.tagext.annotations.JspTag;
import com.squeakysand.jsp.tagext.annotations.JspTagAttribute;

import javax.jcr.Session;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import java.io.IOException;

/**
 * Created by zetsubou_0 on 3.8.14.
 */
@JspTag
public class TestTag extends CqSimpleTagSupport {

    private String path;

    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspWriter();
        out.println("Build 2.25");
    }

    @JspTagAttribute(required = true, rtexprvalue = true)
    public void setPath(String path) {
        this.path = path;
    }
}
