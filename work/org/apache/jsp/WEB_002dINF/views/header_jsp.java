package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.release();
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("      <div class=\"navbar-inner\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("        \r\n");
      out.write("          <button type=\"button\" class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("        \r\n");
      out.write("          <a class=\"brand\" href=\"#\">ProxyStation </a>\r\n");
      out.write("        \r\n");
      out.write("          <div class=\"nav-collapse collapse\">\r\n");
      out.write("           \r\n");
      out.write("            <ul class=\"nav\">\r\n");
      out.write("           \t\r\n");
      out.write("              <li class=\"active\">\r\n");
      out.write("              \t\r\n");
      out.write("              \t<a href=\".\">\r\n");
      out.write("              \t\t<i class=\"icon-home icon-white\"></i> \r\n");
      out.write("\t\t  \t\t\t");
      if (_jspx_meth_spring_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t  </li>\r\n");
      out.write("              \r\n");
      out.write("              ");
      if (_jspx_meth_sec_005fauthorize_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("              \r\n");
      out.write("              ");
      if (_jspx_meth_sec_005fauthorize_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("             \t<li>\r\n");
      out.write("             \t\t<a id=\"linkContact\" href=\"returnViewContact.contact\" >\r\n");
      out.write("             \t\t<i class=\"icon-envelope icon-white\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f3(_jspx_page_context))
        return;
      out.write("</a>\r\n");
      out.write("             \t</li>\r\n");
      out.write("              \r\n");
      out.write("              ");
      if (_jspx_meth_sec_005fauthorize_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("              \r\n");
      out.write("              ");
      if (_jspx_meth_sec_005fauthorize_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("              ");
      if (_jspx_meth_sec_005fauthorize_005f4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("              ");
      if (_jspx_meth_sec_005fauthorize_005f5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("              ");
      if (_jspx_meth_sec_005fauthorize_005f6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("              \r\n");
      out.write("              <li><a id=\"linkRating\" href=\"showFirstsRatings.rate\" ><i class=\"icon-comment icon-white\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f42(_jspx_page_context))
        return;
      out.write("</a></li>\r\n");
      out.write("              \r\n");
      out.write("              ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t  ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("              \r\n");
      out.write("            </ul>\r\n");
      out.write("            \r\n");
      out.write("           ");
      if (_jspx_meth_sec_005fauthorize_005f7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            \r\n");
      out.write("          </div><!--/.nav-collapse -->\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("<body>");
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

  private boolean _jspx_meth_spring_005fmessage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f0 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f0.setParent(null);
    // /WEB-INF/views/header.jsp(32,7) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f0.setCode("head.home");
    // /WEB-INF/views/header.jsp(32,7) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f0.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f0 = _jspx_th_spring_005fmessage_005f0.doStartTag();
      if (_jspx_th_spring_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_005fauthorize_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sec_005fauthorize_005f0.setParent(null);
    // /WEB-INF/views/header.jsp(36,14) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sec_005fauthorize_005f0.setAccess("hasRole('ROLE_USER')");
    int _jspx_eval_sec_005fauthorize_005f0 = _jspx_th_sec_005fauthorize_005f0.doStartTag();
    if (_jspx_eval_sec_005fauthorize_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("              \t<li><a href=\"loginValid.security\"><i class=\"icon-shopping-cart icon-white\"></i>\r\n");
      out.write("\t\t\t\t        ");
      if (_jspx_meth_spring_005fmessage_005f1(_jspx_th_sec_005fauthorize_005f0, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("              \t \t</a>\r\n");
      out.write("              \t</li>\r\n");
      out.write("              ");
    }
    if (_jspx_th_sec_005fauthorize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f0);
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f1 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f0);
    // /WEB-INF/views/header.jsp(38,12) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f1.setCode("head.usr.book");
    // /WEB-INF/views/header.jsp(38,12) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f1.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f1 = _jspx_th_spring_005fmessage_005f1.doStartTag();
      if (_jspx_th_spring_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f1.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f1 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_005fauthorize_005f1.setPageContext(_jspx_page_context);
    _jspx_th_sec_005fauthorize_005f1.setParent(null);
    // /WEB-INF/views/header.jsp(43,14) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sec_005fauthorize_005f1.setAccess("isAnonymous()");
    int _jspx_eval_sec_005fauthorize_005f1 = _jspx_th_sec_005fauthorize_005f1.doStartTag();
    if (_jspx_eval_sec_005fauthorize_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("              \t<li>\r\n");
      out.write("              \t\t<a id=\"linkAccount\" href=\"creation.customer\">\r\n");
      out.write("              \t\t<i class=\"icon-user icon-white\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f2(_jspx_th_sec_005fauthorize_005f1, _jspx_page_context))
        return true;
      out.write("</a>\r\n");
      out.write("              \t</li>\r\n");
      out.write("              ");
    }
    if (_jspx_th_sec_005fauthorize_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f1);
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f2 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f2.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f1);
    // /WEB-INF/views/header.jsp(46,53) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f2.setCode("head.signup");
    // /WEB-INF/views/header.jsp(46,53) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f2.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f2 = _jspx_th_spring_005fmessage_005f2.doStartTag();
      if (_jspx_th_spring_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f2.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f3 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f3.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f3.setParent(null);
    // /WEB-INF/views/header.jsp(51,56) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f3.setCode("head.contact");
    // /WEB-INF/views/header.jsp(51,56) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f3.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f3 = _jspx_th_spring_005fmessage_005f3.doStartTag();
      if (_jspx_th_spring_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f3.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f2 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_005fauthorize_005f2.setPageContext(_jspx_page_context);
    _jspx_th_sec_005fauthorize_005f2.setParent(null);
    // /WEB-INF/views/header.jsp(54,14) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sec_005fauthorize_005f2.setAccess("hasRole('ROLE_USER')");
    int _jspx_eval_sec_005fauthorize_005f2 = _jspx_th_sec_005fauthorize_005f2.doStartTag();
    if (_jspx_eval_sec_005fauthorize_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("              \t<li class=\"dropdown\">\r\n");
      out.write("\t              <a id=\"customerLink\" href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("\t              \t<i class=\"icon-user icon-white\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f4(_jspx_th_sec_005fauthorize_005f2, _jspx_page_context))
        return true;
      out.write(" <b class=\"caret\"></b>\r\n");
      out.write("\t              </a>\r\n");
      out.write("\t              <ul class=\"dropdown-menu\">\r\n");
      out.write("\t                <li class=\"divider\"></li>\r\n");
      out.write("\t                <li><a id=\"linkCustomer\" href=\"#\"><i class=\"icon-user\"></i>");
      if (_jspx_meth_spring_005fmessage_005f5(_jspx_th_sec_005fauthorize_005f2, _jspx_page_context))
        return true;
      out.write("</a></li>\r\n");
      out.write("\t                <li><a id=\"linkCustomer\" href=\"history.customer\"><i class=\"icon-list\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f6(_jspx_th_sec_005fauthorize_005f2, _jspx_page_context))
        return true;
      out.write("</a></li>\r\n");
      out.write("\t              </ul>\r\n");
      out.write("\t            </li>\r\n");
      out.write("              ");
    }
    if (_jspx_th_sec_005fauthorize_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f2);
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f4 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f4.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f2);
    // /WEB-INF/views/header.jsp(57,53) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f4.setCode("head.usr.account");
    // /WEB-INF/views/header.jsp(57,53) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f4.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f4 = _jspx_th_spring_005fmessage_005f4.doStartTag();
      if (_jspx_th_spring_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f4.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f5 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f5.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f2);
    // /WEB-INF/views/header.jsp(61,76) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f5.setCode("head.usr.information");
    // /WEB-INF/views/header.jsp(61,76) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f5.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f5 = _jspx_th_spring_005fmessage_005f5.doStartTag();
      if (_jspx_th_spring_005fmessage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f5.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f6 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f6.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f2);
    // /WEB-INF/views/header.jsp(62,92) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f6.setCode("head.usr.history");
    // /WEB-INF/views/header.jsp(62,92) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f6.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f6 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f6 = _jspx_th_spring_005fmessage_005f6.doStartTag();
      if (_jspx_th_spring_005fmessage_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f6.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f6);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f3 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_005fauthorize_005f3.setPageContext(_jspx_page_context);
    _jspx_th_sec_005fauthorize_005f3.setParent(null);
    // /WEB-INF/views/header.jsp(67,14) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sec_005fauthorize_005f3.setAccess("hasRole('ROLE_ADMIN')");
    int _jspx_eval_sec_005fauthorize_005f3 = _jspx_th_sec_005fauthorize_005f3.doStartTag();
    if (_jspx_eval_sec_005fauthorize_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("\t              <li class=\"dropdown\">\r\n");
      out.write("\t                <a id=\"adminLink\" href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"icon-lock icon-white\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f7(_jspx_th_sec_005fauthorize_005f3, _jspx_page_context))
        return true;
      out.write(" <b class=\"caret\"></b></a>\r\n");
      out.write("\t                <ul class=\"dropdown-menu\">\r\n");
      out.write("\t                  <li><a href=\"home.admin\"><i class=\"icon-home\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f8(_jspx_th_sec_005fauthorize_005f3, _jspx_page_context))
        return true;
      out.write("</a></li>\r\n");
      out.write("\t                  <li class=\"divider\"></li>\r\n");
      out.write("\t                  <li class=\"nav-header\">");
      if (_jspx_meth_spring_005fmessage_005f9(_jspx_th_sec_005fauthorize_005f3, _jspx_page_context))
        return true;
      out.write("</li>\r\n");
      out.write("\t                  <li><a id=\"linkAdmin\" href=\"season.admin\"><i class=\"icon-adjust\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f10(_jspx_th_sec_005fauthorize_005f3, _jspx_page_context))
        return true;
      out.write("</a></li>\r\n");
      out.write("\t                  <li><a id=\"linkAdmin\" href=\"period.admin\"><i class=\"icon-calendar\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f11(_jspx_th_sec_005fauthorize_005f3, _jspx_page_context))
        return true;
      out.write("</a></li>\r\n");
      out.write("\t                  <li><a id=\"linkAdmin\" href=\"price.admin\"><i class=\"icon-barcode\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f12(_jspx_th_sec_005fauthorize_005f3, _jspx_page_context))
        return true;
      out.write("</a></li>\r\n");
      out.write("\t                  <li><a id=\"linkAdmin\" href=\"flatType.admin\"><i class=\"icon-th-large\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f13(_jspx_th_sec_005fauthorize_005f3, _jspx_page_context))
        return true;
      out.write("</a></li>\r\n");
      out.write("\t                  <li><a id=\"linkAdmin\" href=\"flat.admin\"><i class=\"icon-th\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f14(_jspx_th_sec_005fauthorize_005f3, _jspx_page_context))
        return true;
      out.write("</a></li>\r\n");
      out.write("\t                  <li><a id=\"linkAdmin\" href=\"option.admin\"><i class=\"icon-tags\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f15(_jspx_th_sec_005fauthorize_005f3, _jspx_page_context))
        return true;
      out.write("</a></li>\r\n");
      out.write("\t                  <li class=\"divider\"></li>\r\n");
      out.write("\t                  <li class=\"nav-header\">");
      if (_jspx_meth_spring_005fmessage_005f16(_jspx_th_sec_005fauthorize_005f3, _jspx_page_context))
        return true;
      out.write("</li>\r\n");
      out.write("\t                  <li><a id=\"linkAdmin\" href=\"partner.admin\"><i class=\"icon-briefcase\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f17(_jspx_th_sec_005fauthorize_005f3, _jspx_page_context))
        return true;
      out.write("</a></li>\r\n");
      out.write("\t                  <li><a id=\"linkAdmin\" href=\"user.admin\"><i class=\"icon-user\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f18(_jspx_th_sec_005fauthorize_005f3, _jspx_page_context))
        return true;
      out.write("</a></li>\r\n");
      out.write("\t                  <li class=\"divider\"></li>\r\n");
      out.write("\t                  <li class=\"nav-header\">");
      if (_jspx_meth_spring_005fmessage_005f19(_jspx_th_sec_005fauthorize_005f3, _jspx_page_context))
        return true;
      out.write("</li>\r\n");
      out.write("\t                  <li><a id=\"linkAdmin\" href=\"adminRatings.rate\"><i class=\"icon-comment\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f20(_jspx_th_sec_005fauthorize_005f3, _jspx_page_context))
        return true;
      out.write("</a></li>\r\n");
      out.write("\t                  <li class=\"divider\"></li>\r\n");
      out.write("\t                  <li class=\"nav-header\">");
      if (_jspx_meth_spring_005fmessage_005f21(_jspx_th_sec_005fauthorize_005f3, _jspx_page_context))
        return true;
      out.write("</li>\r\n");
      out.write("\t                  <li><a id=\"linkAdmin\" href=\"adminStatistics.reporting\"><i class=\"icon-signal\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f22(_jspx_th_sec_005fauthorize_005f3, _jspx_page_context))
        return true;
      out.write("</a></li>\r\n");
      out.write("\t                  <li class=\"nav-header\">");
      if (_jspx_meth_spring_005fmessage_005f23(_jspx_th_sec_005fauthorize_005f3, _jspx_page_context))
        return true;
      out.write("</li>\r\n");
      out.write("\t                   <li><a id=\"linkAdmin\" href=\"research.customer\"><i class=\"icon-user\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f24(_jspx_th_sec_005fauthorize_005f3, _jspx_page_context))
        return true;
      out.write("</a></li>\r\n");
      out.write("\t                </ul>\r\n");
      out.write("\t              </li>\r\n");
      out.write("              ");
    }
    if (_jspx_th_sec_005fauthorize_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f3);
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f7 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f7.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f3);
    // /WEB-INF/views/header.jsp(69,128) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f7.setCode("head.adm");
    // /WEB-INF/views/header.jsp(69,128) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f7.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f7 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f7 = _jspx_th_spring_005fmessage_005f7.doStartTag();
      if (_jspx_th_spring_005fmessage_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f7.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f7);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f8 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f8.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f3);
    // /WEB-INF/views/header.jsp(71,70) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f8.setCode("head.adm.home");
    // /WEB-INF/views/header.jsp(71,70) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f8.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f8 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f8 = _jspx_th_spring_005fmessage_005f8.doStartTag();
      if (_jspx_th_spring_005fmessage_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f8.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f8);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f9 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f9.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f3);
    // /WEB-INF/views/header.jsp(73,42) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f9.setCode("head.adm.offer");
    // /WEB-INF/views/header.jsp(73,42) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f9.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f9 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f9 = _jspx_th_spring_005fmessage_005f9.doStartTag();
      if (_jspx_th_spring_005fmessage_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f9[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f9.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f9.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f9);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f10 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f10.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f3);
    // /WEB-INF/views/header.jsp(74,89) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f10.setCode("head.adm.offer.season");
    // /WEB-INF/views/header.jsp(74,89) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f10.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f10 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f10 = _jspx_th_spring_005fmessage_005f10.doStartTag();
      if (_jspx_th_spring_005fmessage_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f10[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f10.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f10.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f10);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f11 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f11.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f3);
    // /WEB-INF/views/header.jsp(75,91) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f11.setCode("head.adm.offer.period");
    // /WEB-INF/views/header.jsp(75,91) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f11.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f11 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f11 = _jspx_th_spring_005fmessage_005f11.doStartTag();
      if (_jspx_th_spring_005fmessage_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f11[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f11.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f11.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f11);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f12 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f12.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f3);
    // /WEB-INF/views/header.jsp(76,89) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f12.setCode("head.adm.offer.price");
    // /WEB-INF/views/header.jsp(76,89) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f12.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f12 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f12 = _jspx_th_spring_005fmessage_005f12.doStartTag();
      if (_jspx_th_spring_005fmessage_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f12[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f12.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f12.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f12);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f13 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f13.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f3);
    // /WEB-INF/views/header.jsp(77,93) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f13.setCode("head.adm.offer.type");
    // /WEB-INF/views/header.jsp(77,93) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f13.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f13 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f13 = _jspx_th_spring_005fmessage_005f13.doStartTag();
      if (_jspx_th_spring_005fmessage_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f13[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f13.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f13.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f13);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f14 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f14.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f3);
    // /WEB-INF/views/header.jsp(78,83) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f14.setCode("head.adm.offer.flat");
    // /WEB-INF/views/header.jsp(78,83) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f14.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f14 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f14 = _jspx_th_spring_005fmessage_005f14.doStartTag();
      if (_jspx_th_spring_005fmessage_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f14[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f14.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f14.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f14);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f15 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f15.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f3);
    // /WEB-INF/views/header.jsp(79,87) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f15.setCode("head.adm.offer.option");
    // /WEB-INF/views/header.jsp(79,87) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f15.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f15 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f15 = _jspx_th_spring_005fmessage_005f15.doStartTag();
      if (_jspx_th_spring_005fmessage_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f15[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f15.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f15.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f15);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f16 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f16.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f3);
    // /WEB-INF/views/header.jsp(81,42) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f16.setCode("head.adm.part");
    // /WEB-INF/views/header.jsp(81,42) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f16.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f16 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f16 = _jspx_th_spring_005fmessage_005f16.doStartTag();
      if (_jspx_th_spring_005fmessage_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f16[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f16.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f16.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f16);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f17 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f17.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f3);
    // /WEB-INF/views/header.jsp(82,93) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f17.setCode("head.adm.part.comp");
    // /WEB-INF/views/header.jsp(82,93) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f17.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f17 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f17 = _jspx_th_spring_005fmessage_005f17.doStartTag();
      if (_jspx_th_spring_005fmessage_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f17[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f17.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f17.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f17);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f18 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f18.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f3);
    // /WEB-INF/views/header.jsp(83,85) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f18.setCode("head.adm.part.usr");
    // /WEB-INF/views/header.jsp(83,85) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f18.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f18 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f18 = _jspx_th_spring_005fmessage_005f18.doStartTag();
      if (_jspx_th_spring_005fmessage_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f18[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f18.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f18.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f18);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f19 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f19.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f3);
    // /WEB-INF/views/header.jsp(85,42) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f19.setCode("head.adm.com");
    // /WEB-INF/views/header.jsp(85,42) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f19.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f19 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f19 = _jspx_th_spring_005fmessage_005f19.doStartTag();
      if (_jspx_th_spring_005fmessage_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f19[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f19.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f19.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f19);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f20 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f20.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f3);
    // /WEB-INF/views/header.jsp(86,95) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f20.setCode("head.adm.com");
    // /WEB-INF/views/header.jsp(86,95) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f20.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f20 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f20 = _jspx_th_spring_005fmessage_005f20.doStartTag();
      if (_jspx_th_spring_005fmessage_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f20[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f20.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f20.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f20);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f21 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f21.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f3);
    // /WEB-INF/views/header.jsp(88,42) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f21.setCode("head.adm.report");
    // /WEB-INF/views/header.jsp(88,42) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f21.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f21 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f21 = _jspx_th_spring_005fmessage_005f21.doStartTag();
      if (_jspx_th_spring_005fmessage_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f21[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f21.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f21.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f21);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f22 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f22.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f3);
    // /WEB-INF/views/header.jsp(89,102) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f22.setCode("head.adm.report");
    // /WEB-INF/views/header.jsp(89,102) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f22.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f22 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f22 = _jspx_th_spring_005fmessage_005f22.doStartTag();
      if (_jspx_th_spring_005fmessage_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f22[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f22.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f22.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f22);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f23(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f23 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f23.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f3);
    // /WEB-INF/views/header.jsp(90,42) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f23.setCode("head.adm.search");
    // /WEB-INF/views/header.jsp(90,42) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f23.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f23 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f23 = _jspx_th_spring_005fmessage_005f23.doStartTag();
      if (_jspx_th_spring_005fmessage_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f23[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f23.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f23.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f23);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f24 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f24.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f3);
    // /WEB-INF/views/header.jsp(91,93) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f24.setCode("head.adm.search.cust");
    // /WEB-INF/views/header.jsp(91,93) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f24.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f24 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f24 = _jspx_th_spring_005fmessage_005f24.doStartTag();
      if (_jspx_th_spring_005fmessage_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f24[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f24.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f24.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f24);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f4 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_005fauthorize_005f4.setPageContext(_jspx_page_context);
    _jspx_th_sec_005fauthorize_005f4.setParent(null);
    // /WEB-INF/views/header.jsp(95,14) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sec_005fauthorize_005f4.setAccess("hasRole('ROLE_PARTNER_SPORT')");
    int _jspx_eval_sec_005fauthorize_005f4 = _jspx_th_sec_005fauthorize_005f4.doStartTag();
    if (_jspx_eval_sec_005fauthorize_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("\t              <li class=\"dropdown\">\r\n");
      out.write("\t                <a id=\"adminLink\"href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"icon-lock icon-white\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f25(_jspx_th_sec_005fauthorize_005f4, _jspx_page_context))
        return true;
      out.write(" <b class=\"caret\"></b></a>\r\n");
      out.write("\t                <ul class=\"dropdown-menu\">\r\n");
      out.write("\t                  <li class=\"divider\"></li>\r\n");
      out.write("\t                  <li class=\"nav-header\">");
      if (_jspx_meth_spring_005fmessage_005f26(_jspx_th_sec_005fauthorize_005f4, _jspx_page_context))
        return true;
      out.write("</li>\r\n");
      out.write("\t                  <li><a id=\"linkAdminSportPartner\" href=\"home.adminSportPartner\"><i class=\"icon-home\"></i>");
      if (_jspx_meth_spring_005fmessage_005f27(_jspx_th_sec_005fauthorize_005f4, _jspx_page_context))
        return true;
      out.write("</a></li>\r\n");
      out.write("\t                  <li><a id=\"linkAdminSportPartner\" href=\"category.adminSportPartner\"><i class=\"icon-th-large\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f28(_jspx_th_sec_005fauthorize_005f4, _jspx_page_context))
        return true;
      out.write("</a></li>\r\n");
      out.write("\t                  <li><a id=\"linkAdminSportPartner\" href=\"offer.adminSportPartner\"><i class=\"icon-tags\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f29(_jspx_th_sec_005fauthorize_005f4, _jspx_page_context))
        return true;
      out.write("</a></li>\r\n");
      out.write("\t                  <li><a id=\"linkAdminSportPartner\" href=\"listing.adminSportPartner\"><i class=\"icon-list\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f30(_jspx_th_sec_005fauthorize_005f4, _jspx_page_context))
        return true;
      out.write("</a></li>\r\n");
      out.write("\t                  <li><a id=\"linkAdminSportPartner\" href=\"returnList.adminSportPartner\"><i class=\"icon-arrow-right\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f31(_jspx_th_sec_005fauthorize_005f4, _jspx_page_context))
        return true;
      out.write("</a></li>\r\n");
      out.write("\t                </ul>\r\n");
      out.write("\t              </li>\r\n");
      out.write("              ");
    }
    if (_jspx_th_sec_005fauthorize_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f4);
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f25(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f25 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f25.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f4);
    // /WEB-INF/views/header.jsp(97,127) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f25.setCode("head.adm");
    // /WEB-INF/views/header.jsp(97,127) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f25.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f25 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f25 = _jspx_th_spring_005fmessage_005f25.doStartTag();
      if (_jspx_th_spring_005fmessage_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f25[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f25.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f25.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f25);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f26(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f26 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f26.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f4);
    // /WEB-INF/views/header.jsp(100,42) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f26.setCode("head.sport");
    // /WEB-INF/views/header.jsp(100,42) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f26.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f26 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f26 = _jspx_th_spring_005fmessage_005f26.doStartTag();
      if (_jspx_th_spring_005fmessage_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f26[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f26.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f26.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f26);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f27(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f27 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f27.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f4);
    // /WEB-INF/views/header.jsp(101,108) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f27.setCode("head.adm.home");
    // /WEB-INF/views/header.jsp(101,108) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f27.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f27 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f27 = _jspx_th_spring_005fmessage_005f27.doStartTag();
      if (_jspx_th_spring_005fmessage_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f27[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f27.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f27.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f27);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f28(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f28 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f28.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f4);
    // /WEB-INF/views/header.jsp(102,117) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f28.setCode("head.sport.cat");
    // /WEB-INF/views/header.jsp(102,117) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f28.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f28 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f28 = _jspx_th_spring_005fmessage_005f28.doStartTag();
      if (_jspx_th_spring_005fmessage_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f28[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f28.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f28.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f28);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f29(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f29 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f29.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f4);
    // /WEB-INF/views/header.jsp(103,110) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f29.setCode("head.adm.offer");
    // /WEB-INF/views/header.jsp(103,110) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f29.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f29 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f29 = _jspx_th_spring_005fmessage_005f29.doStartTag();
      if (_jspx_th_spring_005fmessage_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f29[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f29.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f29.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f29);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f30(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f30 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f30.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f4);
    // /WEB-INF/views/header.jsp(104,112) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f30.setCode("head.adm.listing");
    // /WEB-INF/views/header.jsp(104,112) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f30.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f30 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f30 = _jspx_th_spring_005fmessage_005f30.doStartTag();
      if (_jspx_th_spring_005fmessage_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f30[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f30.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f30.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f30);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f31(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f31 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f31.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f4);
    // /WEB-INF/views/header.jsp(105,122) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f31.setCode("head.sport.return");
    // /WEB-INF/views/header.jsp(105,122) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f31.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f31 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f31 = _jspx_th_spring_005fmessage_005f31.doStartTag();
      if (_jspx_th_spring_005fmessage_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f31[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f31.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f31.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f31);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f5 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_005fauthorize_005f5.setPageContext(_jspx_page_context);
    _jspx_th_sec_005fauthorize_005f5.setParent(null);
    // /WEB-INF/views/header.jsp(109,14) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sec_005fauthorize_005f5.setAccess("hasRole('ROLE_PARTNER_PASS')");
    int _jspx_eval_sec_005fauthorize_005f5 = _jspx_th_sec_005fauthorize_005f5.doStartTag();
    if (_jspx_eval_sec_005fauthorize_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("\t              <li class=\"dropdown\">\r\n");
      out.write("\t                <a id=\"adminLinkMechanic\" href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"icon-lock icon-white\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f32(_jspx_th_sec_005fauthorize_005f5, _jspx_page_context))
        return true;
      out.write(" <b class=\"caret\"></b></a>\r\n");
      out.write("\t                <ul class=\"dropdown-menu\">\r\n");
      out.write("\t                  <li class=\"divider\"></li>\r\n");
      out.write("\t                  <li class=\"nav-header\">");
      if (_jspx_meth_spring_005fmessage_005f33(_jspx_th_sec_005fauthorize_005f5, _jspx_page_context))
        return true;
      out.write("</li>\r\n");
      out.write("\t                  <li><a id=\"linkAdminMechanicPartner\" href=\"home.adminMechanicPartner\"><i class=\"icon-home\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f34(_jspx_th_sec_005fauthorize_005f5, _jspx_page_context))
        return true;
      out.write("</a></li>\r\n");
      out.write("\t                  <li><a id=\"linkAdminMechanicPartner\" href=\"track.adminMechanicPartner\"><i class=\"icon-th-large\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f35(_jspx_th_sec_005fauthorize_005f5, _jspx_page_context))
        return true;
      out.write("</a></li>\r\n");
      out.write("\t                  <li><a id=\"linkAdminMechanicPartner\" href=\"pass.adminMechanicPartner\"><i class=\"icon-tags\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f36(_jspx_th_sec_005fauthorize_005f5, _jspx_page_context))
        return true;
      out.write("</a></li>\r\n");
      out.write("\t                  <li><a id=\"linkAdminMechanicPartner\" href=\"listing.adminMechanicPartner\"><i class=\"icon-list\"></i>");
      if (_jspx_meth_spring_005fmessage_005f37(_jspx_th_sec_005fauthorize_005f5, _jspx_page_context))
        return true;
      out.write("</a></li>\r\n");
      out.write("\t                </ul>\r\n");
      out.write("\t              </li>\r\n");
      out.write("              ");
    }
    if (_jspx_th_sec_005fauthorize_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f5);
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f32(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f32 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f32.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f5);
    // /WEB-INF/views/header.jsp(111,136) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f32.setCode("head.adm");
    // /WEB-INF/views/header.jsp(111,136) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f32.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f32 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f32 = _jspx_th_spring_005fmessage_005f32.doStartTag();
      if (_jspx_th_spring_005fmessage_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f32[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f32.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f32.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f32);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f33(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f33 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f33.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f5);
    // /WEB-INF/views/header.jsp(114,42) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f33.setCode("head.meca");
    // /WEB-INF/views/header.jsp(114,42) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f33.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f33 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f33 = _jspx_th_spring_005fmessage_005f33.doStartTag();
      if (_jspx_th_spring_005fmessage_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f33[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f33.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f33.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f33);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f34(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f34 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f34.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f5);
    // /WEB-INF/views/header.jsp(115,115) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f34.setCode("head.adm.home");
    // /WEB-INF/views/header.jsp(115,115) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f34.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f34 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f34 = _jspx_th_spring_005fmessage_005f34.doStartTag();
      if (_jspx_th_spring_005fmessage_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f34[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f34.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f34.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f34);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f35(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f35 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f35.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f5);
    // /WEB-INF/views/header.jsp(116,120) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f35.setCode("head.meca.track");
    // /WEB-INF/views/header.jsp(116,120) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f35.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f35 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f35 = _jspx_th_spring_005fmessage_005f35.doStartTag();
      if (_jspx_th_spring_005fmessage_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f35[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f35.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f35.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f35);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f36(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f36 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f36.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f5);
    // /WEB-INF/views/header.jsp(117,115) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f36.setCode("head.meca.pass");
    // /WEB-INF/views/header.jsp(117,115) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f36.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f36 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f36 = _jspx_th_spring_005fmessage_005f36.doStartTag();
      if (_jspx_th_spring_005fmessage_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f36[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f36.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f36.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f36);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f37(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f37 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f37.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f5);
    // /WEB-INF/views/header.jsp(118,117) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f37.setCode("head.adm.listing");
    // /WEB-INF/views/header.jsp(118,117) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f37.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f37 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f37 = _jspx_th_spring_005fmessage_005f37.doStartTag();
      if (_jspx_th_spring_005fmessage_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f37[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f37.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f37.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f37);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f6 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_005fauthorize_005f6.setPageContext(_jspx_page_context);
    _jspx_th_sec_005fauthorize_005f6.setParent(null);
    // /WEB-INF/views/header.jsp(122,14) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sec_005fauthorize_005f6.setAccess("hasRole('ROLE_PARTNER_TRAINING')");
    int _jspx_eval_sec_005fauthorize_005f6 = _jspx_th_sec_005fauthorize_005f6.doStartTag();
    if (_jspx_eval_sec_005fauthorize_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("\t              <li class=\"dropdown\">\r\n");
      out.write("\t                <a id=\"adminLinkTraining\" href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"icon-lock icon-white\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f38(_jspx_th_sec_005fauthorize_005f6, _jspx_page_context))
        return true;
      out.write(" <b class=\"caret\"></b></a>\r\n");
      out.write("\t                <ul class=\"dropdown-menu\">\r\n");
      out.write("\t                  <li class=\"divider\"></li>\r\n");
      out.write("\t                  <li class=\"nav-header\">");
      if (_jspx_meth_spring_005fmessage_005f39(_jspx_th_sec_005fauthorize_005f6, _jspx_page_context))
        return true;
      out.write("</li>\r\n");
      out.write("\t                  <li><a id=\"linkAdminTrainingPartner\" href=\"home.adminTrainingPartner\"><i class=\"icon-home\"></i> ");
      if (_jspx_meth_spring_005fmessage_005f40(_jspx_th_sec_005fauthorize_005f6, _jspx_page_context))
        return true;
      out.write("</a></li>\r\n");
      out.write("\t               \t  <li><a id=\"linkAdminTrainingPartner\" href=\"course.adminTrainingPartner\"><i class=\"icon-list\"></i>");
      if (_jspx_meth_spring_005fmessage_005f41(_jspx_th_sec_005fauthorize_005f6, _jspx_page_context))
        return true;
      out.write("</a></li>\r\n");
      out.write("\t                </ul>\r\n");
      out.write("\t              </li>\r\n");
      out.write("              ");
    }
    if (_jspx_th_sec_005fauthorize_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f6);
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f38(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f38 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f38.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f6);
    // /WEB-INF/views/header.jsp(124,136) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f38.setCode("head.adm");
    // /WEB-INF/views/header.jsp(124,136) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f38.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f38 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f38 = _jspx_th_spring_005fmessage_005f38.doStartTag();
      if (_jspx_th_spring_005fmessage_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f38[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f38.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f38.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f38);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f39(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f39 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f39.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f6);
    // /WEB-INF/views/header.jsp(127,42) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f39.setCode("head.train");
    // /WEB-INF/views/header.jsp(127,42) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f39.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f39 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f39 = _jspx_th_spring_005fmessage_005f39.doStartTag();
      if (_jspx_th_spring_005fmessage_005f39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f39[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f39.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f39.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f39);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f40(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f40 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f40.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f6);
    // /WEB-INF/views/header.jsp(128,115) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f40.setCode("head.adm.home");
    // /WEB-INF/views/header.jsp(128,115) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f40.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f40 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f40 = _jspx_th_spring_005fmessage_005f40.doStartTag();
      if (_jspx_th_spring_005fmessage_005f40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f40[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f40.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f40.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f40);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f41(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f41 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f41.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f6);
    // /WEB-INF/views/header.jsp(129,116) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f41.setCode("head.train.course");
    // /WEB-INF/views/header.jsp(129,116) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f41.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f41 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f41 = _jspx_th_spring_005fmessage_005f41.doStartTag();
      if (_jspx_th_spring_005fmessage_005f41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f41[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f41.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f41.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f41);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f42(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f42 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f42.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f42.setParent(null);
    // /WEB-INF/views/header.jsp(134,108) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f42.setCode("head.feed");
    // /WEB-INF/views/header.jsp(134,108) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f42.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f42 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f42 = _jspx_th_spring_005fmessage_005f42.doStartTag();
      if (_jspx_th_spring_005fmessage_005f42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f42[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f42.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f42.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f42);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/views/header.jsp(136,14) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty username}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<li>\r\n");
        out.write("\t\t\t\t\t<form action=\"j_spring_security_logout\" method=\"post\" class=\"navbar-form\" >\r\n");
        out.write("\t\t\t\t\t\t<input id=\"logout\" value=\"");
        if (_jspx_meth_spring_005fmessage_005f43(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\" type=\"submit\"/>\r\n");
        out.write("\t\t\t\t\t</form>\r\n");
        out.write("\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t<li id=\"loginValidMessage\">\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_spring_005fmessage_005f44(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t</li>\r\n");
        out.write("\t\t\t  ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f43(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f43 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f43.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/views/header.jsp(139,32) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f43.setCode("usr.logout");
    // /WEB-INF/views/header.jsp(139,32) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f43.setText("");
    int[] _jspx_push_body_count_spring_005fmessage_005f43 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f43 = _jspx_th_spring_005fmessage_005f43.doStartTag();
      if (_jspx_th_spring_005fmessage_005f43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f43[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f43.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f43.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f43);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f44(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f44 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f44.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/views/header.jsp(143,5) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f44.setCode("display.welcome");
    // /WEB-INF/views/header.jsp(143,5) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f44.setText("unknow");
    int[] _jspx_push_body_count_spring_005fmessage_005f44 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f44 = _jspx_th_spring_005fmessage_005f44.doStartTag();
      if (_jspx_th_spring_005fmessage_005f44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f44[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f44.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f44.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f44);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/views/header.jsp(143,60) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /WEB-INF/views/header.jsp(146,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty errorLogin}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<li id=\"loginInvalidMessage\">\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fout_005f1(_jspx_th_c_005fif_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t</li>\r\n");
        out.write("\t\t\t  ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
    // /WEB-INF/views/header.jsp(148,5) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorLogin}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f7 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_005fauthorize_005f7.setPageContext(_jspx_page_context);
    _jspx_th_sec_005fauthorize_005f7.setParent(null);
    // /WEB-INF/views/header.jsp(154,11) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sec_005fauthorize_005f7.setAccess("hasRole('ROLE_ANONYMOUS')");
    int _jspx_eval_sec_005fauthorize_005f7 = _jspx_th_sec_005fauthorize_005f7.doStartTag();
    if (_jspx_eval_sec_005fauthorize_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("\t\t\t\t<form action=\"j_spring_security_check\" method=\"post\" class=\"navbar-form\" >\r\n");
      out.write("\t\t\t\t\t<input id=\"j_username\" class=\"span2\" name=\"j_username\" size=\"20\"\r\n");
      out.write("\t\t\t\t\t\tmaxlength=\"50\" type=\"text\" placeholder=\"Login\" /> \r\n");
      out.write("\t\t\t\t\t<input id=\"j_password\" class=\"span2\" name=\"j_password\" size=\"20\" \r\n");
      out.write("\t\t\t\t\t\tmaxlength=\"50\" type=\"password\" placeholder=\"Password\" /> \r\n");
      out.write("\t\t\t\t\t<input id=\"login_button\" value=\"");
      if (_jspx_meth_spring_005fmessage_005f45(_jspx_th_sec_005fauthorize_005f7, _jspx_page_context))
        return true;
      out.write("\" type=\"submit\" class=\"btn btn-primary\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t");
    }
    if (_jspx_th_sec_005fauthorize_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f7);
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f45(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f45 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f45.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sec_005fauthorize_005f7);
    // /WEB-INF/views/header.jsp(160,37) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f45.setCode("usr.signin");
    // /WEB-INF/views/header.jsp(160,37) name = text type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f45.setText("unknow");
    int[] _jspx_push_body_count_spring_005fmessage_005f45 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f45 = _jspx_th_spring_005fmessage_005f45.doStartTag();
      if (_jspx_th_spring_005fmessage_005f45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f45[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f45.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f45.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005ftext_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f45);
    }
    return false;
  }
}
