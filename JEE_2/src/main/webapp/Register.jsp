<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family:Arial,sans-serif;
}

body
{
    background:#f4f4f4;
    display:flex;
    justify-content:center;
    align-items:center;
    height:100vh;
}

.container
{
    width:400px;
    background:white;
    padding:30px;
    border-radius:10px;
    box-shadow:0 0 10px rgba(0,0,0,0.2);
}

h2
{
    text-align:center;
    margin-bottom:20px;
    color:#333;
}

label
{
    display:block;
    margin-top:10px;
    margin-bottom:5px;
    font-weight:bold;
}

input[type="text"],
input[type="email"],
input[type="number"]
{
    width:100%;
    padding:10px;
    border:1px solid #ccc;
    border-radius:5px;
    margin-bottom:10px;
}

input[type="submit"]
{
    width:100%;
    padding:10px;
    background:#4CAF50;
    color:white;
    border:none;
    border-radius:5px;
    font-size:16px;
    cursor:pointer;
}

input[type="submit"]:hover
{
    background:#45a049;
}
</style>

</head>
<body>

<div class="container">
    <h2>User Registration</h2>

    <form action="RegisterServlet" method="post">

        <label>Name</label>
        <input type="text" name="name">

        <label>Email</label>
        <input type="email" name="email">

        <label>Contact</label>
        <input type="text" name="contact">

        <label>Address</label>
        <input type="text" name="address">

        <label>Age</label>
        <input type="number" name="age">

        <input type="submit" value="Register">

    </form>
</div>

</body>
</html>