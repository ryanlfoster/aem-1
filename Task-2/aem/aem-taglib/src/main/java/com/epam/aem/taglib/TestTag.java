package com.epam.aem.taglib;

import com.cqblueprints.taglib.CqSimpleTagSupport;
import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.designer.Design;
import com.day.cq.wcm.api.designer.Style;
import com.epam.aem.services.SessionServise;
import com.squeakysand.jsp.tagext.annotations.JspTag;
import com.squeakysand.jsp.tagext.annotations.JspTagAttribute;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * Created by zetsubou_0 on 3.8.14.
 */
@JspTag
public class TestTag extends CqSimpleTagSupport {

    private String path;

    private Page page;

    @Override
    public void doTag() throws JspException, IOException {
        SessionServise sessionServise = getService(SessionServise.class);
        JspWriter out = getJspWriter();
        Style style = getCurrentStyle();
        Design design = getCurrentDesign();
        page = getCurrentPage();
        out.println("<br>Style path: " + style.getPath());
        out.println("<br>Design path: " + design.getPath());
        out.println("<br>Page: " + page.getPath());
    }

    @JspTagAttribute(required = true, rtexprvalue = true)
    public void setPath(String path) {
        this.path = path;
    }
}
