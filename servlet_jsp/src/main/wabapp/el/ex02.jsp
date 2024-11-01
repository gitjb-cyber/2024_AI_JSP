<%@ page contentType='text/html; charset=UTF-8' %>
<%
pageContext.setAttribute("num1", 100); // 우선순위 1
request.setAttribute("num1", 200); // 우선순위 2
application.setAttribute("num1", 300); // 우선순위 3
// 속성명이 같으면 범위가 좁은게 1순위

pageContext.setAttribute("num2", 200);
%>

num1 : ${num1}<br>
pageScope.num1 : ${pageScope.num1}<br>
requestScope.num1 : ${requestScope.num1}<br>
applicationScope.num1 : ${applicationScope.num1}<br>

<%--
${num1 + num2}
--%>