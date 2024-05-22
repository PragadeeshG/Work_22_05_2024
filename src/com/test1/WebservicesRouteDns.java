package com.test1;

public class WebservicesRouteDns {
	private String routeName;
	private String roouteId;
	private String sourceIp;
	private String routeEntryType;
	private String healthCheckStatus;
	private String awsResourceId;
	private String awsResourceName;
	private String publicSubner;
	private String privateSubnet;
	private String status;

	public WebservicesRouteDns() {

	}

	public WebservicesRouteDns(String routeName, String roouteId, String sourceIp, String routeEntryType,
			String healthCheckStatus, String awsResourceId, String awsResourceName, String publicSubner,
			String privateSubnet, String status) {
		super();
		this.routeName = routeName;
		this.roouteId = roouteId;
		this.sourceIp = sourceIp;
		this.routeEntryType = routeEntryType;
		this.healthCheckStatus = healthCheckStatus;
		this.awsResourceId = awsResourceId;
		this.awsResourceName = awsResourceName;
		this.publicSubner = publicSubner;
		this.privateSubnet = privateSubnet;
		this.status = status;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public String getRoouteId() {
		return roouteId;
	}

	public void setRoouteId(String roouteId) {
		this.roouteId = roouteId;
	}

	public String getSourceIp() {
		return sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
	}

	public String getRouteEntryType() {
		return routeEntryType;
	}

	public void setRouteEntryType(String routeEntryType) {
		this.routeEntryType = routeEntryType;
	}

	public String getHealthCheckStatus() {
		return healthCheckStatus;
	}

	public void setHealthCheckStatus(String healthCheckStatus) {
		this.healthCheckStatus = healthCheckStatus;
	}

	public String getAwsResourceId() {
		return awsResourceId;
	}

	public void setAwsResourceId(String awsResourceId) {
		this.awsResourceId = awsResourceId;
	}

	public String getAwsResourceName() {
		return awsResourceName;
	}

	public void setAwsResourceName(String awsResourceName) {
		this.awsResourceName = awsResourceName;
	}

	public String getPublicSubner() {
		return publicSubner;
	}

	public void setPublicSubner(String publicSubner) {
		this.publicSubner = publicSubner;
	}

	public String getPrivateSubnet() {
		return privateSubnet;
	}

	public void setPrivateSubnet(String privateSubnet) {
		this.privateSubnet = privateSubnet;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
