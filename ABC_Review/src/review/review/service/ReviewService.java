package review.review.service;

import java.util.List;

import review.review.dto.ReviewDTO;

public interface ReviewService {
	
	public List<ReviewDTO> reviewSelect(int page, int limit);
	
	public boolean reviewInsert(ReviewDTO reviewDTO);
	
	public boolean reviewUpdate(ReviewDTO reviewDTO);
	
	public boolean reviewDelete(int reviewNum);
	
	public ReviewDTO reviewSelectDetail (int reviewNum);
	
	public int reviewCount();
	
	public int boardReply (ReviewDTO reviewDTO);
	
	public boolean reviewId (int reviewNum, String id);
	
	public List<?> reviewSearch(String keyword, String keyfield, int page, int limit);
	
	public int reviewSearchCount (String keyword, String keyfield);
	
	
	
	

}
