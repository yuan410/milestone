package domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author alghu437
 */
public class Sale {

	private int saleID;
	private LocalDate date;
	private String status;
	private ArrayList<SaleItem> saleitemList = new ArrayList<>();

	public Sale(int saleID, LocalDate date, String status) {
		this.saleID = saleID;
		this.date = date;
		this.status = status;
	}

	public int getSaleID() {
		return saleID;
	}

	public void setSaleID(int saleID) {
		this.saleID = saleID;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getTotal() {
		BigDecimal total = BigDecimal.ZERO;

		for (SaleItem prt : saleitemList) {
			total = total.add(prt.getItemTotal());
			
		}
		return total;
	}
}
