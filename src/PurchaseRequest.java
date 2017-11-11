
public class PurchaseRequest {

	private int id;
	private int userID;
	private String description;
	private String justification;
//	private date dateNeeded;
	private String deliveryMode;
	private int statusID;
	private double total;
//	private date submittedDate;
	private String reasonForRejection;

	public PurchaseRequest() {//NOTE: Add 2 date fields into string below once we review dates
		id = 0;
		userID = 0;
		description = "";
		justification = "";
		deliveryMode = "";
		statusID = 0;
		total = 0.0;
		reasonForRejection = "";
	}	
	
	public PurchaseRequest(int id, int userID, String description, String justification, String deliveryMode, int statusID,
		                   double total, String reasonForRejection) {//NOTE: Add 2 date fields into string below once we review dates
		super();
		this.id = id;
		this.userID = userID;
		this.description = description;
		this.justification = justification;
		this.deliveryMode = deliveryMode;
		this.statusID = statusID;
		this.total = total;
		this.reasonForRejection = reasonForRejection;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public String getDeliveryMode() {
		return deliveryMode;
	}

	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}

	public int getStatusID() {
		return statusID;
	}

	public void setStatusID(int statusID) {
		this.statusID = statusID;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getReasonForRejection() {
		return reasonForRejection;
	}

	public void setReasonForRejection(String reasonForRejection) {
		this.reasonForRejection = reasonForRejection;
	}	
	
	//NOTE: Add 2 date fields getters/setters once we review dates
	
//	@Override
	public String toString(int id, int userID, String description, String justification, String deliveryMode, int statusID,
                           double total, String reasonForRejection) {//NOTE: Add 2 date fields into string below once we review dates
		return "PurchaseRequest= [id=" + id + ", userID=" + userID + ", description=" + description + 
				               ", justification=" + justification + ", deliveryMode=" + deliveryMode + 
				               ", statusID=" + statusID + ", total=" + total + ", reasonForRejection=" + reasonForRejection + "]";
	}

}
