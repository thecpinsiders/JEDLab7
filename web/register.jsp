<%-- 
    Document   : register
    Created on : Jan 6, 2021, 10:35:33 AM
    Author     : cliff
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <b>Register</b>
        <form action="" method="post">
            Name: <input type="text" name="name"/><br/>
            Delivery Address: <input type="text" name="deliveryaddress"/><br/>
            Postal Code: <input type="text" name="postalcode"/><br/>
            Contact Number: <input type="text" name="contactno"/><br/>
            Email Address: <input type="email" name="email"/><br/>
            <input type="submit" value="Submit"/>
        </form>
        <a href="login.jsp">Done Registering?Log in now!</a><br/>
        <a href="index.html">Back</a><br/>
    </body>
</html>
