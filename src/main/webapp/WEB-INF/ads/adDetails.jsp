<%--
  Created by IntelliJ IDEA.
  User: shirleyp1097
  Date: 10/29/21
  Time: 4:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Register For Our Site!" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />
    <h1>${myAd.title}</h1>
    <h3>${myAd.description}</h3>
    <h4>Date Created: ${myAd.date_created}</h4>
</body>
</html>
