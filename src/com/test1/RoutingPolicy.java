package com.test1;

public class RoutingPolicy {
	private Integer routeId;
	private String manualRouting;
	private boolean automatedRoute;
	private Integer routeTableId;
	private String routeTableName;
	private String simplePolicy;
	private String weightedPolicy;
	private String latencyPolicy;
	private String failOver;
	private Integer geoLocation;
	private String geoProximity;
	private String ipBased;
	private String multiValue;

	public RoutingPolicy() {

	}

	public RoutingPolicy(Integer routeId, String manualRouting, boolean automatedRoute, Integer routeTableId,
			String routeTableName, String simplePolicy, String weightedPolicy, String latencyPolicy, String failOver,
			Integer geoLocation, String geoProximity, String ipBased, String multiValue) {
		super();
		this.routeId = routeId;
		this.manualRouting = manualRouting;
		this.automatedRoute = automatedRoute;
		this.routeTableId = routeTableId;
		this.routeTableName = routeTableName;
		this.simplePolicy = simplePolicy;
		this.weightedPolicy = weightedPolicy;
		this.latencyPolicy = latencyPolicy;
		this.failOver = failOver;
		this.geoLocation = geoLocation;
		this.geoProximity = geoProximity;
		this.ipBased = ipBased;
		this.multiValue = multiValue;
	}

	public Integer getRouteId() {
		return routeId;
	}

	public void setRouteId(Integer routeId) {
		this.routeId = routeId;
	}

	public String getManualRouting() {
		return manualRouting;
	}

	public void setManualRouting(String manualRouting) {
		this.manualRouting = manualRouting;
	}

	public boolean isAutomatedRoute() {
		return automatedRoute;
	}

	public void setAutomatedRoute(boolean automatedRoute) {
		this.automatedRoute = automatedRoute;
	}

	public Integer getRouteTableId() {
		return routeTableId;
	}

	public void setRouteTableId(Integer routeTableId) {
		this.routeTableId = routeTableId;
	}

	public String getRouteTableName() {
		return routeTableName;
	}

	public void setRouteTableName(String routeTableName) {
		this.routeTableName = routeTableName;
	}

	public String getSimplePolicy() {
		return simplePolicy;
	}

	public void setSimplePolicy(String simplePolicy) {
		this.simplePolicy = simplePolicy;
	}

	public String getWeightedPolicy() {
		return weightedPolicy;
	}

	public void setWeightedPolicy(String weightedPolicy) {
		this.weightedPolicy = weightedPolicy;
	}

	public String getLatencyPolicy() {
		return latencyPolicy;
	}

	public void setLatencyPolicy(String latencyPolicy) {
		this.latencyPolicy = latencyPolicy;
	}

	public String getFailOver() {
		return failOver;
	}

	public void setFailOver(String failOver) {
		this.failOver = failOver;
	}

	public Integer getGeoLocation() {
		return geoLocation;
	}

	public void setGeoLocation(Integer geoLocation) {
		this.geoLocation = geoLocation;
	}

	public String getGeoProximity() {
		return geoProximity;
	}

	public void setGeoProximity(String geoProximity) {
		this.geoProximity = geoProximity;
	}

	public String getIpBased() {
		return ipBased;
	}

	public void setIpBased(String ipBased) {
		this.ipBased = ipBased;
	}

	public String getMultiValue() {
		return multiValue;
	}

	public void setMultiValue(String multiValue) {
		this.multiValue = multiValue;
	}

}
