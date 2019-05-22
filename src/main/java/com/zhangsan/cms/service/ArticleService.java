package com.zhangsan.cms.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zhangsan.cms.domain.CmsArticle;

public interface ArticleService {
  /**
   * 根据文章id返回文章的详细信息,里面包含文章作者,栏目.分类等名称信息
   */
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
    * 增加文章
    * @param record
    * @return
    */
    int insertSelective(CmsArticle record);

    /*
     * 根据主键查询单个文章
     */
    CmsArticle selectByPrimaryKey(Integer id);
    /**
     * 修改文章
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(CmsArticle record);
    
    /**
     * 
     * @param channelId 栏目iD
     * @param catId 分类ID
     * @param status 状态  0: 默认, -1 :未通过 1: 通过
     * @return
     */
    List<Map> selectArticleList(@Param("channelId")Integer channelId,@Param("catId") Integer catId, @Param("status") Integer status);
 
    
}
