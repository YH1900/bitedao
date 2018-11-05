<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
${cookie.cook.value}

<button onclick="tijiao()">鞍山市</button>


</body>
<script src="<c:url  value="/script/jquery-3.2.1.js" />" charset="utf-8"></script>
<script type="text/javascript">
    function tijiao() {
        //debugger
        $.ajax({
            type: "POST",
            url: "<c:url  value="js.do" />/6",
            dataType: 'json',
            success: function (data) {
                console.log(JSON.stringify(data))
            }
        });
    }
</script>
</html>