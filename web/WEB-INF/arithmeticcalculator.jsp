<%-- 
    Document   : arithmeticcalculator
    Created on : 27-May-2021, 9:05:34 PM
    Author     : m-navarro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <label>First:</label>
            <input type="text" name="first" value="${first_number}" placeholder="1">
            <br>
            <label>Last:</label>
            <input type="text" name="second" value="${second_number}" placeholder="1">
            <br>   
            <button type="submit" name="button" value="plus" >+</button>
            <button type="submit" name="button" value="minus">-</button>
            <button type="submit" name="button" value="multiple">*</button>
            <button type="submit" name="button" value="modulus">%</button>
        </form>
        <p>Results: ${empty message ? '---' :message} </p>
        <a href="age">Age Calculator</a>
    </body>
</html>
