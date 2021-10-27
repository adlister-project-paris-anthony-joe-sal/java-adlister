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
        <jsp:param name="title" value="Edit an ad" />
    </jsp:include>
</head>
<body>

    <h1>Update Ad</h1>
<form method="POST">
    <div>
        <label action="/edit" for="newTitle">Title</label>
        <input type="text" id="newTitle" name="title" >
    </div>
    <div>
        <label for="newDescription">Description</label>
        <input type="text" id="newDescription" name="description">
    </div>
    <div>
        <label for="newDate_created">Date</label>
        <input type="text" id="newDate_created" name="date_created">
    </div>
    <div>
        <label for="newCategory">Category</label>
        <input type="text" id="newCategory" name="category">
    </div>
    <input type="submit" class="btn btn-block btn-primary">
</form>


</body>
</html>
