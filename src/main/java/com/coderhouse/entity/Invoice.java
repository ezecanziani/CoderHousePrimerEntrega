package com.coderhouse.entity;

import java.util.Date;

public class Invoice {
	 
	    private int id;
	    private int clientId;
	    private Date createdAt;
	    private double total;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getClientId() {
			return clientId;
		}
		public void setClientId(int clientId) {
			this.clientId = clientId;
		}
		public Date getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}
		public double getTotal() {
			return total;
		}
		public void setTotal(double total) {
			this.total = total;
		}
		
		
		
		public Invoice() {
			super();
		}
		@Override
		public String toString() {
			return "Invoice [id=" + id + ", clientId=" + clientId + ", createdAt=" + createdAt + ", total=" + total
					+ "]";
		}
	    
		
}
