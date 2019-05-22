package com.zhangsan.cms.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zhangsan.cms.domain.CmsComment;

public interface CmsCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CmsComment record);

    int insertSelective(CmsComment record);

    CmsComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CmsComment record);

    int updateByPrimaryKeyWithBLOBs(CmsComment record);

    int updateByPrimaryKey(CmsComment record);
    /**
     * 根据用户ID 查询评论.如果ID为空,则显示所有评论
     * @param userId
     * @return
     */
    List<Map> selectComment(@Param("userId")Integer userId,@Param("articleId")Integer articleId);
}