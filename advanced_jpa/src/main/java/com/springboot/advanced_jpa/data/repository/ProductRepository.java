package com.springboot.advanced_jpa.data.repository;

import com.springboot.advanced_jpa.data.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByNumber(Long number);
    List<Product> findAllByName(String name);
    Product queryByNumber(Long number);

    boolean existsByNumber(Long number);

    Long countByName(String name);

    void deleteByNumber(Long number);
    Long removeByName(String name);

    List<Product> findFirst5ByName(String name);
    List<Product> findTop10ByName(String name);

    Product findByNumberIs(Long number);
    Product findByNumberEquals(Long number);

    List<Product> findByUpdateAtNull();
    List<Product> findByUpdateAtIsNull();
    List<Product> findByUpdateAtNotNull();
    List<Product> findByUpdateAtIsNotNull();

//    Product findByisActiveTrue();
//    Product findByisActiveIsTrue();
//    Product findByisActiveFalse();
//    Product findByisActiveIsFalse();

    Product findByNumberAndName(Long number, String name);
    Product findByNumberOrName(Long number, String name);

//    List<Product> findByPriceIsGreaterThan(Long price);
//    List<Product> findByPriceGreaterThan(Long price);
//    List<Product> findByPriceGreaterThanEqaul(Long price);
//    List<Product> findByPriceIsLessThan(Long price);
//    List<Product> findByPriceLessThan(Long price);
//    List<Product> findByPriceLessThanEqual(Long price);
//    List<Product> findByPriceIsBetween(Long price);
//    List<Product> findByPriceBetween(Long price);

    List<Product> findByNameLike(String name);
    List<Product> findByNameIsLike(String name);

    List<Product> findByNameContains(String name);
    List<Product> findByNameContaining(String name);
    List<Product> findByNameIsContaining(String name);

    List<Product> findByNameStartsWith(String name);
    List<Product> findByNameStartingWith(String name);
    List<Product> findByNameIsStartingWith(String name);

    List<Product> findByNameEndsWith(String name);
    List<Product> findByNameEndingWith(String name);
    List<Product> findByNameIsEndingWith(String name);

    List<Product> findByNameOrderByNumberAsc(String name);
    List<Product> findByNameOrderByNumberDesc(String name);

    List<Product> findByNameOrderByPriceAscStockDesc(String name);

    List<Product> findByName(String name, Sort sort);

    // 페이징
    Page<Product> findByName(String name, Pageable pageable);

    Page<Product> findAll(Pageable pageable);

//    @Query("SELECT p FROM product AS p WHERE p.name = ?1")
//    @Query("SELECT p FROM product AS p WHERE p.name = :name")
//    List<Product> findByName(String name);
}