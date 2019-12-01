package com.example.demo.Controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.expample.demo.products.ProductData;

@Controller
public class ProductController {
	
	@GetMapping("/products")
	String products(Model model) {
		
		model.addAttribute("productlist", getProductList());
		model.addAttribute("company_name", "EagleiDevInc");
		
		return "productList";
	}
	
	List<ProductData> getProductList() {
		
		
		List<ProductData> productList = new ArrayList<ProductData>();
		
		productList.add(new ProductData("pen", new Date(), new Date(), 100.00));
		productList.add(new ProductData("wallet", new Date(), new Date(), 200.00));
		productList.add(new ProductData("bag", new Date(), new Date(), 300.00));
		
		return productList;
	}
}
