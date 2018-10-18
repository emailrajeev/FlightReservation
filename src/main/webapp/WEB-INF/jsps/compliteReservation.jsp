<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Comlite Reservation Form</title>
</head>
<body>
	<h2>Flight Complite Reservation</h2>

	Airlince: ${flights.OPERATION_AIRLINES} <br/>
	Departure City: ${flights.DEPARTURE_CITY}<br/>
	Arrivel City: ${flights.ARRIVAL_CITY} <br/>
	
	<form action="CompliteReservation" method="post">
		<pre>
			<h2>Passenger Deteils</h2>
			First Name: <input type="text" name="FIRST_NAME"/>
			Last Name: <input type="text" name="LAST_NAME" />
			Email: <input type="text" name="EMAIL"/>
			Phone: <input type="text" name="PHONE"/>
			<h2>Card Details</h2>
			Name of Card: <input type="text" name="nameOfCatd"/>
			Card Number: <input type="text" name="cardNumber"/>
			Expiry Date: <input type="text" name="expiryDate"/>
			Three Digit Sec Code: <input type="text" name="threeDigitSecCode"/>
			<input type="hidden" name="flightId" value="${flight.id}"/>
			<input type="submit" value="Conform"/>
		</pre>
	</form>
</body>
</html>