package com.appbank.appbank.service;

import com.appbank.appbank.api.IProductService;
import com.appbank.appbank.model.Product;
import com.appbank.appbank.model.dao.ProductDao;
import com.appbank.appbank.model.dto.ProductDTO;
import com.appbank.appbank.model.dto.dtomapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("ProductService")
@Lazy
public class ProductService implements IProductService {
    @Autowired
    private ProductDao productDao;
    @Override

    public ProductDTO queryProduct(ProductDTO productDTO) {
        Product product = ProductMapper.INSTANCE.toEntity(productDTO);
        return ProductMapper.INSTANCE.toDTO(productDao.getReferenceById(product.getId_product()));
    }

   /* @Override
    public ProductDTO queryProduct(ProductDTO productDTO) {
        Product product = ProductMapper.INSTANCE.toEntity(productDTO);
        Product productFinal = this.productDao.getReferenceById(product.getId());
        ProductDTO dto = ProductMapper.INSTANCE.toDTO(productFinal);
        return dto;
    }*/

    @Override
    public List<ProductDTO> queryAllProducts() {
        return ProductMapper.INSTANCE.toDTOList(productDao.findAll());
    }

    @Override
    public int insertProduct(ProductDTO productDTO) {
        Product product = ProductMapper.INSTANCE.toEntity(productDTO);
        productDao.saveAndFlush(product);
        return product.getId_product();
    }

    @Override
    public int updateProduct(ProductDTO productDTO) {
        return insertProduct(productDTO);
    }

    @Override
    public int deleteProduct(ProductDTO productDTO) {
        int id = productDTO.getId_product();
        Product product = ProductMapper.INSTANCE.toEntity(productDTO);
        productDao.delete(product);
        return id;
    }

}
