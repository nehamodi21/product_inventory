package com.java.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class AppStrat {
	public static void main(String[] args) {

		Product p1 = new Product(1, "Mobile", 44220.33, 4, "Flipkart", "Electronics");
		Product p2 = new Product(2, "TV", 64220.33, 5, "Amazon", "Electronics");
		Product p3 = new Product(3, "Fridge", 87220.33, 2, "Flipkart", "HomeAppliances");
		Product p4 = new Product(4, "Laptop", 59220.33, 3, "Amazon", "Electronics");

		InMemoryProductServiceImpl service = new InMemoryProductServiceImpl();

		System.out.println("\n 1. Add Product");
		System.out.println("\n 2. List Product");
		System.out.println("\n 3. Search Product");
		System.out.println("\n 4. Update Product");
		System.out.println("\n 5. Delete Product");
		System.out.println("\n 6. Get Max Price Product");
		System.out.println("\n 7. Get Min Price Product");
		System.out.println("\n 8. Add Product");
		System.out.println("\n 9. Products in Price Range");
		System.out.println("\n 10.Find Product by Vendor");
		System.out.println("\n 11. Find Product by Category");

		while (true) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter your choice :-");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("-----Add Product-----");
//				System.out.println("Enter Product Id :- ");
//				int prId = sc.nextInt();
//
//				System.out.println("Enter Product Name:- ");
//				String prNm = sc.next();
//
//				System.out.println("Enter Product Price :- ");
//				double prPrice = sc.nextDouble();
//
//				System.out.println("Enter Product Qty:- ");
//				int prQty = sc.nextInt();
//
//				System.out.println("Enter Product Vendor :- ");
//				String prVendor = sc.next();
//
//				System.out.println("Enter Product Category :- ");
//				String prCategory = sc.next();
//
//				Product p = new Product(prId, prNm, prPrice, prQty, prVendor, prCategory);

				System.out.println(service.addProduct(p1));
				System.out.println(service.addProduct(p2));
				
				System.out.println(service.addProduct(p3));
				System.out.println(service.addProduct(p4));
				
				

				break;

			case 2:
				System.out.println("-----List of Products------");
				System.out.println(Arrays.toString(service.listProducts()));
				break;

				
			case 3:
				System.out.println("------Search Product-----");
				// System.out.println(service.seacrchProduct(1));
				System.out.println("Enter Product ID to search the Product :-");
				int pId = sc.nextInt();
				System.out.println("Product with the given id :- " + service.searchProduct(pId));

				break;

			case 4:
				System.out.println("-----Update Product-----");
				System.out.println("Enter Product Id :- ");
				int prId1 = sc.nextInt();

				System.out.println("Enter Product Name:- ");
				String prNm1 = sc.next();

				System.out.println("Enter Product Price :- ");
				double prPrice1 = sc.nextDouble();

				System.out.println("Enter Product Qty:- ");
				int prQty1 = sc.nextInt();

				System.out.println("Enter Product Vendor :- ");
				String prVendor1 = sc.next();

				System.out.println("Enter Product Category :- ");
				String prCategory1 = sc.next();

			//	Product p1 = new Product(prId1, prNm1, prPrice1, prQty1, prVendor1, prCategory1);

				// Product pp1 = new Product(1, "TV", 5578.7, 3, "Amazon", "HomeApliances");
				System.out.println(service.updateProduct(p1));
				System.out.println("Product Updated Succesfully ");

				break;

			case 5:
				System.out.println("------Delete Product-----");
				System.out.println("Enter Product Id :-");
				int id = sc.nextInt();
				
				System.out.println(service.deleteProduct(id));

				break;
				
			case 6:
				System.out.println("------Get Max Price Product-----");
				service.getMaxPriceProduct();
				//System.out.println(service.getMaxPriceProduct());

				break;
			case 7:
				System.out.println("------Get Min Price Product-----");
				service.getMinPriceProduct();
				//System.out.println(service.getMinPriceProduct());

				break;


			
			case 8:
				System.out.println("------Filter Products In Given Range -----");
				System.out.println("Enter Product Start Range :-");
				double str = sc.nextDouble();
				System.out.println("Enter Product End Range :-");
				double endr = sc.nextDouble();
				System.out.println(Arrays.toString(service.filterProductsInRange(str, endr)));

				break;

			default:
				System.out.println("Invalid Choice Please Enter Valid Choice...!");
				break;

			}
			System.out.println("Do you want to continue :-Y/N");
			String str = sc.next();
			if (str.equalsIgnoreCase("n")) {
				System.out.println("Execution Completed");
				break;

			}

		}

	}
}