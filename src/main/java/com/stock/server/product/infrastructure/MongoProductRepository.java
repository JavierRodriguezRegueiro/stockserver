package com.stock.server.product.infrastructure;

import com.stock.server.product.domain.Product;
import com.stock.server.product.domain.ProductRepository;
import com.stock.server.shared.domain.valueobject.Id;
import com.stock.server.shared.domain.valueobject.InvalidArgumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MongoProductRepository implements ProductRepository {
    private MongoExtension mongo;
    private final MongoTemplate mongoTemplate;

    @Autowired
    public MongoProductRepository(MongoExtension mongo, MongoTemplate mongoTemplate) {
        this.mongo = mongo;
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void save(Product product) {
        this.mongo.save(product);
    }

    @Override
    public ArrayList<Product> findAll() {
        return (ArrayList<Product>) this.mongo.findAll();
    }

    @Override
    public Product find(Id id) throws InvalidArgumentException {
        Query query = new Query();
        query.addCriteria(Criteria.where("productId").is(id));
        List<Product> product = this.mongoTemplate.find(query, Product.class);
        if(product.size() == 1) {
            return product.get(0);
        } else {
            return Product.generateEmptyProduct();
        }
    }

    @Override
    public void remove(Id id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("productId").is(id));
        this.mongoTemplate.findAndRemove(query, Product.class);
    }
}
