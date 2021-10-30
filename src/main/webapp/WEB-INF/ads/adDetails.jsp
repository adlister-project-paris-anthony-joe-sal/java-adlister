<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Ad Details" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />
    <div class="container">
        <h1>${myAd.title}</h1>
        <h3>${myAd.description}</h3>
        <h4>Date Created: ${myAd.date_created}</h4>
<%--        <form action="/adDetails" method="post">--%>
<%--            <input type="submit" value="Back" name="backButton">--%>
<%--        </form>--%>
        <button onclick="goBack()">Back</button>
    </div>
</body>

<script>
    function goBack() {
        window.history.back();
    }
</script>
</html>
