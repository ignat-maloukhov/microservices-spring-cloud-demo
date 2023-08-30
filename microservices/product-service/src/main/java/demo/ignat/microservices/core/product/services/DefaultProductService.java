package demo.ignat.microservices.core.product.services;

import demo.ignat.api.core.product.dto.Product;
import demo.ignat.api.core.product.ProductService;
import demo.ignat.api.exception.InvalidInputException;
import demo.ignat.api.exception.NotFoundException;
import demo.ignat.util.http.ServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultProductService implements ProductService {

    private static final Logger LOG = LoggerFactory.getLogger(DefaultProductService.class);

    private final ServiceUtil serviceUtil;

    @Autowired
    public DefaultProductService(ServiceUtil serviceUtil) {
        this.serviceUtil = serviceUtil;
    }

    @Override
    public Product getProduct(int id) {
        LOG.debug("/product return the found product for productId={}", id);

        if (id < 1) {
            throw new InvalidInputException("Invalid productId: " + id);
        }

        if (id == 13) {
            throw new NotFoundException("No product found for productId: " + id);
        }

        return new Product(id, "name-" + id, 123, serviceUtil.getServiceAddress());
    }
}
