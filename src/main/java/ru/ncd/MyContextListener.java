package ru.ncd;

import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
@Component
public class MyContextListener implements ServletContextListener
{
    public static ServletContext sc;
    @Override
    public void contextInitialized (ServletContextEvent contextEvent)
    {
        ServletContext context = contextEvent.getServletContext();
        sc = context;
    }

    @Override
    public void contextDestroyed ( ServletContextEvent contextEvent )
    {
        ServletContext context = contextEvent.getServletContext();
    }

    public ServletContext getSc() {
        return sc;
    }

}