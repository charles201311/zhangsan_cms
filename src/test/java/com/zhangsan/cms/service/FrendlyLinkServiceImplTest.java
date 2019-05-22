package com.zhangsan.cms.service;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zhangsan.cms.domain.CmsFrendlylink;
import com.zhangsan.cms.utils.CMSRuntimeException;
import com.zhangsan.common.utils.WebUtil;

/**
 * 测试友情链接
 * @author charles
 *
 */

public class FrendlyLinkServiceImplTest extends JunitParent{
	@Autowired  
   private FrendlyLinkService service;
	@Test
	public void testDeleteByPrimaryKey() {
	}

	@Test//批量增加
	public void testInsertSelective() {
		Map<String,String> map =new HashMap<>();
		/*map.put("网易", "http://163.com");
		map.put("京东", "http://jd.com");
		map.put("悟空", "http://悟空.com");
		map.put("阿里", "http://1688.com");
		map.put("淘宝", "http://淘宝.com");
		map.put("猪八戒", "http://bajie.com");*/
		map.put("cms", "http://127.0.0.1/getArticleDetail?id=27");
		
	   for(Map.Entry<String, String> entry :map.entrySet()) {
		
			 try {
				service.insertSelective(new CmsFrendlylink(entry.getKey(), entry.getValue()));
			} catch (CMSRuntimeException e) {
			
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}
		 }
		   
		   
	   }

}
