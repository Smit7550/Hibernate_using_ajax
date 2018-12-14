<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="x" value="${sessionScope.list}" />
<c:set var="y" value="${f:length(x) }" />
[
<c:forEach items="${x}" var="z" varStatus="counter">
{
"Fn":"${z.firstname}",
"Ln":"${z.lastname}",
"Un":"${z.username}"
}
<c:if test="${y ne counter.count}">,</c:if>
</c:forEach>
]
