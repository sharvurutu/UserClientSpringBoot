<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html> 

<head>
	<title>spring-microservices: User Details</title>
</head>

<body>

<a href="<c:url value='/'/>">Home</a> | <a href="userList">Users</a> ]</div>
			
			<h1>User Details</h1>
			
						User:
						${user.userId}
						Name:
						${user.name}
						City:
						${user.city}
</body>

</html>