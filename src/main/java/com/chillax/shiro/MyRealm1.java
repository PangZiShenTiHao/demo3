package com.chillax.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

/**
 * @ClassName:MyRealm1
 * @Description:自定义
 * @Author:huangxc
 * @Date: 2020/2/14 0014 15:01
 **/

public class MyRealm1 implements Realm {
    @Override
    public String getName() {
        return "myRealm1";
    }

    @Override
    public boolean supports(AuthenticationToken token) {
        // 仅支持UsernamePasswordToken类型的token
        return token instanceof UsernamePasswordToken;
    }

    @Override
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String)token.getPrincipal();//得到用户名
        String password = new String((char[])token.getCredentials());
        if(!"zhang".equals(username)){
            throw new UnknownAccountException();//用户名错误
        }
        if (!"123".equals(password)){
            throw new IncorrectCredentialsException();//密码错误
        }
        //如果身份认证验证成功，返回一个AuthenticationInfo实现
        return new SimpleAuthenticationInfo(username,password,getName());
    }
}
