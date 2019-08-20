// create a test template//

package dao;

import dao.ProductDao;
import domain.Product;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alghu437
 */
public class ProductDaoTest {

	private ProductDao dao = new ProductDao();
	private Product prodOne;
	private Product prodTwo;
	private Product prodThree;

	public ProductDaoTest() {
	}

	@Before
	public void setUp() {
		this.prodOne = new Product("1", "name1", "cat1", "desc1",
				  new BigDecimal("11.00"), new BigDecimal("22.00"));

		this.prodTwo = new Product("2", "name2", "cat2", "desc2",
				  new BigDecimal("33.00"), new BigDecimal("44.00"));

		this.prodThree = new Product("3", "name3", "cat3", "desc3",
				  new BigDecimal("55.00"), new BigDecimal("66.00"));

		dao.saveProduct(prodOne);
		dao.saveProduct(prodTwo);
	}

	@After
	public void tearDown() {
		dao.deleteProduct(prodOne);
		dao.deleteProduct(prodTwo);
		dao.deleteProduct(prodThree);
	}

	@Test
	public void testSaveProduct() {
		dao.saveProduct(prodThree);
		assertTrue("Ensure that the product was saved", dao.getProducts().contains(prodThree));
	}

	@Test
	public void testGetProducts() {
		Collection<Product> products = dao.getProducts();
		// ensure the result includes the two saved products
		assertTrue("prodOne should exist", products.contains(prodOne));
		assertTrue("prodTwo should exist", products.contains(prodTwo));
		// ensure the result ONLY includes the two saved products
		assertEquals("Only 2 products in result", 2, products.size());

	}

	@Test
	public void testDeleteProduct() {
		assertTrue("Ensure that the product does exist", dao.getProducts().contains(prodOne));
		dao.deleteProduct(prodOne);
		assertFalse("Ensure that the product does not exist", dao.getProducts().contains(prodOne));
	}

	public void testDaoGetAllCategories() {
		Collection<String> categories = dao.getCategories();
		// ensure the result includes the two saved categories
		assertTrue("prodOne should exist", categories.contains(prodOne.getCategory()));
		assertTrue("prodTwo should exist", categories.contains(prodTwo.getCategory()));
		// ensure the result ONLY includes the two saved categories
		assertEquals("Only 2 categories in result", 2, categories.size());
	}
        
            @Test

    public void testDaoFindById() {

        // get prodOne using findById method

        Product p = dao.getProductById(1);

        // assert that you got back prodOne, and not another product

        assertEquals("Should have got prodcut 1", prodOne, p);

        // assert that prodOne's details were properly retrieved

        assertEquals(prodOne.getProductID(), p.getProductID());

        assertEquals(prodOne.getName(), p.getName());

        assertEquals(prodOne.getDescription(), p.getDescription());

        assertEquals(prodOne.getCategory(), p.getCategory());

        assertEquals(prodOne.getListPrice(), p.getListPrice());

        assertEquals(prodOne.getQuantityStock(), p.getQuantityStock());

        // call getById using a non-existent ID

        Product n = dao.getProductById(99);

        // assert that the result is null

        assertNull("Product shouldnt exist", n);

        

    }

    

    @Test

    public void testDaoGetProductByCategory(){

        Collection<Product> pList = dao.filterByCategory("cat1");

        Product p = null;

        while(pList.iterator().hasNext()){

            p = pList.iterator().next();

        }

        if(p != null){

            //length should be 1

            assertEquals("Should have only one product", 1, pList.size());

            //product should be product 1

            assertEquals("Should have got product 1 in return", prodOne, p);

        

            assertEquals(prodOne.getProductID(), p.getProductID());

            assertEquals(prodOne.getName(), p.getName());

            assertEquals(prodOne.getDescription(), p.getDescription());

            assertEquals(prodOne.getCategory(), p.getCategory());

            assertEquals(prodOne.getListPrice(), p.getListPrice());

            assertEquals(prodOne.getQuantityStock(), p.getQuantityStock());

        }

        

        Collection<Product> nList = dao.filterByCategory("nothingness");

        assertEquals("Shouldn't contain anything", 0, nList.size());

        

    }

}


