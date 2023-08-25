package demo.ignat.api.core.review;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ReviewService {

    /**
     * Пример использования: "curl $HOST:$PORT/review?productId=1".
     *
     * @param productId идентификатор Продукта
     * @return список отзывов о продукте
     */
    @GetMapping(
            value = "/review",
            produces = "application/json")
    List<Review> getReviews(@RequestParam(value = "productId", required = true) int productId);
}