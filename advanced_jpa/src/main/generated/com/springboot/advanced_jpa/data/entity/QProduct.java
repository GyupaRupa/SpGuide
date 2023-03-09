//package com.springboot.advanced_jpa.data.entity;
//
//import static com.querydsl.core.types.PathMetadataFactory.*;
//
//import com.querydsl.core.types.dsl.*;
//
//import com.querydsl.core.types.PathMetadata;
//import javax.annotation.processing.Generated;
//import com.querydsl.core.types.Path;
//
//
///**
// * QProduct is a Querydsl query type for Product
// */
//@Generated("com.querydsl.codegen.DefaultEntitySerializer")
//public class QProduct extends EntityPathBase<Product> {
//
//    private static final long serialVersionUID = -1011676806L;
//
//    public static final QProduct product = new QProduct("product");
//
//    public final DateTimePath<java.time.LocalDateTime> createAt = createDateTime("createAt", java.time.LocalDateTime.class);
//
//    public final StringPath name = createString("name");
//
//    public final NumberPath<Long> number = createNumber("number", Long.class);
//
//    public final NumberPath<Integer> price = createNumber("price", Integer.class);
//
//    public final NumberPath<Integer> stock = createNumber("stock", Integer.class);
//
//    public final DateTimePath<java.time.LocalDateTime> updateAt = createDateTime("updateAt", java.time.LocalDateTime.class);
//
//    public QProduct(String variable) {
//        super(Product.class, forVariable(variable));
//    }
//
//    public QProduct(Path<? extends Product> path) {
//        super(path.getType(), path.getMetadata());
//    }
//
//    public QProduct(PathMetadata metadata) {
//        super(Product.class, metadata);
//    }
//
//}
//
