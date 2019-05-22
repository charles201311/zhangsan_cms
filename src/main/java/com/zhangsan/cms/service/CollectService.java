package com.zhangsan.cms.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.zhangsan.cms.domain.CmsCollect;

@Service
public interface CollectService {

	int deleteByPrimaryKey(Integer id);

	int insertSelective(CmsCollect record);

	CmsCollect selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(CmsCollect record);

	// 显示列表
	List<Map> selectList(@Param("name") String name);
	   /**
     * 根据用户ID 和文章ID 删除
     * @param aid
     * @param userId
     * @return
     */
    int    deleteByArticleIdAndUserId(Integer aid,Integer userId);
    
    /**
     *  根据根据用户ID 和文章ID 查询用户是否收藏该文章
     * @param aid
     * @param userId
     * @return
     */
    int selectCountByUseridAndArtilceId(Integer aid,Integer userId);
 
}
