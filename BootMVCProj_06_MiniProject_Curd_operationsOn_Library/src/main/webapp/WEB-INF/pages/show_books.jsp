<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<c:choose>
<c:when test="${!empty list}">
<h1 style="color: red;text-align: center;" >Books Available in library</h1>
<table border="1" align="center" bgcolor="cyan">
<tr style="color: blue">
<th>Book ID</th>
<th>Book Name</th>
<th>Author Name</th>
<th>Quantity</th>
<th>Book Type</th>
<th>Update</th>
<th>Delete</th>
</tr>
<c:forEach var="lib" items="${list}">
<tr style="color:black;">
<td>${lib.bookid}</td>
<td>${lib.bookName}</td>
<td>${lib.author}</td>
<td>${lib.qnty}</td>
<td>${lib.bookType}</td>
<td style="color:yellow;"><a href="lib_edit?n0o=${lib.bookid}">Edit</a></td>
<td style="color:red;"><a href="lib_delete?n0o=${lib.bookid}">Delete</a></td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<h1 style="color: red;text-align: center;" >No books in library</h1>
</c:otherwise>
</c:choose>
<a style="color: red;text-align: center;" href="addbookform">Add New Book</a>
<br><br>
<a style="color: red;text-align: center;" href="./">Home</a>
