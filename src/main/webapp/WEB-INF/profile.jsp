<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %><html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />

    <div class="container">
        <h1>Welcome, ${user.username}!</h1>

        <h1>Here are all of YOUR ads!</h1>

        <c:forEach var="ad" items="${ads}">
            <div class="col-md-6">
                <h2>${ad.title}</h2>
                <h3>${ad.userId}</h3>
                <p>${ad.description}</p>

                <form action="/delete" method="POST">
                    <input type="hidden" name="deleteAd" id="deleteAd" value="${ad.id}" />
                    <button  class="btn btn-danger">Delete</button>
                </form>
                <form method="GET" action="/edit" >
                    <button type="submit">Edit this ad</button>
                    <input type="hidden" value="${ad.id}" name="editAd" id="editAd">
                </form>

            </div>
        </c:forEach>

        <h2>Edit your profile</h2>
        <form action="/profile" method="post">
            <label for="newUsername">New Username: </label>
            <input name="newUsername" id="newUsername" value="${user.username}">
            <label for="newPassword">New Password: </label>
            <input name="newPassword" id="newPassword" value="${user.password}">
            <input name="userId" id="userId" value="${user.id}" hidden>
            <input type="submit" value="Submit that shit">
        </form>


    </div>

</body>
</html>

