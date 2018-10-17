<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Find Flight</title>
</head>
<body>
	<h2>Flight</h2>
	<table>
		<tr>
			<th>Airlince</th>
			<th>Dipature City</th>
			<th>Airival City</th>
			<th>Daparture Time</th>
		</tr>
		<c:forEach items=${flights} var="flight">
     		   <tr>
     		   <th>${flights.OPERATION_AIRLINES}</th>
     		   <th>${flights.DEPARTURE_CITY}</th>
     		   <th>${flights.ARRIVAL_CITY}</th>
     		   <th>${flights.ESTIMATED_DEPARTURE_TIME}</th>
     		   <th><a href="showCompleteReservation?flightId=${flight.id}"></a></th>
     		   </tr>
     	</c:forEach>
	</table>
</body>
</html>