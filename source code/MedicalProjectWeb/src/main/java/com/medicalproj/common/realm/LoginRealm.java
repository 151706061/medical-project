package com.medicalproj.common.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;

public class LoginRealm extends AuthorizingRealm {

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(
            PrincipalCollection principals) {
        if (principals == null) {
            throw new AuthorizationException(
                    "PrincipalCollection method argument cannot be null.");
        }
        String username = (String) getAvailablePrincipal(principals);
        System.out.println("-------------------" + username);//输出的其实是用户id

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        // 增加默认角色
        info.addRole("ROLE_USER");
        /*以下可以从数据库获取用户的角色以及权限信息，获取到的信息添加入info即可*/
        // // 增加自定义角色
        // if (null != userInfo.getRoleList()) {
        // for (RoleInfo roleInfo : userInfo.getRoleList()) {
        // if (null != roleInfo.getName()
        // && !"".equals(roleInfo.getName())) {
        // info.addRole(roleInfo.getName());
        // }
        // }
        // }
        // if (null != userInfo.getModuleInfo()) {
        // for (ModuleInfo moduleInfo : userInfo.getModuleInfo()) {
        // if (null != moduleInfo.getGuid()
        // && !"".equals(moduleInfo.getGuid())) {
        // info.addStringPermission(moduleInfo.getGuid());
        // }
        // }
        // }

        return info;

    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authcToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        String userName = token.getUsername();
        if (userName != null && !"".equals(userName)) {

            return new SimpleAuthenticationInfo(token.getPrincipal(),
                    token.getPassword(), token.getUsername());
        }
        return null;
    }

    /**
     * 清空用户关联权限认证，待下次使用时重新加载。
     * 
     * @param principal
     */
    public void clearCachedAuthorizationInfo(String principal) {
        SimplePrincipalCollection principals = new SimplePrincipalCollection(
                principal, getName());
        clearCachedAuthorizationInfo(principals);
    }

    /**
     * 清空所有关联认证
     */
    public void clearAllCachedAuthorizationInfo() {
        Cache<Object, AuthorizationInfo> cache = getAuthorizationCache();
        if (cache != null) {
            for (Object key : cache.keys()) {
                cache.remove(key);
            }
        }
    }
}
