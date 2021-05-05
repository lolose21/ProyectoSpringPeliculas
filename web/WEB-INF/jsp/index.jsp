<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>
<html>
    <head>
        <link href="css/fondo02.css" rel="stylesheet" type="text/css"/>
        <%@include file="../includes/webhead.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Plantilla</title>
    </head>
    <body>
        <%@include file="../includes/webmenu.jsp" %>
        
    <main role="main" class="container">

        <div class="starter-template">
          <h1>Peliculas Spring</h1>
          <table class="table table-dark">
              <thead>
                  <tr>
             
                      <th>
                          ¿DONDE  QUIERES IR?
                      </th>
                  </tr>
              </thead>
              <tbody>
                  <tr>
                      <td>
                          <a href="web01tablapeliculas.htm">
                              PELICULAS
                          </a>
                      </td>
                    
                  </tr>
              </tbody>
          </table>
        </div>
    </main><!-- /.container -->
    <%@include file="../includes/webfooter.jsp" %>
   
    </body>
</html>