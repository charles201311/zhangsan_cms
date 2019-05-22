/**
 * 
 */
package com.zhangsan.cms.utils;




public class AssertUtil {

	/**
	 * 功能说明：断言为真<br>
	 * @param exp
	 * @param defaultMessage
	 * void
	 * @throws CMSRuntimeException 
	 */
	public static void isTrue(Boolean exp, String defaultMessage) throws CMSRuntimeException{
		if(!Boolean.TRUE.equals(exp)){
			throw new CMSRuntimeException(defaultMessage);
		}
	}
	
	/**
	 * 功能说明：断言为假<br>
	 * @param exp
	 * @param defaultMessage
	 * void
	 * @throws CMSRuntimeException 
	 */
	public static void isFalse(Boolean exp, String defaultMessage) throws CMSRuntimeException{
		if(exp != null && exp){
			throw new CMSRuntimeException(defaultMessage);
		}
	}
	
	/**
	 * 功能说明：断言字符串必须有值<br>
	 * @param exp
	 * @param defaultMessage
	 * void
	 * @throws CMSRuntimeException 
	 */
	public static void hasLength(String exp, String defaultMessage) throws CMSRuntimeException{
		if(exp == null || exp.length() == 0){
			throw new CMSRuntimeException(defaultMessage);
		}
	}
	
	public static void notNull(Object object, String defaultMessage){
		if(object == null){
		//	throw new CMSRuntimeException(defaultMessage);
		}
	}
	
}
