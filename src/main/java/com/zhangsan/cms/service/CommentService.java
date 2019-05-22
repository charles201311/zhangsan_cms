package com.zhangsan.cms.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zhangsan.cms.domain.CmsComment;

public interface CommentService {

	  /**
     * 根据用户ID 查询评论.如果ID为空,则显示所有评论
     * @param userId
     * @return
     */
    List<Map> selectComment(Integer userId,Integer articleId);
    
    /**
     * 增加评论
     * @param record
     * @return
     */
    int insertSelective(CmsComment record);

}
