package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
//all findBy Abstract method here which returns list of model class obj
	interface ViewA{
	String getProdCode();
	String getProdCost();
}
interface ViewB{
	Double getProdCost();
}
List<ViewA> findByProdCodeAndProdCostLessThan(String prodCode, double prodCost);

List<ViewB> findByProdCost(Double prodCost);

}