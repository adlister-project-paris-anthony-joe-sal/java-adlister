<%--
  Created by IntelliJ IDEA.
  User: anthonyvillegas
  Date: 10/26/21
  Time: 3:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Please Log In" />
    </jsp:include>
</head>
<body>

    <h1>Update Ad</h1>
<form method="POST">
    <div>
        <label action="/ads/edit" for="title">Title</label>
        <input type="text" id="title" name="title" required>
    </div>
    <div>
        <label for="description">Description</label>
        <input type="text" id="description" name="description" required>
    </div>
    <div>
        <label for="date_created">Date</label>
        <input type="text" id="date_created" name="date_created" required>
    </div>
    <div>
        <label for="category">Category</label>
        <input type="text" id="category" name="category" required>
    </div>
    <input type="submit" class="btn btn-block btn-primary">
</form>


</body>
</html>
