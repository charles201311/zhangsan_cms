package com.zhangsan.cms.service;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhangsan.cms.domain.CmsComment;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class CommentServiceImplTest {
	@Autowired
	private CommentService service;

	@Test
	public void testInsertSelective() {
		/*char[] rands = new char[100];
		for(int i =0;i<100;i++) {
			CmsComment c = new CmsComment();
			Random random = new Random();
			int nextInt = random.nextInt(100)+1;
		
			rands[i] =(char) nextInt;
			
			System.out.println(nextInt);
		//service.insertSelective(record)
		}
		String string = new String(rands);
		System.out.println("==========="+string);
	}*/
		for(int i =0;i<100;i++) {
		System.out.print(this.getRandomChar());
		}
	}
	public static char getRandomChar() {
        return (char) (0x4e00 + (int) (Math.random() * (0x9fa5 - 0x4e00 + 1)));
    }

}
