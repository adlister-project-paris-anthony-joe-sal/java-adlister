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

    <h1>Update Ad</h1>
    <h1>Welcome, ${user.username}! Edit your ad below: </h1>
    <c:forEach var = "ad" items="${ads}">
        <form method="POST" action="/edit">
            <div>
                <label  for="newTitle">Title</label>
                <input type="text" id="newTitle" name="title" value="${ad.title}">
            </div>
            <div>
                <label for="newDescription">Description</label>
                <input type="text" id="newDescription" name="description" value="${ad.description}">
            </div>
                <%--    <div>--%>
                <%--        <label for="newDate_created">Date</label>--%>
                        <input type="hidden" id="newDate_created" name="date_created" value="${ad.date_created}">
                <%--    </div>--%>
                <%--            <div>--%>
                <%--                <label for="newCategory" > Category</label>--%>
                <%--                <input type="text" id="newCategory" name="category" value="${ad.category}">--%>
                <%--            </div>--%>
            <input name="ad-id" id="ad-id" value="${ad.id}" type="hidden">
            <input type="submit" class="btn btn-block btn-primary">
        </form>
</c:forEach>




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