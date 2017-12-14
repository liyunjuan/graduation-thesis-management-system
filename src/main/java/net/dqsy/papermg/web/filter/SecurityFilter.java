//package net.dqsy.papermg.web.filter;
//
//import net.dqsy.papermg.sysmanager.po.PaperUser;
//import org.springframework.core.annotation.Order;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@Order(1)
//@WebFilter(filterName = "securityFilter", urlPatterns = "/*")
//public class SecurityFilter implements Filter {
//
//
//    @Override
//    public void init(FilterConfig filterConfig){
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
//            ServletException {
//
//        HttpServletRequest req = (HttpServletRequest) request;
//        HttpServletResponse res = (HttpServletResponse) response;
//        PaperUser user = (PaperUser) req.getSession().getAttribute("curr_user");
//        if (user != null) {
//            chain.doFilter(request, response);
//        } else {
//            req.getSession().setAttribute("msg", "后台操作需要登录");
//            res.sendRedirect(req.getContextPath() + "/login.jsp");
//        }
//    }
//
//    @Override
//    public void destroy() {
//
//    }
//}
