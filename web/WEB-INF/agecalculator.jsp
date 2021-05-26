<%-- 
    Document   : agecalculator
    Created on : 26-May-2021, 1:46:54 PM
    Author     : m-navarro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            <label>Enter your age:</label>
            <input type="text" name="ageC" value="${age}" placeholder="18">
            <br>
            <input type="submit" value="Age next birthday">
        </form>
        <p>${message}</p>
    </body>
</html>
