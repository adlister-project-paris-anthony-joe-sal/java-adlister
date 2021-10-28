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
            <div class="form-group">
                <label for="username">Username</label>
                <input id="username" name="username" class="form-control" type="text">
            </div>

            <div class="form-group">
                <label for="first_name">first_name</label>
                <input id="first_name" name="first_name" class="form-control" type="text">
            </div>

            <div class="form-group">
                <label for="last_name">last_name</label>
                <input id="last_name" name="last_name" class="form-control" type="text">
            </div>

            <div class="form-group">
                <label for="email">Email</label>
                <input id="email" name="email" class="form-control" type="email">
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input id="password" name="password" class="form-control" type="password">
            </div>
            <div class="form-group">
                <label for="confirm_password">Confirm Password</label>
                <input id="confirm_password" name="confirm_password" class="form-control" type="password">
            </div>





                    <div class="form-group">
                        <label for="zip_code">zip_code</label>
                        <input id="zip_code" name="zip_code" class="form-control" type="text">
                    </div>

                        <div class="form-group">
                            <label for="phone_number">phone_number</label>
                            <input id="phone_number" name="phone_number" class="form-control" type="text">
                        </div>






                            <input type="submit" class="btn btn-primary btn-block">
        </form>
    </div>
</body>
</html>
