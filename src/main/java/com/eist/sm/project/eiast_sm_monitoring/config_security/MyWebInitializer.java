package com.eist.sm.project.eiast_sm_monitoring.config_security;

import com.eist.sm.project.eiast_sm_monitoring.EiastSmMonitoringApplication;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebInitializer extends
        AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{EiastSmMonitoringApplication.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
