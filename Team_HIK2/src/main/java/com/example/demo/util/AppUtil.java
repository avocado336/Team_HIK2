package com.example.demo.util;

import java.util.Locale;

import org.springframework.context.MessageSource;

/**
 * アプリケーション共通クラス
 * 
 * @author grang
 *
 */
public class AppUtil {
	
	public static String getMessage(MessageSource messageSource,String key, Object...params) { // object...params 渡しても渡さなくてもいい
		// params =  messagesに変数として値を入れることができる
		return messageSource.getMessage(key,params,Locale.JAPAN);
	}
	
}
