<%-- 
    Document   : Checkout
    Created on : 5 Jan, 2021, 6:48:08 PM
    Author     : 181627N
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <b><%=session.getAttribute("orderid")%></b><br/>
        <b><%=session.getAttribute("customerid")%></b><br/>
        <b><%=session.getAttribute("itemid")%></b><br/>
        <b><%=session.getAttribute("quantity")%></b><br/>
    </body>
</html>
