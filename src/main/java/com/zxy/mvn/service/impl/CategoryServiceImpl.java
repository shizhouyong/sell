package com.zxy.mvn.service.impl;

import com.zxy.mvn.dataobject.ProductCategory;
import com.zxy.mvn.repository.ProductCategoryRepository;
import com.zxy.mvn.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类目
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository categoryRepository;

    @Override
    public ProductCategory findOne(Integer categoryId) {
        return categoryRepository.findOne(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return categoryRepository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return categoryRepository.save(productCategory);
    }
}
