package com.java.assignment;

import java.util.Arrays;

public class InMemoryProductServiceImpl implements ProductService {

	private Product[] prlist = new Product[0];
	private int index = 0;

	@Override
	public String addProduct(Product prod) {
		if (prod != null) {
			for (Product pr : prlist) {
				if (pr != null && pr.getProdId() == prod.getProdId()) {
					// System.out.println("Duplicate Product");
					return "Duplicate Product";
				}
			}
			if (prod.getProdId() <= 0) {
				// System.out.println("Invalid product ID...!");
				return "Invalid Product ID...!";
			} else {
				prlist = Arrays.copyOf(prlist, prlist.length + 1);
				prlist[index++] = prod;
				// System.out.println("Product Added Successfully");
				return "Product Added Successfully";

			}
		}
		return "Invalid Product...!";

	}

	@Override
	public Product[] listProducts() {
		Product tempPr[] = new Product[0];
		int count = 0;
		for (Product pr : prlist) {
			if (pr != null) {
				tempPr = Arrays.copyOf(tempPr, tempPr.length + 1);
				tempPr[count++] = pr;

			}
		}
		return tempPr;
	}

	@Override
	public Product updateProduct(Product prod) {
		if (prod != null) {
			// usually this for loop we use when we want to modify array
			/*
			 * for(int i=0;i<prlist.length;i++) {
			 * if(prlist[i].getProdId()==prod.getProdId()) {
			 * prlist[i].setProdName(prod.getProdName());
			 * prlist[i].setCategory(prod.getCategory());
			 * prlist[i].setProdPrice(prod.getProdPrice());
			 * prlist[i].setProdQty(prod.getProdQty());
			 * prlist[i].setVendor(prod.getVendor());
			 * 
			 * 
			 * return prlist[i];
			 * 
			 * 
			 * }
			 * 
			 * }
			 */
			// This is read only for loop can't use for array modification here we are
			// updating person not an array.
			for (Product pr : prlist) {
				if (pr.getProdId() == prod.getProdId()) {
					pr.setProdName(prod.getProdName());
					pr.setCategory(prod.getCategory());
					pr.setProdPrice(prod.getProdPrice());
					pr.setProdQty(prod.getProdQty());
					pr.setVendor(prod.getVendor());

					return pr;

				}

			}
		}
		return null;
	}

	@Override
	public Product searchProduct(int prodId) {
		if (prodId <= 0) {
			System.out.println("Invalid Product Id");
		}
		for (Product pr : prlist) {
			if (pr != null && pr.getProdId() == prodId) {
				return pr;
			}
		}
		return null;
	}

	@Override
	public boolean deleteProduct(int prodId) {
		if (prodId <= 0) {
			System.out.println("Invalid Product Id");
		}
		for (Product pr : prlist) {
			// with for each loop
			if (pr != null && pr.getProdId() == prodId) {
				pr = null;
				System.out.println("Product deleted Successfully");
			}
			return true;
		}
		System.out.println("Product with given ID not found please enter valid Prduct ID");
		return false;
	}

	@Override
	public Product[] filterProductsInRange(double startRange, double endRange) {
		Product[] tempArray = new Product[0];
		int index = 0;
		if (startRange >= endRange) {
			System.out.println("Invalid Criteria");
			return tempArray;
		}
		for (Product pr : prlist) {
			if (pr != null && pr.getProdPrice() >= startRange && pr.getProdPrice() <= endRange) {
				tempArray = Arrays.copyOf(tempArray, tempArray.length + 1);
				tempArray[index++] = pr;

			}

		}
		return tempArray;
	}

	@Override
	public Product[] findProductByVendor(String prVendor) {
		Product[] tempArray = new Product[0];
		int index = 0;
		if (prVendor != null) {
			for (Product pr : prlist) {
				if (pr != null && pr.getVendor().equals(prVendor)) {
					tempArray = Arrays.copyOf(tempArray, tempArray.length + 1);
					tempArray[index++] = pr;

				}
			}

		}
		return tempArray;

	}

	@Override
	public Product[] findProductByCategory(String prCategory) {
		Product[] tempArray = new Product[0];
		int index = 0;
		if (prCategory != null) {
			for (Product pr : prlist) {
				if (pr != null && pr.getVendor().equals(prCategory)) {
					tempArray = Arrays.copyOf(tempArray, tempArray.length + 1);
					tempArray[index++] = pr;

				}
			}

		}
		return tempArray;

	}

	@Override
	public Product getMaxPriceProduct() {
		Product tempPr =null;
		double maxPrice = 0;
		for (Product pr : prlist) {
			if (pr != null && pr.getProdPrice() > maxPrice) {
				maxPrice = pr.getProdPrice();
				tempPr = pr;
				}
						
		}
		System.out.println("Max price product is- "+tempPr+" and its price is- "+maxPrice);

		return tempPr;

	}

	@Override
	public Product getMinPriceProduct() {
		//Product tempPr =null;
		Product tempPr=prlist[0];
		double minPrice = prlist[0].getProdPrice();
		for (Product pr : prlist) {
			if (pr != null && pr.getProdPrice()< minPrice) {
				minPrice = pr.getProdPrice();
				tempPr = pr;
				
			}

		}
		System.out.println("Min price product is- "+tempPr+" and its price is- "+minPrice);
		return tempPr;

	}

}
