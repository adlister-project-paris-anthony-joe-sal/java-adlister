<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Ads" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<div class="container">
    <h1>Here Are all the ads!</h1>
    <div style="text-align: right">
    <jsp:include page="/WEB-INF/partials/filter.jsp" />
    </div>
    <c:forEach var="ad" items="${ads}">
        <div class="col-md-6">

            <c:if test="${sessionScope.userId != null}">
                <form method="GET" action="<c:url value="/edit"/>">
                    <button type="submit">Edit this ad</button>
                    <input type="hidden" value="${ad.id}" name="editAd" id="editAd">
                </form>
            </c:if>
            <h2>${ad.title}</h2>
            <h3>${ad.userId}</h3>
            <p>${ad.description}</p>
            <p>${ad.date_created}</p>
        </div>
    </c:forEach>
</div>

</body>
</html>
