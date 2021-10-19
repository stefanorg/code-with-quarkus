package org.acme.utils;

import javax.inject.Named;

@Named("templateUtils")
public class TemplateUtils {
    private static final String helloPrefix = "Hello";

    public String getHelloPrefix() {
        return helloPrefix;
    }
}
