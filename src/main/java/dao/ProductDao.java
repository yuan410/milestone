package dao;

import domain.Product;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

import com.google.common.collect.HashMultimap;

import com.google.common.collect.Multimap;
/**
 *
 * @author alghu437
 */
public class ProductDao implements NewInterface {

	//instance of dao class//
	private static Collection<Product> productsList = new HashSet<>();
	private static Collection<String> categoryList = new HashSet<>();
        private static Map<Integer, Product> idList = new HashMap<>();
        private static Multimap<String,Product>mm=HashMultimap.create();

    @Override
	public void saveProduct(Product product) {
		productsList.add(product);
                int productIdInt=Integer.parseInt(product.getProductID());
                idList.put(productIdInt, product);
	}

    @Override
	public Collection<Product> getProducts() {
		return productsList;
	}

    @Override
	public void deleteProduct(Product product) {
		productsList.remove(product);

	}

    @Override
	public Collection<String> getCategories() {
		for (Product p : productsList) {
			categoryList.add(p.getCategory());
		}
		return categoryList;
	}
        
        
    @Override
    public Product getProductById(Integer id){

        Product p = idList.get(id);

        if(p == null){

            return null;

        }

        return p;
        
        
    

    }
    
    @Override
         public Collection<Product> filterByCategory(String category){

        Multimap<String,Product> mm = HashMultimap.create();

        for(Product p : productsList){

            mm.put(p.getCategory(), p);

        }

        Collection<Product> elements = mm.get(category);

        return elements;

    }

    

}


