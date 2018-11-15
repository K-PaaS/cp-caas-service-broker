package org.openpaas.servicebroker.caas.service;

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
    
	@Value("${caas.cluster.exit-code}")
    private String caasClusterExitCode;
	
    @Value("${dashboard.url}")
    private String dashboardUrl;
    
    @Value("${caas.url}")
    private String caasUrl;
       
    @Value("${caas.common.url}")
    private String commonUrl;
    
    @Value("${caas.role-set-code}")
    private String roleSetCode;

    public String getCaasClusterCommand() {
		return caasClusterCommand;
	}

	public void setCaasClusterCommand(String caasClusterCommand) {
		this.caasClusterCommand = caasClusterCommand;
	}

    public String getCaasClusterExitCode() {
		return caasClusterExitCode;
	}

	public void setCaasClusterExitCode(String caasClusterExitCode) {
		this.caasClusterExitCode = caasClusterExitCode;
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

	public String getRoleSetCode() {
		return roleSetCode;
	}

	public void setRoleSetCode(String roleSetCode) {
		this.roleSetCode = roleSetCode;
	}

}
