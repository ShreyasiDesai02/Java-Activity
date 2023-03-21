<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome To Movie Ticket Booking</h1>
<form action ="checker">
Mobile Number: <input type = "tel"  name = "umobile" placeholder = "Enter your mobile number"  required><br><br>
Movie Name: <select name = "movie">
<option value = "Screen1"> Screen 1: KGF</option>
<option value = "Screen1"> Screen 2: Bahubali</option>
<option value = "Screen1"> Screen 3: DDLJ</option>
<option value = "Screen1"> Screen 4: Ved</option>
</select><br><br>
Show Date:<input type ="date" name = "date" placeholder = "Select the date"><br><br>
Show Time: <select name = "time">
<option value = "morining" >Morning-10:00</option>
<option value = "afternoon" >Afternoon-2:30</option>
<option value = "evening" >Evening-6:00</option>
<option value = "night" >Night-10:00</option>
</select><br><br>
Ticket Type:<input type="radio" name="tickettype" value="economy"/> Economy Rs. 150  
<br>
&emsp;&emsp;&emsp;&emsp;&emsp;<input type = "radio" name = "tickettype" value = "platinum" />Platinum Rs. 250<br><br>
Number of Tickets: <input type = "number" name = "no.ticket" placeholder = "Enter the number of ticket" id="ticketCount" max="298" min="1"><br><br>
  <input type ="submit" onclick="ab()" name = "availability" value = "Check Availability"><br><br>
  Payment Type: <select name = "payment">
  <option value = "card">Card</option>
  <option value = "upi">UPI</option>
  <option value = "cash">Cash</option>
  </select><br><br>
Transaction Id:  <input type = "text" name = "transaction" ><br><br>
  <input type = "submit" name = "book" value = "Book Now">

</form>
<script>
function ab(){
let ticketCount = document.getElementById("ticketCount");
if( ticketCount >= 298 ){
	alert("not");
}
else{
	alert("yes");
}
}

</script>
</body>
</html>