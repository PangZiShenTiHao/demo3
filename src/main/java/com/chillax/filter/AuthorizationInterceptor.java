package com.chillax.filter;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName:AuthorizationInterceptor
 * @Description:TODO
 * @Author:huangxc
 * @Date: 2019/12/31 0031 11:15
 **/
/***
 * @Description:拦截器必须实现HandlerIntercetor接口
 * @Author:huangxc
 * @MethodName:
 * @param:
 * @Date: 2019/12/31 0031 11:17
 * @Return:
 */
public class AuthorizationInterceptor implements HandlerInterceptor {

    // 该方法进行处理器拦截，该方法将在controller 处理之前调用，返回true是拦截器才会继续往下走， 返回falseh整个请求结束
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("... preHandle ...");
        return true;
    }

    // 该方法将在controller 调用之后， 可以对ModelAndView进行操作 preHandler返回true 时才会进行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("... postHandle ...");
    }

    // 该方法将在整个请求完成后执行，主要用于清理资源，该方法只能在当前Intercepor的preHandle 返回值为true 时才执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        System.out.println("... afterCompletion ...");
    }
}
