package com.zhangsan.cms.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zhangsan.cms.domain.CmsArticle;

public interface CmsArticleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CmsArticle record);

    int insertSelective(CmsArticle record);

    CmsArticle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CmsArticle record);

    int updateByPrimaryKeyWithBLOBs(CmsArticle record);

    int updateByPrimaryKey(CmsArticle record);
    
    
      Map selectByid(Integer id);
    /**
     * 显示热门文章
     */
    List<Map> selectArticleByHot();
    /*cid
     * 按照栏目查询文章
     * 
     */
    List<Map> selectArticleByChannel(Integer cid);
    /**
     * 按照分类查询文章
     * @param catId
     * @return
     */
    List<Map> selectArticleByCategory(Integer catId);
    /**
     * 
     * @param channelId 栏目iD
     * @param catId 分类ID
     * @param status 状态  0: 默认, -1 :未通过 1: 通过
     * @return
     */
    List<Map> selectArticleList(@Param("channelId")Integer channelId,@Param("catId") Integer catId, @Param("status") Integer status);
    /***
     * 根据文章id返回文章的详细信息,里面包含文章作者,栏目.分类等名称信息
     * @param id
     * @return
     */
   
}