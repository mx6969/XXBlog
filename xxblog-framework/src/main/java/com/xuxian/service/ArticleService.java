package com.xuxian.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuxian.domain.entity.Article;
import com.xuxian.domain.entity.ResponseResult;

public interface ArticleService extends IService<Article> {
    ResponseResult hotArticleList();

    ResponseResult articleList(Integer pageNum, Integer pageSize, Long categoryId);

    ResponseResult getArticleDetail(Long id);
}
