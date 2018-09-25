<%-- 
    Document   : editnote
    Created on : Sep 23, 2018, 5:13:13 PM
    Author     : 743953
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form method="post" action="note">
            Title: <textarea name="editTitle">${title}</textarea> <br>
            Content: <textarea name="editContent">${content}</textarea> <br>
            <input type="submit" value="Save">
        </form>
            <c:if test="${error eq 'novalue'}">
                enter both values
            </c:if>
            
    </body>
</html>
