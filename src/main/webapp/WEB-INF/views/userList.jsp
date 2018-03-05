<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html>

<head>
<title>User Micro Service : User List</title>
</head>

<body>
			<a href="/">Home</a>

			<h1>User List</h1>

				<c:forEach items="${user}" var="user">
					<li><a href="userDetails?userId=${user.userId}">${user.name}</a></li>
				</c:forEach>
</body>

</html>