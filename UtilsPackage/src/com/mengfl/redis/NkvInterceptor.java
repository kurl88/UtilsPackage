//// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
//// Jad home page: http://www.kpdus.com/jad.html
//// Decompiler options: packimports(3) 
//// Source File Name:   NkvInterceptor.java
//
//package com.tlf.webui.struts.interceptor;
//
//import com.opensymphony.xwork2.ActionContext;
//import com.opensymphony.xwork2.ActionInvocation;
//import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
//import com.tlf.webui.action.userlogin.LoginNkvFilter;
//import com.tlf.webui.hibernate.UserInfo;
//import java.io.PrintStream;
//import java.io.Serializable;
//import javax.servlet.ServletContext;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//
//public class NkvInterceptor extends AbstractInterceptor
//    implements Serializable
//{
//
//    public NkvInterceptor()
//    {
//    }
//
//    public String intercept(ActionInvocation actioninvocation)
//        throws Exception
//    {
//        String result = null;
//        ActionContext actionContext = actioninvocation.getInvocationContext();
//        HttpServletRequest request = (HttpServletRequest)actionContext.get("com.opensymphony.xwork2.dispatcher.HttpServletRequest");
//        HttpSession session = request.getSession();
//        if(session == null)
//            break MISSING_BLOCK_LABEL_702;
//        String sid = LoginNkvFilter.getJSESSIONID(request);
//        if(sid == null)
//            break MISSING_BLOCK_LABEL_702;
//        UserInfo user = (UserInfo)session.getAttribute("USER_INFO");
//        if(user != null)
//            break MISSING_BLOCK_LABEL_676;
//        user = (new LoginNkvFilter()).getUserFromSession(sid);
//        if(user != null)
//        {
//            session.setAttribute("USER_INFO", user);
//            java.util.Map userRightMap = (new LoginNkvFilter()).getParamFromMap((new StringBuilder(String.valueOf(sid))).append("USER_RIGHT").toString());
//            session.setAttribute("USER_RIGHT", userRightMap);
//            String menuStr = (new LoginNkvFilter()).getParamFromString((new StringBuilder(String.valueOf(sid))).append("MENU_STR").toString());
//            session.setAttribute("MENU_STR", menuStr);
//            String loginKey = (new LoginNkvFilter()).getParamFromString((new StringBuilder(String.valueOf(sid))).append("JPMC_USER_LOGIN_TYPE").toString());
//            session.setAttribute("JPMC_USER_LOGIN_TYPE", loginKey);
//            String portalLoginUrl = (new LoginNkvFilter()).getParamFromString((new StringBuilder(String.valueOf(sid))).append("PORTAL_LOGIN_URL").toString());
//            session.setAttribute("PORTAL_LOGIN_URL", portalLoginUrl);
//            String portalId = (new LoginNkvFilter()).getParamFromString((new StringBuilder(String.valueOf(sid))).append("Http-User").toString());
//            session.setAttribute("Http-User", portalId);
//            String checkCode = (new LoginNkvFilter()).getParamFromString((new StringBuilder(String.valueOf(sid))).append("checkCode").toString());
//            session.setAttribute("checkCode", checkCode);
//            String ip = (new LoginNkvFilter()).getParamFromString((new StringBuilder(String.valueOf(sid))).append("USER_LOGIN_IP").toString());
//            session.setAttribute("USER_LOGIN_IP", ip);
//            String clientAccessToken = (new LoginNkvFilter()).getParamFromString((new StringBuilder(String.valueOf(sid))).append("zsy_access_token").toString());
//            session.setAttribute("zsy_access_token", clientAccessToken);
//            String userNo = (new LoginNkvFilter()).getParamFromString((new StringBuilder(String.valueOf(sid))).append("STANDARDID").toString());
//            session.setAttribute("STANDARDID", userNo);
//            Long currIndex = (new LoginNkvFilter()).getParamFromLong((new StringBuilder(String.valueOf(sid))).append("SESSION_URL_INDEX").toString());
//            session.setAttribute("SESSION_URL_INDEX", currIndex);
//            String pwd = (new LoginNkvFilter()).getParamFromString((new StringBuilder(String.valueOf(sid))).append("pwd").toString());
//            session.setAttribute("pwd", pwd);
//            String token = (new LoginNkvFilter()).getParamFromString((new StringBuilder(String.valueOf(sid))).append("SESSION_JPMC_UNIQUE_TOKEN_KEY").toString());
//            session.setAttribute("SESSION_JPMC_UNIQUE_TOKEN_KEY", token);
//            java.util.Map map = (new LoginNkvFilter()).getParamFromMap((new StringBuilder(String.valueOf(sid))).append("Online_User_Map").toString());
//            ServletContext application = session.getServletContext();
//            application.setAttribute("Online_User_Map", map);
//            result = actioninvocation.invoke();
//            break MISSING_BLOCK_LABEL_702;
//        }
//        return "loginError";
//        try
//        {
//            result = actioninvocation.invoke();
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//            System.out.println("Check NKV fail");
//            result = "loginError";
//        }
//        return result;
//    }
//}
