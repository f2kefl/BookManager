<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page pageEncoding="UTF-8" %>

<t:template>
<form:form method="post" action="addBook" commandName="book">
    <table>
        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="name"/></td>
            <td><form:errors cssClass="error" path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="genre">Genre</form:label></td>
            <td><form:input path="genre"/></td>
            <td><form:errors cssClass="error" path="genre"/></td>
        </tr>
        <tr>
            <td colspan="3"><input type="submit" value="Add Book"/></td>
        </tr>
    </table>
</form:form>
</t:template>
