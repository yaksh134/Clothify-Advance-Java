<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>





<!-- <form action="AddProductController" method="post">
	Name : <input type="text" name="name" /><br>
	Description : <input type="text" name="description" /><br>
	Quantity : <input type="int" name="quantity" /><br>
	Price : <input type="int" name="price" /><br>
	Image : <input type="text" name="image" /><br>
	Gender : <input type="text" name="gender" /><br>
	Type : <input type="text" name="type" /><br>
	<button type="submit">Add Product</button>
	<hr>
	
	<a href="ProductController">List All Books</a> 
</form> -->

<div class = "container" style="margin:100px;">
<h2><b><u>Add Product</u></b></h2>
<form action="AddProductController" method="post" >
  <div class="form-group">
    <label for="exampleInputEmail1">Name</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="name"> 
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Description</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="description"> 
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Quantity</label>
    <input type="int" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="quantity"> 
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Price</label>
    <input type="int" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="price"> 
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Image</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="image"> 
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Gender</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="gender"> 
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Type</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="type"> 
  </div>
  
  <button type="Add Product" class="btn btn-primary">Submit</button><br>
  <br>
  
  <a href="ProductController" class="link-info">List All Products</a> 
</form>


</div>



</body>
</html>