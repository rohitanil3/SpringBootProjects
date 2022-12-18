package com.onesolvent.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onesolvent.entity.Product;
import com.onesolvent.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
    public Product saveProduct(Product p) {
		
		Product product = productRepository.save(p);
		return p;
	}
    
      public List<Product> saveProducts(List<Product> products) {
		
		 return productRepository.saveAll(products);
	}
      
      public List<Product> findAllProducts() {
  		
 		 return productRepository.findAll();
 	}
      
      public Product findProductById(int id) {
    		
  		return productRepository.findById(id).orElse(null);
  		  
  	}
      
      public Product findProductByName(String name) {
    	  return productRepository.findByName(name);
    	  
      }
      
      public void deleteById(int id) {
    	  
    	  productRepository.deleteById(id);
    	  
      }
      
      public Product updateProduct(Product product) {
    	  Product existingProduct = productRepository.findById(product.getId()).orElse(null);
    	  existingProduct.setName(product.getName());
    	  existingProduct.setPrice(product.getPrice());
    	  existingProduct.setQuantity(product.getQuantity());
    	  return productRepository.save(existingProduct);
    	  
    	  
      }


}
