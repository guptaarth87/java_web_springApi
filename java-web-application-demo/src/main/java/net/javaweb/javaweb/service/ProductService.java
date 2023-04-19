package net.javaweb.javaweb.service;

import net.javaweb.javaweb.entity.Product;
import net.javaweb.javaweb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
//  2 post and 2 get requests
    public Product saveProduct(Product product){
       return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> product){
        return repository.saveAll(product);
    }

    public List<Product> getProducts(){
        return repository.findAll();
    }

    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name) {
        return repository.findByName(name);
    }
//   delete product
    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }
//update product
    public Product updateProduct(Product product) {
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }
}
