<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="_header.jsp"/>
</head>
<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-sm-5">
            <br>
            <ul>
                <div class="alert alert-success" role="alert">
                    <c:set var="now" value="<%=new java.util.Date()%>"/>
                    <c:forEach var="operation" items="${requestScope.all}">
                        <li>${operation}</li>
                        <fmt:formatDate type="both" value="${now}"/>
                    </c:forEach>
                </div>
            </ul>
        </div>
    </div>
</div>

</body>
</html>
