package org.openpaas.servicebroker.kubernetes.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Property 변수를 담은 서비스 클래스
 * @author Hyerin
 * @since 2018.08.22
 * @version 20180822
 */
@Service
public class PropertyService {

    /**
     * The caas master host url.
     */
    @Value("${caas.cluster.command}")
    private String caasClusterCommand;
	
    @Value("${dashboard.url}")
    private String dashboardUrl;
    
    @Value("${caas.url}")
    private String caasUrl;
       
    @Value("${caas.common.url}")
    private String commonUrl;

    public String getCaasClusterCommand() {
		return caasClusterCommand;
	}

	public void setCaasClusterCommand(String caasClusterCommand) {
		this.caasClusterCommand = caasClusterCommand;
	}

	public String getCaasUrl() {
        return caasUrl;
    }

    public void setCaasUrl(String caasUrl) {
        this.caasUrl = caasUrl;
    }

    public String getDashboardUrl(String serviceInstanceId) {
        return dashboardUrl + serviceInstanceId;
    }

    public void setDashboardUrl(String dashboardUrl) {
        this.dashboardUrl = dashboardUrl;
    }

	public String getCommonUrl() {
		return commonUrl;
	}

	public void setCommonUrl(String commonUrl) {
		this.commonUrl = commonUrl;
	}

}
