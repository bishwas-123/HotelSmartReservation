package com.hsr.demo.application.repository.review;

import com.hsr.demo.application.model.review.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReviewRepository extends JpaRepository<Review,Integer> {
}
