<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
<body>
<%@ include file="/WEB-INF/common/js.jsp"%>
<h2>Hello World!</h2>
<c:if test="${user==null}">
<a href="${base}/tologin" onclick="tologin()">登录</a>
</c:if>
<c:if test="${user!=null}">
<p>欢迎你，${user.userName}</p>
</c:if>

<script type="text/javascript">


</script>
</body>
</html>
