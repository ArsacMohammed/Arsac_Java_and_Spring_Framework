<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome to Arsac Page
<form action ="addAlien" method="post">
Enter your Id :<input type="text" name="aid"></br>
Enter your Name :<input type="text" name="aname"></br>
<input type="submit">
</form>
<hr>
<form action ="getAlien" method="get">
Enter your Id :<input type="text" name="aid"></br>
<input type="submit">
</form>

<hr>
<form action ="getAlienByAname" method="get">
Enter your Name :<input type="text" name="aname"></br>
<input type="submit">
</form>
<hr>
<form action ="getAlienByAnameOrderByAname" method="get">
Enter your Name order :<input type="text" name="aname"></br>
<input type="submit">
</form>
<hr>
<form action ="getAlienUsingQuery" method="get">
Enter your Name order :<input type="text" name="aname"></br>
<input type="submit">
</form>

</body>
</html>