package com.banksteel.boot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.banksteel.interceptors.LoginInterceptor;

@Configuration
public class SpringMVCConfig extends WebMvcConfigurerAdapter{
	
	
    public void addInterceptors(InterceptorRegistry registry){
       
      
            /*调用我们创建的SessionInterceptor。
            * addPathPatterns("/api/**)的意思是这个链接下的都要进入到SessionInterceptor里面去执行
            * excludePathPatterns("/login")的意思是login的url可以不用进入到SessionInterceptor中，直接
            * 放过执行。
            * 
            * 注意：如果像注释那样写是不可以的。这样等于是创建了多个Interceptor。而不是只有一个Interceptor
            * 所以这里有个大坑，搞了很久才发现问题。
            * 
            * */
     
            registry.addInterceptor(new LoginInterceptor())
                    .excludePathPatterns("/login","/register","/register_view","/loginview");


    }
	

}
