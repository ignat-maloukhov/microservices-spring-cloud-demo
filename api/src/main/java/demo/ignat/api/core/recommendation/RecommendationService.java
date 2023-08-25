package demo.ignat.api.core.recommendation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface RecommendationService {

    /**
     * Пример использования: "curl $HOST:$PORT/recommendation?productId=1".
     *
     * @param productId идентификатор Продукта
     * @return возвращает список рекомендаций
     */
    @GetMapping(
            value = "/recommendation",
            produces = "application/json")
    List<Recommendation> getRecommendations(
            @RequestParam(value = "productId", required = true) int productId);
}
