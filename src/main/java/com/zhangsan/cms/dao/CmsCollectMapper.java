package com.zhangsan.cms.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zhangsan.cms.domain.CmsCollect;
/**
 * 收藏
 * @author charles
 *
 */
public interface CmsCollectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CmsCollect record);

    int insertSelective(CmsCollect record);

    CmsCollect selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CmsCollect record);

    int updateByPrimaryKey(CmsCollect record);
    /**
     * 根据用户ID 和文章ID 删除
     * @param aid 
     * @param userId
     * @return
     */
    int    deleteByArticleIdAndUserId(@Param("aid")Integer aid,@Param("userId")Integer userId);
    /**
     *  根据根据用户ID 和文章ID 查询用户是否收藏该文章
     * @param aid
     * @param userId
     * @return
     */
    int selectCountByUseridAndArtilceId(@Param("aid")Integer aid,@Param("userId")Integer userId);
    
    //显示列表
    List<Map> selectList(@Param("name")String name);
}