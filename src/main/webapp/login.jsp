<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>

	<!-- <form action="ProfileController" method="post">
		Username : <input type="text" name="uname"/>
		<button type="submit">SUBMIT</button>
		<a href="ProductController">Go To Home</a>
	</form> -->
	
	<div style="width: 63%; margin-left: 20%; margin-top: 15%;color: black;"  >
    <h1 style="font-size:50px ; font-weight: bolder;">Clothify</h1>
    <hr>
	<form style="font:white ;" method="post" action="ProfileController">
	<div class="form-group">
          <label>User Name</label>
          <input type="text" class="form-control" placeholder="Enter Your Name" name="uname">
        </div>
        <div class="form-group">
          <label>Phone Number </label>
          <input type="number" class="form-control" id="exampleInputPassword1" placeholder="Phone Number" name="phone">
        </div>
          <input type="submit" class="btn btn-outline-success">
        </form>
        </div>
</body>
</html>