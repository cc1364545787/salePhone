package com.example.goods.goodsbrowseapplication.base.repository;

import com.example.goods.goodsbrowseapplication.domain.goodscategory.po.GoodsCategoryPO;
import com.example.goods.goodsbrowseapplication.domain.goodscategory.repository.GoodsCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 商品类别Repository实现类
 *
 * <p>商品类别Repository实现类</p>
 *
 * @author WuHao
 * @since 2021/3/3 14:41
 */
@Repository
public class GoodsCategoryRepositoryImpl implements GoodsCategoryRepository {

    @Autowired
    private GoodsCategoryMapper goodsCategoryMapper;

    @Override
    public List<GoodsCategoryPO> findAllCategories() {
        List<GoodsCategoryPO> allCategories = goodsCategoryMapper.findAll();
        return allCategories;
    }
}
