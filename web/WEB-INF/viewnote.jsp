<%-- 
    Document   : viewnote
    Created on : Sep 23, 2018, 5:13:01 PM
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
        <h2>View Note</h2>
        <div>
            <h4>Title: ${Note.title}</h4>
            <h4>Contents:<br>${Note.content}<br></h4>
            <a href="note?title=${Note.title}&content=${Note.content}">Edit</a>
        </div>
        
    </body>
</html>
