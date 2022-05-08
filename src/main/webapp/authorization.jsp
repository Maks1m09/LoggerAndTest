<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Authorization</title>
    <jsp:include page="_header.jsp"/>
<body>

<div class="container">
    <div class="row justify-content-center">
        <div class="col-sm-3">
            <form action="/authorization" method="post">
                <br>
                <input type="text" name="login" required placeholder="login">
                <input type="password" name="password" required placeholder="password">
                <br>
                <button type="submit" class="btn btn-dark">Authorization</button>
            </form>
        </div>
    </div>
</div>

</body>
</html>

