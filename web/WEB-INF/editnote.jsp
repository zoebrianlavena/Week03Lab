<%-- 
    Document   : editnote
    Created on : Sep 23, 2018, 5:13:13 PM
    Author     : 743953
--%>

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
        <form method="post" action="edit">
            Title: <input type="text"> <br>
            Content: <br>
            <textarea cols="21" rows="3"></textarea> <br><br>
            <input type="submit" value="Save">
        </form>
    </body>
</html>
