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
	<table border="2">
		<tr>
			<th>Airline</th>
			<th>Departure City</th>
			<th>Arrival City</th>
			<th>Departure Time</th>
		</tr>
		<c:forEach items="${flights}" var="flight">
     		   <tr>
     		   <th>${flight.OPERATION_AIRLINES}</th>
     		   <th>${flight.DEPARTURE_CITY}</th>
     		   <th>${flight.ARRIVAL_CITY}</th>
     		   <th>${flight.ESTIMATED_DEPARTURE_TIME}</th>
     		   <th><a href="showCompleteReservation?flightId=${flight.id}">Select</a></th>
     		   </tr>
     	</c:forEach>
	</table>
</body>
</html>