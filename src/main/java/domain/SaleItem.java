package domain;

import java.math.BigDecimal;

/**
 *
 * @author alghu437
 */
class SaleItem {

	private BigDecimal quantityPurchased;
	private BigDecimal salePrice;
	private Product product;
	private Sale sale;

	public SaleItem(BigDecimal quantityPurchased, BigDecimal salePrice, Product product, Sale sale) {
		this.quantityPurchased = quantityPurchased;
		this.salePrice = salePrice;
		this.product = product;
		this.sale = sale;
	}

	public BigDecimal getQuantityPurchased() {
		return quantityPurchased;
	}

	public void setQuantityPurchased(BigDecimal quantityPurchased) {
		this.quantityPurchased = quantityPurchased;
	}

	public BigDecimal getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Sale getSale() {
		return sale;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}
	
	public BigDecimal getItemTotal(){
		BigDecimal total= this.quantityPurchased.multiply(salePrice);
		return total;
	}
}