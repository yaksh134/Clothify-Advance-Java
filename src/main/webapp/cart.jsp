<%@page import="com.bean.ProductBean"%>
<%@page import="java.util.ArrayList"%>
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
<%-- <% 
	ArrayList<Integer> products = (ArrayList<Integer>)request.getAttribute("Products");
 %>
 <%
 	for(Integer i:products){
 		
 %>
 <%=i %>
 <%} --%>
 
<%
 ArrayList<ProductBean> products = (ArrayList<ProductBean>) request.getAttribute("Products");
%>
<h2 class="mx-5"><b><u>Your Cart</u></b></h2><hr>
<a class="link mx-5" href="ProductController">Add More Products...</a>


<%
		if (products == null || products.size() == 0) {
%>

	.......Cart is Empty......
<%
		}
		else{
				for(ProductBean p:products ){
%>
<div class="card text-center w-90  my-5 "  style="margin-top:20px;">
  <img src=<%=p.getImage()%> class="card-img-left rounded mx-auto d-block" alt="..."style="width: 20rem;">
  <div class="card-body" >
    <h5 class="card-header"><%=p.getName() %></h5>
    <p class="card-text">Description : <%=p.getDescription() %></p>
    <p class="card-text">Price : <%=p.getPrice() %></p>
    
    <a href="RemoveFromCart?productId=<%=p.getProductId() %>" class=" btn btn-outline-danger">Remove</a></p>
    
  
</div>

</div>

<%
				}
%>
<div class="text-center">
<a href="OrderServlet">
<button class="btn btn-success btn-lg">Place Order</button>
</a>
</div>
<%} %>
<div class="container-fluid">
  <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top ">
    <p class="col-md-4 mb-0 text-muted">© 2023 Clothify, Inc</p>

    <a href="#" class="col-md-4 d-flex align-items-center justify-content-center mb-3 mb-md-0 me-md-auto link-dark text-decoration-none">
      <!-- <svg class="bi me-2" width="40" height="32"><use xlink:href="#bootstrap"></use></svg> -->
      <img alt="clothify-image" height="80px" width="80px" src="data:image/jpeg;base64,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">
    </a>

    <ul class="nav col-md-4 justify-content-end">
      <li class="nav-item"><a href="ProductController" class="nav-link px-2 text-muted">Home</a></li>
      <li class="nav-item"><a href="ProductGenderController?gender=male" class="nav-link px-2 text-muted">Mens</a></li>
      <li class="nav-item"><a href="ProductGenderController?gender=female" class="nav-link px-2 text-muted">Womens</a></li>
      
    </ul>
  </footer>
</div>


</body>
</html>