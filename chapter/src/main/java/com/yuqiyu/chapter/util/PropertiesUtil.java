package com.yuqiyu.chapter.util;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * <p>用于读取*.properties配置文件的工具类</p>
 *
 * @author wim
 * @version 1.0
 * @since 2018年04月24日
 */
public class PropertiesUtil {
    private final ResourceBundle resource;
    private final String fileName;

    /**
     * 构造函数实例化部分对象，获取文件资源对象
     *
     * @param fileName
     */
    public PropertiesUtil(String fileName) {
        this.fileName = fileName;
        Locale locale = new Locale("zh", "CN");
        this.resource = ResourceBundle.getBundle(this.fileName, locale);
    }

    /**
     * 根据传入的key获取对象的值
     *
     * @param key 属性文件对应的key
     * @return String 解析后的对应key的值
     */
    public String getValue(String key) {
        String message = this.resource.getString(key);
        return message;
    }
}
