<%@taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Output</title>
</head>
<body>
<h1>spring mvc :: </h1>
<table border="1">
    <tr>
        <th>user Id ::</th>
        <th>user Name ::</th>
        <th>user Role ::</th>
    </tr>

    <c:forEach items="${user}" var="obj">
        <tr>
            <td>
                ${obj.userId}
            </td>
            <td>
                    ${obj.userName}
            </td>
            <td>
                    ${obj.userRole}
            </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>