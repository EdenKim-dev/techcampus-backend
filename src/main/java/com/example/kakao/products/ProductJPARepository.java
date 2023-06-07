package com.example.kakao.products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductJPARepository extends JpaRepository<Product, Integer> {

    public Optional<Product> findByProductId(int productId);
}
