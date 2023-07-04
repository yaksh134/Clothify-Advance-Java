package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.ProductBean;
import com.util.DbConnection;

public class ProductDao {

	public List<ProductBean> getAllProducts() {
		// TODO Auto-generated method stub
		List<ProductBean> products = new ArrayList<>();
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from products");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int productId = rs.getInt("productId");
				String name = rs.getString("name");
				String description = rs.getString("description");
				
				int qty = rs.getInt("quantity");
				int price = rs.getInt("price");
				String image = rs.getString("image");
				String type = rs.getString("type");
				String gender = rs.getString("gender");

				ProductBean product = new ProductBean();
				product.setProductId(productId);
				product.setName(name);
				product.setDescription(description);
				product.setQty(qty);
				product.setPrice(price);
				product.setType(type);
				product.setGender(gender);
				product.setImage(image);
			
				products.add(product);
				
				
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return products;
	}

	public void insertProduct(ProductBean product) {
		// TODO Auto-generated method stub
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into products(name,description,image,price,quantity,type,gender,productId) values(?,?,?,?,?,?,?,?)");
			ps.setString(1,product.getName());
			ps.setString(2,product.getDescription());
			ps.setString(3, product.getImage());
			ps.setInt(4,product.getPrice());
			ps.setInt(5,product.getQty());
			ps.setString(6, product.getType());
			ps.setString(7, product.getGender());
			ps.setInt(8,product.getProductId());
			int record = ps.executeUpdate();
			System.out.println(record + " row inserted.....");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void insertCart(ProductBean product) {
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into cart(productId) values(?)");
			ps.setInt(1,product.getProductId());
			int record = ps.executeUpdate();
			System.out.println(record + " row inserted.....");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Integer> getCart(){
		List<Integer> products = new ArrayList<>();
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from cart");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int productId = rs.getInt("productId");
				products.add(productId);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return products;
	}
	
	public void deleteCart(int productId) {
		try (Connection con = DbConnection.getConnection();
				PreparedStatement pstmt = con.prepareStatement("delete from cart where productId = ? ");

		) {

			pstmt.setInt(1, productId);
			int r = pstmt.executeUpdate();
			System.out.println(r + " record deleted....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clearCart() {
		try (Connection con = DbConnection.getConnection();
				PreparedStatement pstmt = con.prepareStatement("truncate table cart");
				
		) {
			int r = pstmt.executeUpdate();
			System.out.println(r + " record deleted....");

		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public List<ProductBean> getProductByType(String productType){
		List<ProductBean> products = new ArrayList<>();
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from products where type = ?");
			pstmt.setString(1, productType);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int productId = rs.getInt("productId");
				String name = rs.getString("name");
				String description = rs.getString("description");
				
				int qty = rs.getInt("quantity");
				int price = rs.getInt("price");
				String image = rs.getString("image");
				String type = rs.getString("type");
				String gender = rs.getString("gender");

				ProductBean product = new ProductBean();
				product.setProductId(productId);
				product.setName(name);
				product.setDescription(description);
				product.setQty(qty);
				product.setPrice(price);
				product.setType(type);
				product.setGender(gender);
				product.setImage(image);
			
				products.add(product);
				
				
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return products;
	}

	public List<ProductBean> getProductByGender(String genderType) {
		// TODO Auto-generated method stub
		List<ProductBean> products = new ArrayList<>();
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from products where gender = ?");
			pstmt.setString(1, genderType);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int productId = rs.getInt("productId");
				String name = rs.getString("name");
				String description = rs.getString("description");
				
				int qty = rs.getInt("quantity");
				int price = rs.getInt("price");
				String image = rs.getString("image");
				String type = rs.getString("type");
				String gender = rs.getString("gender");

				ProductBean product = new ProductBean();
				product.setProductId(productId);
				product.setName(name);
				product.setDescription(description);
				product.setQty(qty);
				product.setPrice(price);
				product.setType(type);
				product.setGender(gender);
				product.setImage(image);
			
				products.add(product);
				
				
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return products;
	}
	
	public  List<ProductBean> getProductBySearch(String search){
		List<ProductBean> products = new ArrayList<>();
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from products where name ilike ?");
			pstmt.setString(1, search+"%");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int productId = rs.getInt("productId");
				String name = rs.getString("name");
				String description = rs.getString("description");
				
				int qty = rs.getInt("quantity");
				int price = rs.getInt("price");
				String image = rs.getString("image");
				String type = rs.getString("type");
				String gender = rs.getString("gender");

				ProductBean product = new ProductBean();
				product.setProductId(productId);
				product.setName(name);
				product.setDescription(description);
				product.setQty(qty);
				product.setPrice(price);
				product.setType(type);
				product.setGender(gender);
				product.setImage(image);
			
				products.add(product);
				
				
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return products;
		
	}
	
	
	
	public ProductBean getProductById(int productId) {
		ProductBean product = new ProductBean();
		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement psmt = con.prepareStatement("select * from products where productid = ?");
			psmt.setInt(1, productId);
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()) {
				
				String name = rs.getString("name");
				String description = rs.getString("description");
				
				int qty = rs.getInt("quantity");
				int price = rs.getInt("price");
				String image = rs.getString("image");
				String type = rs.getString("type");
				String gender = rs.getString("gender");
				
				
				product.setProductId(productId);
				product.setName(name);
				product.setDescription(description);
				product.setQty(qty);
				product.setPrice(price);
				product.setType(type);
				product.setGender(gender);
				product.setImage(image);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return product;
	}

}
