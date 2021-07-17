package se.magnus.api.core.review;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

public interface ReviewService {

	Review createReview(@RequestBody Review body);

	/**
	 * Sample usage: curl $HOST:$PORT/review?productId=1
	 *
	 * @param productId
	 * @return
	 */
	@GetMapping(value = "/review", produces = "application/json")
	Iterable<Review> getReviews(@RequestHeader HttpHeaders headers, @RequestParam(value = "productId", required = true) int productId);

	void deleteReviews(@RequestParam(value = "productId", required = true) int productId);
}
