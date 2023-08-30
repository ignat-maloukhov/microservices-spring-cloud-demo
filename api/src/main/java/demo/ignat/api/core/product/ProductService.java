package demo.ignat.api.core.product;

import demo.ignat.api.core.product.dto.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductService {

    /**
     * Пример использования: "curl $HOST:$PORT/product/1".
     *
     * @param id идентификатор продукта
     * @return возвращает объект типа Product, если он найден или null если не найден
     */
    @GetMapping(
            value = "/product/{id}",
            produces = "application/json")
    Product getProduct(@PathVariable int id);
}