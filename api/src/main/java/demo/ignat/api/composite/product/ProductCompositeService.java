package demo.ignat.api.composite.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductCompositeService {

    /**
     * Пример использования: "curl $HOST:$PORT/product-composite/1".
     *
     * @param productId идентификатор Продукта
     * @return возвращает объект ProductAggregate если он найден или null если не найден
     */
    @GetMapping(
            value = "/product-composite/{productId}",
            produces = "application/json")
    ProductAggregate getProduct(@PathVariable int productId);
}