package com.alaili.springcloud.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: LiBaoDeng
 * @Date: 2022-03-31 16:13
 */
@Component
@ConfigurationProperties(prefix = "remoteinfo")
@PropertySource("classpath:customizedInfo.properties")
public class CustomizedInfo {
    private String remoteServiceUri;

    public String getRemoteServiceUri() {
        return remoteServiceUri;
    }

    public void setRemoteServiceUri(String remoteServiceUri) {
        this.remoteServiceUri = remoteServiceUri;
    }
}
