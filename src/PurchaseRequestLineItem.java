
public class PurchaseRequestLineItem {

	private int id;
	private int purchaseRequestID;
	private int productID;
	private double quantity;
	
	public PurchaseRequestLineItem() {
		id = 0;
		purchaseRequestID = 0;
		productID = 0;
		quantity = 0.0;
	}
	
	public PurchaseRequestLineItem(int id, int purchaseRequestID, int productID, double quantity) {
		super();
		this.id = id;
		this.purchaseRequestID = purchaseRequestID;
		this.productID = productID;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPurchaseRequestID() {
		return purchaseRequestID;
	}

	public void setPurchaseRequestID(int purchaseRequestID) {
		this.purchaseRequestID = purchaseRequestID;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	//	@Override
	public String toString(int id, int purchaseRequestID, int productID, double quantity) {
		return "PurchaseRequestineItem= [id=" + id + ", purchaseRequestID=" + purchaseRequestID + 
				                      ", productID=" + productID + ", quantity=" + quantity + "]";
	}

}
