package com.coderhouse.entity;

public class InvoiceDetail {
	    private int invoiceId;
	    private int invoiceDetailId;
	    private int amount;
	    private int productId;
	    private double price;
	    
		public int getInvoiceId() {
			return invoiceId;
		}
		public void setInvoiceId(int invoiceId) {
			this.invoiceId = invoiceId;
		}
		public int getInvoiceDetailId() {
			return invoiceDetailId;
		}
		public void setInvoiceDetailId(int invoiceDetailId) {
			this.invoiceDetailId = invoiceDetailId;
		}
		public int getAmount() {
			return amount;
		}
		public void setAmount(int amount) {
			this.amount = amount;
		}
		public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "InvoiceDetail [invoiceId=" + invoiceId + ", invoiceDetailId=" + invoiceDetailId + ", amount="
					+ amount + ", productId=" + productId + ", price=" + price + "]";
		}
		public InvoiceDetail() {
			super();
		}
	    
	    
}