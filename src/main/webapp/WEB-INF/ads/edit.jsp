<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<jsp:include page="/WEB-INF/partials/navbar.jsp" />
    <div class="container">
        <h1>Welcome, ${user.username}! Edit your ad below: </h1>
        <form method="POST" action="/editAd">
            <div>
                <label  for="newTitle">Title</label>
                <input type="text" id="newTitle" name="title" value="${myAd.title}" required>
            </div>
            <div>
                <label for="newDescription">Description</label>
                <input type="text" id="newDescription" name="description" value="${myAd.description}" required>
                <input type="hidden" name="adId" value="${myAd.id}">
            </div>
            <input type="submit" class="btn btn-block btn-primary">
        </form>
    </div>
</body>
</html>


<%--<select class="custom-select" >--%>
<%--    <option value="${ad.vehicles}">vehicles</option>--%>
<%--    <option value="${ad.services}">services</option>--%>
<%--    <option value="${ad.for_rent}">for_rent</option>--%>
<%--    <option value="${ad.real_estate}">real_estate</option>--%>
<%--    <option value="${ad.pets}">pets</option>--%>
<%--    <option value="${ad.community}">community</option>--%>
<%--    <option value="${ad.jobs}">jobs</option>--%>
<%--    <option value="${ad.personals}">personals</option>--%>
<%--    <option value="${ad.items_for_sale}">items_for_sale</option>--%>
<%--</select>--%>