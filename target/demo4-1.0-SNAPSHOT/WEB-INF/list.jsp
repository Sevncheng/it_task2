<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json"%>
<html>
<script type="text/javascript">
</script>
<body>
<h2>亲!欢迎你   ${emplogin.name}  登录</h2>
<table align="center" border="3" cellspacing="0">
    <tr>
        <td>用户ID</td>
        <td>用户姓名</td>
        <td>操作栏</td>
    </tr>
    <c:forEach items="${emplist}" var="e" varStatus="st">
    <tr>
        <td>${e.id}</td>
        <td>${e.name}</td>
        <td>
            <a href="${pageContext.request.contextPath}/Desk/Emp/Delete?id=${e.id}" >删除</a>
            <a href="${pageContext.request.contextPath}/Desk/Emp/UpdateUI?id=${e.id}" >更新</a>
        </td>
    </tr>
    </c:forEach>
</table>





<json:array>
    <c:forEach items="${emplist}" var="e" varStatus="st">
            <json:object>
                <json:property name="title" value="${e.id}"/>
                <json:property name="description" value="${e.name}"/>
            </json:object>
    </c:forEach>
</json:array>
</body>
</html>
