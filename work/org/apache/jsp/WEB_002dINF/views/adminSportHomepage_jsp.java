package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminSportHomepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

	

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t<div id=\"sportAdmin\" class=\"container\">\r\n");
      out.write("\t\t<hr><hr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"hero-unit\">\r\n");
      out.write("        <h1>Sport partner administration portal</h1>\r\n");
      out.write("        <hr>\r\n");
      out.write("        <p>This area let you manage your partner activity with ProxyStation</p>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"span4\">\r\n");
      out.write("          <h2>Offer</h2>\r\n");
      out.write("          <p>You can create, update, search and delete the equipment you offer to ProxyStation customers</p>\r\n");
      out.write("          <p><a id=\"linkCategories\" class=\"btn\" href=\"category.adminSportPartner\">Manage categories &raquo;</a></p>\r\n");
      out.write("          <p><a id=\"linkOffer\"\t    class=\"btn\" href=\"offer.adminSportPartner\">Manage offer&raquo;</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"span4\">\r\n");
      out.write("          <h2>Listing</h2>\r\n");
      out.write("          <p>Retrieve the listing of equipment to prepare for incoming customers</p>\r\n");
      out.write("          <p><a id=\"linkListing\"    class=\"btn\" href=\"listing.adminSportPartner\">Manage &raquo;</a></p>\r\n");
      out.write("       </div>\r\n");
      out.write("        <div class=\"span4\">\r\n");
      out.write("          <h2>Return</h2>\r\n");
      out.write("          <p>Keep track of customer item return</p>\r\n");
      out.write("          <p><a id=\"linkReturn\"\t\tclass=\"btn\" href=\"returnList.adminSportPartner\">Manage &raquo;</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
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
