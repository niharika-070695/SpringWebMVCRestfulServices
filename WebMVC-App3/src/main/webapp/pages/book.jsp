<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>Insert title here</title>
  </head>
  <body>
    <h1>List of Books</h1>
    <table>
      <thead>
        <tr>
          <th>Book ID</th>
          <th>Book Name</th>
          <th>Book Price</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${book}" var="bk">
          <tr>
            <td>${bk.bookId}</td>
            <td>${bk.bookName}</td>
            <td>${bk.bookPrice}</td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </body>
</html>
