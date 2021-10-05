package com.jonas;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class UserContextListener implements ServletContextListener {

    private ServletContext servletContext;

    /**
     * 该方法在 ServletContext 启动之后被调用，并准备好处理客户端请求
     *
     * @param sce
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        this.servletContext = sce.getServletContext();
        servletContext.setAttribute("name", "Jonas");
    }

    /**
     * 在 ServletContext 将要关闭的时候调用
     *
     * @param sce
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        this.servletContext = null;
    }
}
