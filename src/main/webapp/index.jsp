<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>




</head>
<body>
<h1>welcome</h1>
<html:form action="login">
name:<html:text property="username" />
email:<html:text property="email" />
<html:submit  value="submit"/>


</html:form>

<div>
<%=request.getAttribute("name") %>
</div>
<div>
<%=request.getAttribute("email") %>
</div>


</body>
</html>