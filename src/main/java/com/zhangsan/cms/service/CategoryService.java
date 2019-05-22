package com.zhangsan.cms.service;

import java.util.List;
import java.util.Map;

import com.zhangsan.cms.domain.CmsCategory;
/**
 * 栏目子分类
 * @author charles
 *
 */
public interface CategoryService {

	/**
     * 根据栏目Id查询其下分类列表
     * @param cid
     * @return
     */
    List<Map> selectCategoryByChannel(Integer cid);
    /**
     * 修改
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(CmsCategory record);
    /**
     * 增加
     * @param record
     * @return
     */

    int insertSelective(CmsCategory record);
     /**
      * 根据iD 返回单个分类对象
      * @param id
      * @return
      */
    CmsCategory selectByPrimaryKey(Integer id);

}
