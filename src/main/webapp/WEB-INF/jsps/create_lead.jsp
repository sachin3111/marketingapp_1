<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Lead</title>
</head>
<body>
<h2>Create Lead</h2>
<form action="saveLead" method="post">
    <pre>
        First Name<input type="text" name="firstName"/>
        Last Name<input type="text" name="lastName"/>
        source 
        <select name="source">
        <option value="fortuner">fortuner</option>
        <option value="innova">innova</option>
        <option value="fordfigo">fordfigo</option>
        <option value="swift">swift</option>
         </select>
         Email<input type="email" name="email"/>
         Mobile<input type="text" name="mobile"/>
         <input type="submit" value="Save"/>
    </pre>

</form>

</body>
</html>