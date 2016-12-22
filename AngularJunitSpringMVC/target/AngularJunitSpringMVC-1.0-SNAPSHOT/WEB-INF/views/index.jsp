<%-- 
    Document   : index
    Created on : Dec 22, 2016, 2:35:39 PM
    Author     : zak
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var="SITE_URL" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach var="c" items="${courses}">
            <h1>${c.name}</h1>
        </c:forEach>

        <form method="post" action="${SITE_URL}/contact">
            <div>
                <label>Name</label>
                <input type="text" name="name"/>
            </div>
            <div>
                <label>fees</label>
                <input type="text" name="fees"/>
            </div>
            <div>
                <label>Status</label>
                <label><input type="checkbox" name="status"/></label>
            </div>
            <button type="submit">Save</button>
        </form>
    </body>
</html>
