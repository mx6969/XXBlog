package com.xuxian.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuxian.domain.entity.Comment;
import com.xuxian.domain.entity.ResponseResult;


/**
 * 评论表(Comment)表服务接口
 *
 * @author makejava
 * @since 2023-04-30 15:37:24
 */
public interface CommentService extends IService<Comment> {

    ResponseResult commentList(Long articleId, Integer pageNum, Integer pageSize);

    ResponseResult addComment(Comment comment);
}
