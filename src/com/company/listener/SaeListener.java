package com.company.listener;  
  
import javax.servlet.ServletContextEvent;  
import javax.servlet.ServletContextListener;  
import javax.servlet.http.HttpSessionAttributeListener;  
import javax.servlet.http.HttpSessionBindingEvent;  
import javax.servlet.http.HttpSessionEvent;  
import javax.servlet.http.HttpSessionListener;  
  
/* 
 * ��sae��ʹ��struts����Ҫ���ӵ�Listener 
 */  
public class SaeListener implements ServletContextListener,HttpSessionListener,HttpSessionAttributeListener{  
  
    public void contextDestroyed(ServletContextEvent arg0) {System.out.println("1");}  
  
    public void contextInitialized(ServletContextEvent arg0) {System.out.println("2");}  
  
    public void sessionCreated(HttpSessionEvent arg0) {System.out.println("3");}  
  
    public void sessionDestroyed(HttpSessionEvent arg0) {System.out.println("4");}  
  
    public void attributeAdded(HttpSessionBindingEvent arg0) {System.out.println("5");}  
  
    public void attributeRemoved(HttpSessionBindingEvent arg0) {System.out.println("6");}  
  
    public void attributeReplaced(HttpSessionBindingEvent arg0) {System.out.println("7");}  
  
}  