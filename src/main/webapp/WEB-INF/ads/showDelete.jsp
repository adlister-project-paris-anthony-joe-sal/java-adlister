<%--
  Created by IntelliJ IDEA.
  User: salvadorsalazar
  Date: 10/26/21
  Time: 4:04 PM
  To change this template use File | Settings | File Templates.
--%>




<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Show Ad" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<div class="container">
    <div class="col-md-12">
        <h1>${ad.title}</h1>
        <p>${ad.description}</p>
        <p>Posted by: <b><a href="/profile?id=${user.id}" target="_blank">${user.username}</a></b></p>
        <div class="admin-only">
            <button id="edit-ad" data-ad-id="${ad.id}" class="btn btn-info">Edit</button>
            <form action="/ads/delete" method="POST">
                <input type="hidden" name="id" value="${ad.id}" />
                <button id="delete-ad" class="btn btn-danger">Delete</button>
            </form>
        </div>
    </div>
</div>

</body>
</html>