package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class commentsInput_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"myRating\" >\r\n");
      out.write("\t<form action=\"postRating.rate\" method=\"post\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<textarea id=\"comments\" name=\"comments\" onkeyup=\"enableOrDisable()\" class=\"span8\" placeholder=\"<spring:message code=\"comm.message\" text=\"\"/>\"> </textarea>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<input name=\"notation\" type=\"radio\" class=\"star\" value=\"1\"/>\r\n");
      out.write("\t\t\t<input name=\"notation\" type=\"radio\" class=\"star\" value=\"2\"/>\r\n");
      out.write("\t\t\t<input name=\"notation\" type=\"radio\" class=\"star\" checked=\"checked\" value=\"3\"/>\r\n");
      out.write("\t\t\t<input name=\"notation\" type=\"radio\" class=\"star\" value=\"4\"/>\r\n");
      out.write("\t\t\t<input name=\"notation\" type=\"radio\" class=\"star\" value=\"5\"/>\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<input id=\"submitButtonRating\" type=\"submit\" disabled=\"disabled\" value=\"<spring:message code=\"comm.post\" text=\"\"/>\"/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\">\r\n");
      out.write("\t\r\n");
      out.write("\tfunction enableOrDisable() {\r\n");
      out.write("\t\tvar textComments = $('#comments').val();\r\n");
      out.write("\t\tif (textComments == '') {\r\n");
      out.write("\t\t\t$('#submitButtonRating').prop('disabled', true);\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t$('#submitButtonRating').prop('disabled', false);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
