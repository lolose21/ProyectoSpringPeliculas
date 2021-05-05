<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../includes/webhead.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Plantilla</title>
    </head>
    <body>
        <%@include file="../includes/webmenu.jsp" %>
        
    <main role="main" class="container">

        <div class="starter-template">
          <h1>Tablon peliculas</h1>
          <table border="1">
              <thead>
                  <tr>
                      <th>ID PELICULA</th>
                      <th>ID DISTRIBUIDOR</th>
                      <th>ID GENERO</th>
                      <th>TITULO</th>
                      <th>ACTORES</th>
                  </tr>
              </thead>
              <tbody>
                  <c:forEach items="${PELICULAS}" var="pelis">
                  <tr>
                      <td>
                          <c:out value="${pelis.idpeliculas}"/>
                      </td>
                      <td>
                          <c:out value="${pelis.iddistrubuidor}"/>
                      </td>
                      <td>
                          <c:out value="${pelis.idgenero}"/>
                      </td>
                      <td>
                          <c:out value="${pelis.titulo}"/>
                      </td>
                      <td>
                          <c:out value="${pelis.actores}"/>
                      </td>
                     
                  </tr>
                  </c:forEach>
              </tbody>
          </table>
          <img src="imagen/Piratas_Del_Caribe.jpg" alt=""/>
   
        </div>
    </main><!-- /.container -->
    <%@include file="../includes/webfooter.jsp" %>
   
    </body>
</html>
