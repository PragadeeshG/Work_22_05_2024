package com.test1;

public class RouteNetwork {
	private Integer networkId;
	private Integer networkName;
	private String publicNetwork;
	private String defaultVPC;
	private String privateNetwork;
	private String subnetsCount;
	private String publicSubnet;
	private String privateSubnet;
	private String internetGateway;
	private String natGateway;
	private String vpcPeering;
	private String endPoint;
	private String vpcFlowLog;
	private String directConnect;

	public RouteNetwork() {

	}

	public RouteNetwork(Integer networkId, Integer networkName, String publicNetwork, String defaultVPC,
			String privateNetwork, String subnetsCount, String publicSubnet, String privateSubnet,
			String internetGateway, String natGateway, String vpcPeering, String endPoint, String vpcFlowLog,
			String directConnect) {
		super();
		this.networkId = networkId;
		this.networkName = networkName;
		this.publicNetwork = publicNetwork;
		this.defaultVPC = defaultVPC;
		this.privateNetwork = privateNetwork;
		this.subnetsCount = subnetsCount;
		this.publicSubnet = publicSubnet;
		this.privateSubnet = privateSubnet;
		this.internetGateway = internetGateway;
		this.natGateway = natGateway;
		this.vpcPeering = vpcPeering;
		this.endPoint = endPoint;
		this.vpcFlowLog = vpcFlowLog;
		this.directConnect = directConnect;
	}

	public Integer getNetworkId() {
		return networkId;
	}

	public void setNetworkId(Integer networkId) {
		this.networkId = networkId;
	}

	public Integer getNetworkName() {
		return networkName;
	}

	public void setNetworkName(Integer networkName) {
		this.networkName = networkName;
	}

	public String getPublicNetwork() {
		return publicNetwork;
	}

	public void setPublicNetwork(String publicNetwork) {
		this.publicNetwork = publicNetwork;
	}

	public String getDefaultVPC() {
		return defaultVPC;
	}

	public void setDefaultVPC(String defaultVPC) {
		this.defaultVPC = defaultVPC;
	}

	public String getPrivateNetwork() {
		return privateNetwork;
	}

	public void setPrivateNetwork(String privateNetwork) {
		this.privateNetwork = privateNetwork;
	}

	public String getSubnetsCount() {
		return subnetsCount;
	}

	public void setSubnetsCount(String subnetsCount) {
		this.subnetsCount = subnetsCount;
	}

	public String getPublicSubnet() {
		return publicSubnet;
	}

	public void setPublicSubnet(String publicSubnet) {
		this.publicSubnet = publicSubnet;
	}

	public String getPrivateSubnet() {
		return privateSubnet;
	}

	public void setPrivateSubnet(String privateSubnet) {
		this.privateSubnet = privateSubnet;
	}

	public String getInternetGateway() {
		return internetGateway;
	}

	public void setInternetGateway(String internetGateway) {
		this.internetGateway = internetGateway;
	}

	public String getNatGateway() {
		return natGateway;
	}

	public void setNatGateway(String natGateway) {
		this.natGateway = natGateway;
	}

	public String getVpcPeering() {
		return vpcPeering;
	}

	public void setVpcPeering(String vpcPeering) {
		this.vpcPeering = vpcPeering;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	public String getVpcFlowLog() {
		return vpcFlowLog;
	}

	public void setVpcFlowLog(String vpcFlowLog) {
		this.vpcFlowLog = vpcFlowLog;
	}

	public String getDirectConnect() {
		return directConnect;
	}

	public void setDirectConnect(String directConnect) {
		this.directConnect = directConnect;
	}

}
