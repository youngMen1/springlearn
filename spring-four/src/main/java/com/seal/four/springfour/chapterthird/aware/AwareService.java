package com.seal.four.springfour.chapterthird.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/8/31 13:54
 * @description 实现 BeanNameAware 和 ResourceLoaderAware 接口，获取 Bean 名称和资源加载的服务
 **/
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware{
	
	private String beanName;
	private ResourceLoader loader;
	
	/**
	 * 实现 ResourceLoaderAware 重写 setResourceLoader
	 */
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.loader = resourceLoader;
	}

	/**
	 * 实现 BeanNameAware 重写 setBeanName
	 */
	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}

	public void outputResult(){
		System.out.println("Bean 的名称为：" + beanName);
		Resource resource = loader.getResource("classpath:test.txt");
		try {
			System.out.println("ResourceLoader 加载的文件内容为：" + IOUtils.toString(resource.getInputStream()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
