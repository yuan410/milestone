/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Product;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

/**
 *
 * @author hh
 */
public interface NewInterface {

 	public static Collection<Product> productsList = new HashSet<>();//TreeSet??
	public static Collection<String> categoryList = new TreeSet<>();
	public static Map<Integer, Product> idList = new HashMap<>();

	public void deleteProduct(Product product);

	//lab4- project task1
	public Collection<Product> filterByCategory(String category);

	public Collection<String> getCategories();

	//lab4-3 searchid- 3.
	public Product getProductById(Integer id);

	public Collection<Product> getProducts();

	public void saveProduct(Product product);
    
}

