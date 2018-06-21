package com.yuqiyu.chapter5.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * 修改自定义消息转换器
 *
 * @author wim
 * @version 1.0
 * @since 2018年04月24日
 */
@Configuration //添加@Configuration注解让SpringBoot自动加载类内的配置
public class FastJsonConfiguration extends WebMvcConfigurerAdapter {

    // springboot 2.0 前 extends WebMvcConfigurerAdapter 后 1.implements WebMvcConfigurer 2.extends WebMvcConfigurationSupport

    /**
     * 修改自定义消息转换器
     *
     * @param converters 消息转换器列表
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        // 调用父类的配置.
        super.configureMessageConverters(converters);
        // 创建fastJson消息转换器
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        // 创建配置类.
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        // 修改配置返回内容的过滤.
        fastJsonConfig.setSerializerFeatures(SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullStringAsEmpty);
        fastConverter.setFastJsonConfig(fastJsonConfig);
        converters.add(fastConverter);
    }

    /**
     * FastJson SerializerFeatures
     *
     * WriteNullListAsEmpty  ：List字段如果为null,输出为[],而非null
     * WriteNullStringAsEmpty ： 字符类型字段如果为null,输出为"",而非null
     * DisableCircularReferenceDetect ：消除对同一对象循环引用的问题，默认为false（如果不配置有可能会进入死循环）
     * WriteNullBooleanAsFalse：Boolean字段如果为null,输出为false,而非null
     * WriteMapNullValue：是否输出值为null的字段,默认为false。
     *
     */
}
