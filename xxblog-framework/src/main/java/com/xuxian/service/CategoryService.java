package com.xuxian.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuxian.domain.entity.Category;
import com.xuxian.domain.entity.ResponseResult;


/**
 * 分类表(Category)表服务接口
 *
 * @author makejava
 * @since 2023-04-27 01:14:00
 */
public interface CategoryService extends IService<Category> {

    ResponseResult getCategoryList();
}
