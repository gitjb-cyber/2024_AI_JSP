<%@ page contentType='text/html; charset=UTF-8' %>
<%
    // 쿠키 삭제
    Cookie cookie = new Cookie("key4", "value4"); // value 값은 아무거나 입력 가능
    cookie.setMaxAge(0); // 1970.1.1 00:00:00
    response.addCookie(cookie);
%>