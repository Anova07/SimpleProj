package com.projects.minisota.service;

import com.projects.minisota.model.Product;

import com.projects.minisota.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

/*    List<Product> products  = new ArrayList<>(Arrays.asList(new Product(101,"iPhone",50000),
                                            new Product(102, "Canon Camera",70000),
                                             new Product(103, "Telescope",79000)));*/
    public List<Product> getProducts(){
        return repo.findAll();
    }


    public Product getProductById(int prodId) {
        /*return products.stream()
                .filter(p->p.getProdId() == prodId)
                .findFirst().orElse(new Product(100,"No Item listed as requested",0));
*/
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod){
        //products.add(prod);
         repo.save(prod);
    }


    public void updateProduct(Product prod) {

        repo.save(prod);
        /*int index =0;
        for(int i=0;i<products.size();i++) {
            if(products.get(i).getProdId() == prod.getProdId()){
                index = i;
            }
            products.set(index,prod);
        }*/

    }

    public void deleteProduct(int prodID) {
        repo.deleteById(prodID);
    }
/*        int index =0;
        for(int i=0;i<products.size();i++) {
            if(products.get(i).getProdId() == prodID){
                index = i;
            }

        }
        products.remove(index);
    }*/
}
