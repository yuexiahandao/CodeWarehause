package com.cache.key;


public class KeyGenerator {
	private static char separator = '_';
	
	private static String buildKey(String tableName, String columnName, String idStr, String ... additions) {
		String key = tableName + separator + columnName + separator + idStr;
		if (additions!=null && additions.length>0) {
			for (String addition : additions) {
				key += (separator + addition);
			}
		}
		return key;
	}

	public static String buildNoticeOrderCodeKey(String companyId) {
		return buildKey(TableName.NOTICE_ORDER_CODE_NAME, TableName.NOTICE_ORDER_CODE_COLUMN, 
				companyId, VersionController.NOTICE_ORDER_CODE_VERSION);
	}
}
