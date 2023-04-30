package com.xuxian.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuxian.domain.entity.Link;
import com.xuxian.domain.entity.ResponseResult;


/**
 * 友链(Link)表服务接口
 *
 * @author makejava
 * @since 2023-04-27 14:25:44
 */
public interface LinkService extends IService<Link> {

    ResponseResult getAllLink();
}
