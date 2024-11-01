<%@ page contentType='text/html; charset=UTF-8' %>
<%
Cookie cookie = new Cookie("key3", "value3");
cookie.setPath(request.getContextPath()); // setPath 로 설정 해당 경로에 모두 쿠키값을 전달 주소는 유동적이므로 문구 설정은 지양

response.addCookie(cookie);
%>