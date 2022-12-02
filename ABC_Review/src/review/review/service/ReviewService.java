package review.review.service;

import java.util.List;

import review.review.dto.ReviewDTO;

public interface ReviewService {
	
	public List<ReviewDTO> reviewSelect(int page, int limit);
	
	public boolean reviewInsert(ReviewDTO reviewDTO);
	
	public boolean reviewUpdate(ReviewDTO reviewDTO);
	
	public boolean reviewDelete(int reviewNumer);
	
	public ReviewDTO reviewSelectDetail (int reviewNumber);
	
	public int reviewCount();
	
	public void reviewHitNumber(int reviewNumber);
	
	public int reviewReply (ReviewDTO reviewDTO);
	
	public boolean reviewId (int reviewNumber, String id);
	
	public List<?> reviewSearch(String keyword, String keyfield, int page, int limit);
	
	public int reviewSearchCount (String keyword, String keyfield);
	
	
	
	
	
	

}
