<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Register For Our Site!" />
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp" />
<div class="container">
    <h1>Please fill in your information.</h1>
    <form action="/register" method="post">
        <c:if test="${invalidAttempt == true}">
            <p style="color: red">Registration Invalid! Existing username! Please make a different one</p>
        </c:if>
        <div class="form-group">
            <label for="username">Username</label>
            <input id="username" name="username" class="form-control" type="text" required>
        </div>
        <div class="form-group">
            <label for="email">Email</label>
            <input id="email" name="email" class="form-control" type="email">
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input id="password" name="password" class="form-control" type="password"  placeholder="Be sure to make your password 7 characters or more" required minlength="7">
        </div>
        <div class="form-group">
            <label for="confirm_password">Confirm Password</label>
            <input id="confirm_password" name="confirm_password" class="form-control" type="password">
        </div>
        <div class="form-group">
            <label for="zip_code">Zip Code</label>
            <input id="zip_code" name="zip_code" class="form-control" type="number">
        </div>
        <div class="form-group">
            <label for="phone_number">Phone Number</label>
            <input id="phone_number" name="phone_number" class="form-control" type="number">
        </div>

        <input type="submit" class="btn btn-primary btn-block">
    </form>
</div>
</body>
</html>





<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <jsp:include page="partials/head.jsp">--%>
<%--        <jsp:param name="title" value="Register For Our Site!" />--%>
<%--    </jsp:include>--%>
<%--</head>--%>
<%--<body>--%>
<%--<jsp:include page="partials/navbar.jsp" />--%>
<%--<div class="container">--%>
<%--    <h1>Please fill in your information.</h1>--%>
<%--    <form action="/register" method="post">--%>
<%--        <div class="form-group">--%>
<%--            <label for="username">Username</label>--%>
<%--            <input id="username" name="username" class="form-control" type="text">--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <label for="email">Email</label>--%>
<%--            <input id="email" name="email" class="form-control" type="text">--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <label for="password">Password</label>--%>
<%--            <input id="password" name="password" class="form-control" type="password">--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <label for="confirm_password">Confirm Password</label>--%>
<%--            <input id="confirm_password" name="confirm_password" class="form-control" type="password">--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <label for="zip_code">Zip Code</label>--%>
<%--            <input id="zip_code" name="zip_code" class="form-control" type="text">--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <label for="phone_number">Phone Number</label>--%>
<%--            <input id="phone_number" name="phone_number" class="form-control" type="number">--%>
<%--        </div>--%>

<%--        <input type="submit" class="btn btn-primary btn-block">--%>
<%--    </form>--%>
<%--</div>--%>
<%--</body>--%>
<%--</html>--%>














<%--&lt;%&ndash;<%@ page contentType="text/html;charset=UTF-8" language="java" %>&ndash;%&gt;--%>
<%--&lt;%&ndash;<html>&ndash;%&gt;--%>
<%--&lt;%&ndash;<head>&ndash;%&gt;--%>
<%--&lt;%&ndash;    <jsp:include page="partials/head.jsp">&ndash;%&gt;--%>
<%--&lt;%&ndash;        <jsp:param name="title" value="Register For Our Site!" />&ndash;%&gt;--%>
<%--&lt;%&ndash;    </jsp:include>&ndash;%&gt;--%>
<%--&lt;%&ndash;</head>&ndash;%&gt;--%>
<%--&lt;%&ndash;<body>&ndash;%&gt;--%>
<%--&lt;%&ndash;    <jsp:include page="partials/navbar.jsp" />&ndash;%&gt;--%>
<%--&lt;%&ndash;    <div class="container">&ndash;%&gt;--%>
<%--&lt;%&ndash;        <h1>Please fill in your information.</h1>&ndash;%&gt;--%>
<%--&lt;%&ndash;        <form action="/register" method="post">&ndash;%&gt;--%>
<%--&lt;%&ndash;            <div class="form-group">&ndash;%&gt;--%>
<%--&lt;%&ndash;                <label for="username">Username</label>&ndash;%&gt;--%>
<%--&lt;%&ndash;                <input id="username" name="username" class="form-control" type="text">&ndash;%&gt;--%>
<%--&lt;%&ndash;            </div>&ndash;%&gt;--%>

<%--&lt;%&ndash;            <div class="form-group">&ndash;%&gt;--%>
<%--&lt;%&ndash;                <label for="first_name">first_name</label>&ndash;%&gt;--%>
<%--&lt;%&ndash;                <input id="first_name" name="first_name" class="form-control" type="text">&ndash;%&gt;--%>
<%--&lt;%&ndash;            </div>&ndash;%&gt;--%>

<%--&lt;%&ndash;            <div class="form-group">&ndash;%&gt;--%>
<%--&lt;%&ndash;                <label for="last_name">last_name</label>&ndash;%&gt;--%>
<%--&lt;%&ndash;                <input id="last_name" name="last_name" class="form-control" type="text">&ndash;%&gt;--%>
<%--&lt;%&ndash;            </div>&ndash;%&gt;--%>

<%--&lt;%&ndash;            <div class="form-group">&ndash;%&gt;--%>
<%--&lt;%&ndash;                <label for="email">Email</label>&ndash;%&gt;--%>
<%--&lt;%&ndash;                <input id="email" name="email" class="form-control" type="email">&ndash;%&gt;--%>
<%--&lt;%&ndash;            </div>&ndash;%&gt;--%>
<%--&lt;%&ndash;            <div class="form-group">&ndash;%&gt;--%>
<%--&lt;%&ndash;                <label for="password">Password</label>&ndash;%&gt;--%>
<%--&lt;%&ndash;                <input id="password" name="password" class="form-control" type="password">&ndash;%&gt;--%>
<%--&lt;%&ndash;            </div>&ndash;%&gt;--%>
<%--&lt;%&ndash;            <div class="form-group">&ndash;%&gt;--%>
<%--&lt;%&ndash;                <label for="confirm_password">Confirm Password</label>&ndash;%&gt;--%>
<%--&lt;%&ndash;                <input id="confirm_password" name="confirm_password" class="form-control" type="password">&ndash;%&gt;--%>
<%--&lt;%&ndash;            </div>&ndash;%&gt;--%>
<%--&lt;%&ndash;<<<<<<< HEAD&ndash;%&gt;--%>





<%--&lt;%&ndash;                    <div class="form-group">&ndash;%&gt;--%>
<%--&lt;%&ndash;                        <label for="zip_code">zip_code</label>&ndash;%&gt;--%>
<%--&lt;%&ndash;                        <input id="zip_code" name="zip_code" class="form-control" type="text">&ndash;%&gt;--%>
<%--&lt;%&ndash;                    </div>&ndash;%&gt;--%>

<%--&lt;%&ndash;                        <div class="form-group">&ndash;%&gt;--%>
<%--&lt;%&ndash;                            <label for="phone_number">phone_number</label>&ndash;%&gt;--%>
<%--&lt;%&ndash;                            <input id="phone_number" name="phone_number" class="form-control" type="text">&ndash;%&gt;--%>
<%--&lt;%&ndash;                        </div>&ndash;%&gt;--%>






<%--&lt;%&ndash;                            <input type="submit" class="btn btn-primary btn-block">&ndash;%&gt;--%>
<%--&lt;%&ndash;=======&ndash;%&gt;--%>
<%--&lt;%&ndash;            <div class="form-group">&ndash;%&gt;--%>
<%--&lt;%&ndash;                <label for="zip_code">Zip Code</label>&ndash;%&gt;--%>
<%--&lt;%&ndash;                <input id="zip_code" name="zip_code" class="form-control" type="text">&ndash;%&gt;--%>
<%--&lt;%&ndash;            </div>&ndash;%&gt;--%>
<%--&lt;%&ndash;            <div class="form-group">&ndash;%&gt;--%>
<%--&lt;%&ndash;                <label for="phone_number">Phone Number</label>&ndash;%&gt;--%>
<%--&lt;%&ndash;                <input id="phone_number" name="phone_number" class="form-control" type="number">&ndash;%&gt;--%>
<%--&lt;%&ndash;            </div>&ndash;%&gt;--%>

<%--&lt;%&ndash;            <input type="submit" class="btn btn-primary btn-block">&ndash;%&gt;--%>
<%--&lt;%&ndash;>>>>>>> main&ndash;%&gt;--%>
<%--&lt;%&ndash;        </form>&ndash;%&gt;--%>
<%--&lt;%&ndash;    </div>&ndash;%&gt;--%>
<%--&lt;%&ndash;</body>&ndash;%&gt;--%>
<%--&lt;%&ndash;</html>&ndash;%&gt;--%>
