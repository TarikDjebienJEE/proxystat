package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;

public final class adminReporting_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

	Integer numberOfBookingPredictionOfNextWeek = (Integer) request.getAttribute("numberOfBookingPredictionOfNextWeek");
	Integer amountOfBookingOrder = (Integer) request.getAttribute("amountOfBookingOrder");

	Map<Integer, String> weekData = (Map<Integer, String>) request.getAttribute("weekData");
	Map<Integer, Integer> countBookingData = (Map<Integer, Integer>) request.getAttribute("countBookingData");
	Map<Integer, Integer> turnOverData = (Map<Integer, Integer>) request.getAttribute("turnOverData");
	Map<Integer, Integer> marginData = (Map<Integer, Integer>) request.getAttribute("marginData");
	Map<Integer, Integer> occupancyRateData = (Map<Integer, Integer>) request.getAttribute("occupancyRateData");
	Map<Integer, Integer> flatTypeBookedData = (Map<Integer, Integer>) request.getAttribute("flatTypeBookedData");
	Map<Integer, Integer> equipmentTypeData = (Map<Integer, Integer>) request.getAttribute("equipmentTypeData");
	Map<Integer, Integer> passTypeData = (Map<Integer, Integer>) request.getAttribute("passTypeData");
	Map<Integer, Integer> ratingServiceData = (Map<Integer, Integer>) request.getAttribute("ratingServiceData");
	Map<Integer, Integer> numberOfCustomersData = (Map<Integer, Integer>) request.getAttribute("numberOfCustomersData");
	Map<Integer, Integer> guestAgeBreakDownData = (Map<Integer, Integer>) request.getAttribute("guestAgeBreakDownData");
	

      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<hr>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t<section id=\"statisticsAdmin\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"hero-unit\">\r\n");
      out.write("\t\t\t<h2>Proxystat reporting</h2>\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\tNumber of booking predicted for next week :\r\n");
      out.write("\t\t\t\t");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /WEB-INF/views/adminReporting.jsp(52,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue(numberOfBookingPredictionOfNextWeek);
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      out.write("\r\n");
      out.write("\t\t\t\tbookings\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\tAverage amount of booking order :\r\n");
      out.write("\t\t\t\t");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f1.setParent(null);
      // /WEB-INF/views/adminReporting.jsp(57,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f1.setValue(amountOfBookingOrder);
      int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
      if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      out.write("\r\n");
      out.write("\t\t\t\t€\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Statistiques pour le nombre de booking par semaine-->\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<a href=\"#statisticsBookingGraphicsArticle\" data-toggle=\"collapse\">\r\n");
      out.write("\t\t\t\t<h3>Number of Bookings</h3>\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<article id=\"statisticsBookingGraphicsArticle\" class=\"collapse\">\r\n");
      out.write("\t\t\t<p id=\"statisticsBookingGraphics\"></p>\r\n");
      out.write("\t\t</article>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Statistiques pour le chiffre d'affaire (prix total des bookings)-->\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<a href=\"#statisticsTurnOverGraphicsArticle\" data-toggle=\"collapse\">\r\n");
      out.write("\t\t\t\t<h3>Turnover</h3>\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<article id=\"statisticsTurnOverGraphicsArticle\" class=\"collapse\">\r\n");
      out.write("\t\t\t<p id=\"statisticsTurnOverGraphics\"></p>\r\n");
      out.write("\t\t</article>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Statistiques pour le chiffre d'affaire (marge total des bookings)-->\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<a href=\"#statisticsMarginGraphicsArticle\" data-toggle=\"collapse\">\r\n");
      out.write("\t\t\t\t<h3>Margin</h3>\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<article id=\"statisticsMarginGraphicsArticle\" class=\"collapse\">\r\n");
      out.write("\t\t\t<p id=\"statisticsMarginGraphics\"></p>\r\n");
      out.write("\t\t</article>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Statistiques pour le taux d'occupation d'un appartement-->\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<a href=\"#statisticsRateOccupancyGraphicsArticle\"\r\n");
      out.write("\t\t\t\tdata-toggle=\"collapse\">\r\n");
      out.write("\t\t\t\t<h3>Rate of flat occupancy</h3>\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<article id=\"statisticsRateOccupancyGraphicsArticle\" class=\"collapse\">\r\n");
      out.write("\t\t\t<p id=\"statisticsRateOccupancyGraphics\"></p>\r\n");
      out.write("\t\t</article>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Statistiques pour le type d'appartement reserve (pie chart)-->\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<a href=\"#statisticsFlatTypeBookedGraphicsArticle\"\r\n");
      out.write("\t\t\t\tdata-toggle=\"collapse\">\r\n");
      out.write("\t\t\t\t<h3>Flat type booked</h3>\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<article id=\"statisticsFlatTypeBookedGraphicsArticle\" class=\"collapse\">\r\n");
      out.write("\t\t\t<p id=\"statisticsFlatTypeBookedGraphics\"></p>\r\n");
      out.write("\t\t</article>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Statistiques pour le type d'equipement les plus demandes(pie chart)-->\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<a href=\"#statisticsEquipmentTypeGraphicsArticle\"\r\n");
      out.write("\t\t\t\tdata-toggle=\"collapse\">\r\n");
      out.write("\t\t\t\t<h3>Equipment type</h3>\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<article id=\"statisticsEquipmentTypeGraphicsArticle\" class=\"collapse\">\r\n");
      out.write("\t\t\t<p id=\"statisticsEquipmentTypeGraphics\"></p>\r\n");
      out.write("\t\t</article>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Statistiques pour le type de forfait-->\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<a href=\"#statisticsPassGraphicsArticle\" data-toggle=\"collapse\">\r\n");
      out.write("\t\t\t\t<h3>Pass</h3>\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<article id=\"statisticsPassGraphicsArticle\" class=\"collapse\">\r\n");
      out.write("\t\t\t<p id=\"statisticsPassGraphics\"></p>\r\n");
      out.write("\t\t</article>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Statistiques pour les notations de chaque service (bar chart)-->\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<a href=\"#statisticRatingServiceGraphicsArticle\"\r\n");
      out.write("\t\t\t\tdata-toggle=\"collapse\">\r\n");
      out.write("\t\t\t\t<h3>Average rating of service</h3>\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<article id=\"statisticRatingServiceGraphicsArticle\" class=\"collapse\">\r\n");
      out.write("\t\t\t<p id=\"statisticRatingServiceGraphics\"></p>\r\n");
      out.write("\t\t</article>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Statistiques pour le nombre de nouveaux client-->\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<a href=\"#statisticNumberOfCustomersGraphicsArticle\"\r\n");
      out.write("\t\t\t\tdata-toggle=\"collapse\">\r\n");
      out.write("\t\t\t\t<h3>Number of new customers</h3>\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<article id=\"statisticNumberOfCustomersGraphicsArticle\"\r\n");
      out.write("\t\t\tclass=\"collapse\">\r\n");
      out.write("\t\t\t<p id=\"statisticNumberOfCustomersGraphics\"></p>\r\n");
      out.write("\t\t</article>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Statistiques pour le repartition des clients par age (pie chart)-->\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<a href=\"#statisticBreakDownGraphicsArticle\" data-toggle=\"collapse\">\r\n");
      out.write("\t\t\t\t<h3>Breakdown by age</h3>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<article id=\"statisticBreakDownGraphicsArticle\" class=\"collapse\">\r\n");
      out.write("\t\t\t<p id=\"statisticBreakDownGraphics\"></p>\r\n");
      out.write("\t\t</article>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</section>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\">\r\n");
      out.write("\t\t  $(\".collapse\").collapse(\"hide\");\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  $(document).ready(function(){\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t//*****************************************************************************//\r\n");
      out.write("\t\t\t// ***** Consolidation statistiques pour le nombre de booking par semaine *****//\r\n");
      out.write("\t\t\t//*****************************************************************************//\r\n");
      out.write("\t\t\t\t//Consolidation des donnees\r\n");
      out.write("\t\t\t    var xDataValue = [];\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t    var yDataValueCountBooking = [[]];\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write(" \t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t//Construction de la courbe\r\n");
      out.write("\t\t\t    var options = {\r\n");
      out.write("\t\t\t\t\ttitle: 'Evolution of booking',\r\n");
      out.write("\t\t\t\t    axes : {\r\n");
      out.write("\t\t\t\t    \txaxis : {ticks: xDataValue}\r\n");
      out.write("\t\t\t\t    }\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t    courbe = $.jqplot('statisticsBookingGraphics', yDataValueCountBooking, options);\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t//*******************************************************************************************//\r\n");
      out.write("\t\t\t\t// ***** Consolidation statistiques pour le chiffre d'affaire (prix total des bookings) *****//\r\n");
      out.write("\t\t\t\t//*******************************************************************************************//\r\n");
      out.write("\t\t\t\t\t//Consolidation des donnees\r\n");
      out.write("\t\t\t\t    var yDataValueTurnOverData = [[]];\r\n");
      out.write("\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write(" \t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t//Construction de la courbe\r\n");
      out.write("\t\t\t\t    var options = {\r\n");
      out.write("\t\t\t\t\t\ttitle: 'Turnover',\r\n");
      out.write("\t\t\t\t\t    axes : {\r\n");
      out.write("\t\t\t\t\t    \txaxis : {ticks: xDataValue}\r\n");
      out.write("\t\t\t\t\t    }\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t    courbe = $.jqplot('statisticsTurnOverGraphics', yDataValueTurnOverData, options);\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t//********************************************************************************//\r\n");
      out.write("\t\t\t\t\t// ***** Consolidation statistiques pour la marge (marge total des bookings) *****//\r\n");
      out.write("\t\t\t\t\t//********************************************************************************//\r\n");
      out.write("\t\t\t\t\t\t//Consolidation des donnees\r\n");
      out.write("\t\t\t\t\t    var yDataValueMarginData = [[]];\r\n");
      out.write("\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f3(_jspx_page_context))
        return;
      out.write(" \t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t//Construction de la courbe\r\n");
      out.write("\t\t\t\t\t    var options = {\r\n");
      out.write("\t\t\t\t\t\t\ttitle: 'Margin',\r\n");
      out.write("\t\t\t\t\t\t    axes : {\r\n");
      out.write("\t\t\t\t\t\t    \txaxis : {ticks: xDataValue}\r\n");
      out.write("\t\t\t\t\t\t    }\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t    courbe = $.jqplot('statisticsMarginGraphics', yDataValueMarginData, options);\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t//********************************************************************************//\r\n");
      out.write("\t\t\t\t\t\t// ***** Consolidation statistiques pour le taux d'occupation d'appartement  *****//\r\n");
      out.write("\t\t\t\t\t\t//********************************************************************************//\r\n");
      out.write("\t\t\t\t\t\t\t//Consolidation des donnees\r\n");
      out.write("\t\t\t\t\t\t    var yDataOccupancyRateData = [[]];\r\n");
      out.write("\t\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f4(_jspx_page_context))
        return;
      out.write(" \t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t//Construction de la courbe\r\n");
      out.write("\t\t\t\t\t\t    var options = {\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle: 'Occupancy rate',\r\n");
      out.write("\t\t\t\t\t\t\t    axes : {\r\n");
      out.write("\t\t\t\t\t\t\t    \txaxis : {ticks: xDataValue}\r\n");
      out.write("\t\t\t\t\t\t\t    }\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t    courbe = $.jqplot('statisticsRateOccupancyGraphics', yDataOccupancyRateData, options);\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t//********************************************************************************//\r\n");
      out.write("\t\t\t\t\t\t\t// ***** Consolidation statistiques pour les type d'appartements (pie chart) *****//\r\n");
      out.write("\t\t\t\t\t\t\t//********************************************************************************//\t\r\n");
      out.write("\t\t\t\t\t\t\t//Consolidation des donnees\r\n");
      out.write("\t\t\t\t\t\t    var dataFlatTypeBooked = [[]];\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f5(_jspx_page_context))
        return;
      out.write(" \t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t//Construction de la courbe\r\n");
      out.write("\t\t\t\t\t\t\tvar options = { \r\n");
      out.write("\t\t\t\t\t\t\t\tseriesDefaults: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\trenderer: jQuery.jqplot.PieRenderer, \r\n");
      out.write("\t\t\t\t\t\t\t\t\trendererOptions: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tshowDataLabels: true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t}, \r\n");
      out.write("\t\t\t\t\t\t\t\tlegend: { show:true, location: 'e' }\r\n");
      out.write("\t\t\t\t\t\t\t}\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tvar plot = jQuery.jqplot ('statisticsFlatTypeBookedGraphics', dataFlatTypeBooked, options);\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t//********************************************************************************//\r\n");
      out.write("\t\t\t\t\t\t\t// ***** Consolidation statistiques pour les type d'equipements  (pie chart) *****//\r\n");
      out.write("\t\t\t\t\t\t\t//********************************************************************************//\t\r\n");
      out.write("\t\t\t\t\t\t\t//Consolidation des donnees\r\n");
      out.write("\t\t\t\t\t\t    var dataFlatTypeBooked = [[]];\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f6(_jspx_page_context))
        return;
      out.write(" \t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t//Construction de la courbe\r\n");
      out.write("\t\t\t\t\t\t\tvar options = { \r\n");
      out.write("\t\t\t\t\t\t\t\tseriesDefaults: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\trenderer: jQuery.jqplot.PieRenderer, \r\n");
      out.write("\t\t\t\t\t\t\t\t\trendererOptions: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tshowDataLabels: true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t}, \r\n");
      out.write("\t\t\t\t\t\t\t\tlegend: { show:true, location: 'e' }\r\n");
      out.write("\t\t\t\t\t\t\t}\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tvar plot = jQuery.jqplot ('statisticsEquipmentTypeGraphics', dataFlatTypeBooked, options);\t\t\t\t\t\t\t\t\t\r\n");
      out.write("    \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t//********************************************************************************//\r\n");
      out.write("\t\t\t\t\t\t\t// ***** Consolidation statistiques pour les types de forfaits   (pie chart) *****//\r\n");
      out.write("\t\t\t\t\t\t\t//********************************************************************************//\t\r\n");
      out.write("\t\t\t\t\t\t\t//Consolidation des donnees\r\n");
      out.write("\t\t\t\t\t\t\tvar dataPass = [[]];\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f7(_jspx_page_context))
        return;
      out.write(" \t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t//Construction de la courbe\r\n");
      out.write("\t\t\t\t\t\t\tvar options = { \r\n");
      out.write("\t\t\t\t\t\t\t\tseriesDefaults: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\trenderer: jQuery.jqplot.PieRenderer, \r\n");
      out.write("\t\t\t\t\t\t\t\t\trendererOptions: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tshowDataLabels: true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t}, \r\n");
      out.write("\t\t\t\t\t\t\t\tlegend: { show:true, location: 'e' }\r\n");
      out.write("\t\t\t\t\t\t\t}\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tvar plot = jQuery.jqplot ('statisticsPassGraphics', dataPass, options);\t\t\t\t\t\t\t\t\t\r\n");
      out.write("    \r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t//********************************************************************************//\r\n");
      out.write("\t\t\t\t\t\t\t// ** Consolidation statistiques pour les notes moyens par service (bar chart) ***//\r\n");
      out.write("\t\t\t\t\t\t\t//********************************************************************************//\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t//Consolidation des donnees\r\n");
      out.write("\t\t\t\t\t\t\tvar ratingServiceData = [];\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tvar index = 1 ; \r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f8(_jspx_page_context))
        return;
      out.write(" \t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t//Construction de la courbe\r\n");
      out.write("\t\t\t\t\t\t\tvar options = {\r\n");
      out.write("\t\t\t\t\t\t\t\t    title:'Rating of services',\r\n");
      out.write("\t\t\t\t\t\t\t\t    seriesDefaults:{\r\n");
      out.write("\t\t\t\t\t\t\t\t        renderer:$.jqplot.BarRenderer,\r\n");
      out.write("\t\t\t\t\t\t\t\t    },\r\n");
      out.write("\t\t\t\t\t\t\t\t    axes:{\r\n");
      out.write("\t\t\t\t\t\t\t\t        xaxis:{\r\n");
      out.write("\t\t\t\t\t\t\t\t            renderer: $.jqplot.CategoryAxisRenderer\r\n");
      out.write("\t\t\t\t\t\t\t\t        }\r\n");
      out.write("\t\t\t\t\t\t\t\t    }\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t$('#statisticRatingServiceGraphics').jqplot([ratingServiceData],options );\r\n");
      out.write("\t\t\t\t\t     \r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t//*****************************************************************************//\r\n");
      out.write("\t\t\t\t\t\t\t// *****  Consolidation statistiques pour le nombre de nouveaux clients   *****//\r\n");
      out.write("\t\t\t\t\t\t\t//*****************************************************************************//\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t    var yDataValueNumberOfCustomers = [[]];\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f9(_jspx_page_context))
        return;
      out.write(" \t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t//Construction de la courbe\r\n");
      out.write("\t\t\t\t\t\t    var options = {\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle: 'Number of new customer',\r\n");
      out.write("\t\t\t\t\t\t\t    axes : {\r\n");
      out.write("\t\t\t\t\t\t\t    \txaxis : {ticks: xDataValue}\r\n");
      out.write("\t\t\t\t\t\t\t    }\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t    courbe = $.jqplot('statisticNumberOfCustomersGraphics', yDataValueNumberOfCustomers, options);\t\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t//********************************************************************************//\r\n");
      out.write("\t\t\t\t\t\t\t// ***** Consolidation statistiques pour les categories d'ages des guests    *****//\r\n");
      out.write("\t\t\t\t\t\t\t//********************************************************************************//\t\r\n");
      out.write("\t\t\t\t\t\t\t//Consolidation des donnees\r\n");
      out.write("\t\t\t\t\t\t    var dataGuestAgeBooked = [[]];\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f10(_jspx_page_context))
        return;
      out.write(" \t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t//Construction de la courbe\r\n");
      out.write("\t\t\t\t\t\t\tvar options = { \r\n");
      out.write("\t\t\t\t\t\t\t\tseriesDefaults: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\trenderer: jQuery.jqplot.PieRenderer, \r\n");
      out.write("\t\t\t\t\t\t\t\t\trendererOptions: {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tshowDataLabels: true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t}, \r\n");
      out.write("\t\t\t\t\t\t\t\tlegend: { show:true, location: 'e' }\r\n");
      out.write("\t\t\t\t\t\t\t}\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tvar plot = jQuery.jqplot ('statisticBreakDownGraphics', dataGuestAgeBooked, options);\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t  })\r\n");
      out.write("\t</script>");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/adminReporting.jsp(226,4) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${weekData}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/adminReporting.jsp(226,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("entry");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("  \r\n");
          out.write("\t\t\t\t\tvar indexWeekValue = ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.key}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(";\r\n");
          out.write("\t\t\t\t\tvar dateString = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\";\r\n");
          out.write("\t\t\t\t\txDataValue.push( [indexWeekValue, dateString] );\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/views/adminReporting.jsp(232,4) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${countBookingData}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/adminReporting.jsp(232,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("entry");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("  \r\n");
          out.write("\t\t\t\t\tvar indexCountValue = ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.key}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" ; \r\n");
          out.write("\t\t\t\t\tvar countValue = ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(";\t\t\t\t\r\n");
          out.write("\t\t\t\t\tyDataValueCountBooking[0].push( [indexCountValue, countValue] );\r\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent(null);
    // /WEB-INF/views/adminReporting.jsp(255,5) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${turnOverData}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/adminReporting.jsp(255,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("entry");
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("  \r\n");
          out.write("\t\t\t\t\t\tvar indexTurnOverData = ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.key}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" ; \r\n");
          out.write("\t\t\t\t\t\tvar turnOverData = ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(";\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\tyDataValueTurnOverData[0].push( [indexTurnOverData, turnOverData] );\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f3.setParent(null);
    // /WEB-INF/views/adminReporting.jsp(278,6) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${marginData}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/adminReporting.jsp(278,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setVar("entry");
    int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
      if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("  \r\n");
          out.write("\t\t\t\t\t\t\tvar indexMarginData = ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.key}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" ; \r\n");
          out.write("\t\t\t\t\t\t\tvar marginData = ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(";\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\tyDataValueMarginData[0].push( [indexMarginData, marginData] );\r\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f3.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f4.setParent(null);
    // /WEB-INF/views/adminReporting.jsp(301,7) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${occupancyRateData}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/adminReporting.jsp(301,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setVar("entry");
    int[] _jspx_push_body_count_c_005fforEach_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f4 = _jspx_th_c_005fforEach_005f4.doStartTag();
      if (_jspx_eval_c_005fforEach_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("  \r\n");
          out.write("\t\t\t\t\t\t\t\tvar indexOccupancyRateData = ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.key}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(" ; \r\n");
          out.write("\t\t\t\t\t\t\t\tvar occupancyRateData = ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(";\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\tyDataOccupancyRateData[0].push( [indexOccupancyRateData, occupancyRateData] );\r\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f4.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f5.setParent(null);
    // /WEB-INF/views/adminReporting.jsp(325,7) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${flatTypeBookedData}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/adminReporting.jsp(325,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f5.setVar("entry");
    int[] _jspx_push_body_count_c_005fforEach_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f5 = _jspx_th_c_005fforEach_005f5.doStartTag();
      if (_jspx_eval_c_005fforEach_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("  \r\n");
          out.write("\t\t\t\t\t\t\t\tvar flatTypeName = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.key}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"; \r\n");
          out.write("\t\t\t\t\t\t\t\tvar flatTypeNumberInBooking = ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(";\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\tdataFlatTypeBooked[0].push( [flatTypeName, flatTypeNumberInBooking] );\r\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f5.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f6.setParent(null);
    // /WEB-INF/views/adminReporting.jsp(351,7) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f6.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${equipmentTypeData}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/adminReporting.jsp(351,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f6.setVar("entry");
    int[] _jspx_push_body_count_c_005fforEach_005f6 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f6 = _jspx_th_c_005fforEach_005f6.doStartTag();
      if (_jspx_eval_c_005fforEach_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("  \r\n");
          out.write("\t\t\t\t\t\t\t\tvar equipmentTypeName = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.key}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"; \r\n");
          out.write("\t\t\t\t\t\t\t\tvar equipmentTypeInBooking = ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(";\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\tdataFlatTypeBooked[0].push( [equipmentTypeName, equipmentTypeInBooking] );\r\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f6.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f6);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f7 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f7.setParent(null);
    // /WEB-INF/views/adminReporting.jsp(378,7) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f7.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${passTypeData}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/adminReporting.jsp(378,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f7.setVar("entry");
    int[] _jspx_push_body_count_c_005fforEach_005f7 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f7 = _jspx_th_c_005fforEach_005f7.doStartTag();
      if (_jspx_eval_c_005fforEach_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("  \r\n");
          out.write("\t\t\t\t\t\t\t\tvar passTypeName = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.key}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"; \r\n");
          out.write("\t\t\t\t\t\t\t\tvar passTypeInBooking = ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(";\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\tdataPass[0].push( [passTypeName, passTypeInBooking] );\r\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f7.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f7);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f8 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f8.setParent(null);
    // /WEB-INF/views/adminReporting.jsp(407,7) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f8.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ratingServiceData}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/adminReporting.jsp(407,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f8.setVar("entry");
    int[] _jspx_push_body_count_c_005fforEach_005f8 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f8 = _jspx_th_c_005fforEach_005f8.doStartTag();
      if (_jspx_eval_c_005fforEach_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("  \r\n");
          out.write("\t\t\t\t\t\t\t\tvar serviceName = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.key}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ; \r\n");
          out.write("\t\t\t\t\t\t\t\tvar avgRatingValue = ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(";\t\r\n");
          out.write("\t\t\t\t\t\t\t\tratingServiceData.push( [serviceName , avgRatingValue] );\r\n");
          out.write("\t\t\t\t\t\t\t\tindex = index + 1  ;\r\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f8.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f8.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f8);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f9 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f9.setParent(null);
    // /WEB-INF/views/adminReporting.jsp(439,7) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f9.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${numberOfCustomersData}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/adminReporting.jsp(439,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f9.setVar("entry");
    int[] _jspx_push_body_count_c_005fforEach_005f9 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f9 = _jspx_th_c_005fforEach_005f9.doStartTag();
      if (_jspx_eval_c_005fforEach_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("  \r\n");
          out.write("\t\t\t\t\t\t\t\tvar indexCountValue = ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.key}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(";\r\n");
          out.write("\t\t\t\t\t\t\t\tvar countValue = ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(";\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\tyDataValueNumberOfCustomers[0].push( [indexCountValue, countValue] );\r\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f9.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f9[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f9.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f9.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f9);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f10 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f10.setParent(null);
    // /WEB-INF/views/adminReporting.jsp(465,7) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f10.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${guestAgeBreakDownData}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/adminReporting.jsp(465,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f10.setVar("entry");
    int[] _jspx_push_body_count_c_005fforEach_005f10 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f10 = _jspx_th_c_005fforEach_005f10.doStartTag();
      if (_jspx_eval_c_005fforEach_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("  \r\n");
          out.write("\t\t\t\t\t\t\t\tvar guestAgeName = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.key}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"; \r\n");
          out.write("\t\t\t\t\t\t\t\tvar guestAgeRepartitionValue = ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entry.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(";\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\tdataGuestAgeBooked[0].push( [guestAgeName, guestAgeRepartitionValue] );\r\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f10.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f10[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f10.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f10.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f10);
    }
    return false;
  }
}
