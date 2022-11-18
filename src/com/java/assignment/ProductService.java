package com.java.assignment;

public interface ProductService {
	
	public String addProduct(Product prod);
	public Product[] listProducts();
	public Product searchProduct(int prodId);
	public Product updateProduct(Product prod);
	public boolean deleteProduct(int prodId);
	public Product getMaxPriceProduct();
	public Product getMinPriceProduct();
	public Product[]filterProductsInRange(double startRange, double endRange);
	public Product[]findProductByVendor(String prVendor);
	public Product[]findProductByCategory(String prCategory);
	
	
	
	
	
	
	

}
