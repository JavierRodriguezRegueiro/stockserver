package com.stock.server.product.application;

import com.stock.server.product.domain.Product;
import com.stock.server.product.domain.Name;
import com.stock.server.product.domain.Stock;
import com.stock.server.shared.domain.valueobject.Id;
import com.stock.server.shared.domain.valueobject.InvalidArgumentException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCreator {
    @PostMapping(path = "/create")
    public String createProduct() throws InvalidArgumentException {
        return new Product(Id.generateRandomId(), new Name("shirt"), new Stock(9)).toString();
    }
}
