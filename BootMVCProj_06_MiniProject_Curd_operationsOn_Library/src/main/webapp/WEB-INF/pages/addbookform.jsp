<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="c" %>

<c:form modelAttribute="libmgmt">
<br><br>
<table align="center">
<!--  -->
<tr>
<th>Book Name</th><th><c:input type="text" path="bookName"/></th>
</tr>
<tr>
<th>Author</th><th><c:input type="text" path="author"/></th>
</tr>

<tr>
<th>Quantity</th><th><c:input type="text" path="qnty"/></th>
</tr>
<tr>
<th>Book Type</th><th><c:input type="text" path="bookType"/></th>
</tr>
<tr>
<th><input type="submit" value="submit"/></th><th><input type="reset" value="cancel"/></th>
</tr>
</table>
</c:form>