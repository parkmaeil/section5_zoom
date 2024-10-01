<%@ page contentType="text/html;charset=UTF-8" language="java"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="cpath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
  <script>
     function goDel(num){
         location.href="${cpath}/delete?num="+num; //   /MF01/delete?num=1
     }
     function goRegister(){
        location.href="${cpath}/registerGet";
     }
  </script>
</head>
<body>

    <div class="container">
      <h2>Web MVC Framework Advanced</h2>
      <div class="card">
        <div class="card-header">Book List</div>
        <div class="card-body">
          <table class="table table-bordered table-hover">
              <thead>
                  <tr>
                     <th>번호</th>
                     <th>제목</th>
                     <th>가격</th>
                     <th>저자</th>
                     <th>페이지수</th>
                     <th>삭제</th>
                  </tr>
              </thead>
              <tbody>
              <c:forEach var="book" items="${list}">
                                  <tr>
                                       <td>${book.num}</td>
                                       <td><a href="${cpath}/view?num=${book.num}">${book.title}</a></td>
                                       <td>${book.price}</td>
                                       <td>${book.author}</td>
                                       <td>${book.page}</td>
                                       <td><button class="btn btn-sm btn-warning" onclick="goDel(${book.num})">삭제</button></td>
                                    </tr>
              </c:forEach>
              </tbody>
          </table>
          <button class="btn btn-sm btn-primary"  onclick="goRegister()">등록하기</button>
        </div>
        <div class="card-footer">인프런_마프 1탄_박매일</div>
      </div>
    </div>

</body>
</html>