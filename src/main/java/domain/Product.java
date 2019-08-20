package domain;

import java.math.BigDecimal;
import net.sf.oval.constraint.Length;
import net.sf.oval.constraint.NotBlank;
import net.sf.oval.constraint.NotNegative;
import net.sf.oval.constraint.NotNull;

/**
 *
 * @author alghu437
 */
public class Product {
//////////////////////////////Lab6- 2 to4: add constraint & excercise 3

    ////////
              /*  @NotNull(message = "Price must be provided.")
      @NotNegative(message = "Price must be zero or greater.")
      private BigDecimal price;*/

                    @NotNull(message = "ID must be provided.")
    @NotNegative(message = "ID must be zero or greater.")
	private String productID;
        
        @NotNull(message = "Name must be provided.")
     @NotBlank(message = "Name must be provided.")
     @Length(min=2, message="Name must contain at least two characters.")
     private String name;
        
 
	private String description;
            
            
	    @NotNull(message = "Category must be provided.")
    @NotBlank(message = "Category must be provided.")
    @Length(min=2, message="Category must contain at least two characters.")
        private String category;
        
            @NotNull(message = "Price must be provided.")
      @NotNegative(message = "Price must be zero or greater.")
	private BigDecimal listPrice;
            
                @NotNull(message = "Quantity must be provided.")
    @NotNegative(message = "Quantity must be zero or greater.")
	private BigDecimal quantityStock;
	
	public Product() {
	}


	public Product(String productID, String name, String description, String category, BigDecimal listPrice, BigDecimal quantityStock) {
		this.productID = productID;
		this.name = name;
		this.description = description;
		this.category = category;
		this.listPrice = listPrice;
		this.quantityStock = quantityStock;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public BigDecimal getListPrice() {
		return listPrice;
	}

	public void setListPrice(BigDecimal listPrice) {
		this.listPrice = listPrice;
	}

	public BigDecimal getQuantityStock() {
		return quantityStock;
	}

	public void setQuantityStock(BigDecimal quantityStock) {
		this.quantityStock = quantityStock;
	}

	@Override
	public String toString() {
		return  "productID is " + productID + " And name is " + name ;
	}
	
}











