<%@ page contentType='text/html; charset=UTF-8' %>
<%
    // 만료 날짜 설정
    Cookie cookie = new Cookie("key4", "value4");
    cookie.setMaxAge(60 * 60 * 24 * 7); // 7일간
    cookie.setHttpOnly(true);

    response.addCookie(cookie);
%>
