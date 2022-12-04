package review.review.dto;

public class ReviewDTO {
	
	
	private int reviewNumber;
	private int orderNumber;
	private String Id;
	private String reviewDate;
	private String rating;
	private String sizeReview;
	private String colorReview;
	private String footballReview;
	private String instepReview;
	private String reviewContent;
	private byte reviewFile;
	
	
	public int getReviewNumber() {
		return reviewNumber;
	}
	public void setReviewNumber(int reviewNumber) {
		this.reviewNumber = reviewNumber;
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getId() {
		return Id;
	}
	public void setUserId(String Id) {
		this.Id = Id;
	}
	public String getReviewDate() {
		return reviewDate;
	}
	public void setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getSizeReview() {
		return sizeReview;
	}
	public void setSizeReview(String sizeReview) {
		this.sizeReview = sizeReview;
	}
	public String getColorReview() {
		return colorReview;
	}
	public void setColorReview(String colorReview) {
		this.colorReview = colorReview;
	}
	public String getFootballReview() {
		return footballReview;
	}
	public void setFootballReview(String footballReview) {
		this.footballReview = footballReview;
	}
	public String getInstepReview() {
		return instepReview;
	}
	public void setInstepReview(String instepReview) {
		this.instepReview = instepReview;
	}
	public byte getReviewFile() {
		return reviewFile;
	}
	public void setReviewFile(byte reviewFile) {
		this.reviewFile = reviewFile;
	}
	
	
	public String getReviewContent() {
		return reviewContent;
	}
	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}
	@Override
	public String toString() {
		return "ReviewDTO [reviewNumber=" + reviewNumber + ", orderNumber=" + orderNumber + ", Id=" + Id
				+ ", reviewDate=" + reviewDate + ", rating=" + rating + ", sizeReview=" + sizeReview + ", colorReview="
				+ colorReview + ", footballReview=" + footballReview + ", instepReview=" + instepReview
				+ ", reviewContent=" + reviewContent + ", reviewFile=" + reviewFile + "]";
	}

	
	
	
	
}
