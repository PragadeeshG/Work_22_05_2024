package com.test1;

public class DataStore {
	private Integer storeId;
	private String storeName;
	private String storeType;
	private String totalBuckets;
	private Integer bucketPolicy;
	private Integer staticWebsite;
	private Integer version;
	private String replication;
	private String frequentAccess;
	private String inFrequentAccess;
	private String glacier;
	private String status;

	public DataStore() {

	}

	public DataStore(Integer storeId, String storeName, String storeType, String totalBuckets, Integer bucketPolicy,
			Integer staticWebsite, Integer version, String replication, String frequentAccess, String inFrequentAccess,
			String glacier, String status) {
		super();
		this.storeId = storeId;
		this.storeName = storeName;
		this.storeType = storeType;
		this.totalBuckets = totalBuckets;
		this.bucketPolicy = bucketPolicy;
		this.staticWebsite = staticWebsite;
		this.version = version;
		this.replication = replication;
		this.frequentAccess = frequentAccess;
		this.inFrequentAccess = inFrequentAccess;
		this.glacier = glacier;
		this.status = status;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreType() {
		return storeType;
	}

	public void setStoreType(String storeType) {
		this.storeType = storeType;
	}

	public String getTotalBuckets() {
		return totalBuckets;
	}

	public void setTotalBuckets(String totalBuckets) {
		this.totalBuckets = totalBuckets;
	}

	public Integer getBucketPolicy() {
		return bucketPolicy;
	}

	public void setBucketPolicy(Integer bucketPolicy) {
		this.bucketPolicy = bucketPolicy;
	}

	public Integer getStaticWebsite() {
		return staticWebsite;
	}

	public void setStaticWebsite(Integer staticWebsite) {
		this.staticWebsite = staticWebsite;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getReplication() {
		return replication;
	}

	public void setReplication(String replication) {
		this.replication = replication;
	}

	public String getFrequentAccess() {
		return frequentAccess;
	}

	public void setFrequentAccess(String frequentAccess) {
		this.frequentAccess = frequentAccess;
	}

	public String getInFrequentAccess() {
		return inFrequentAccess;
	}

	public void setInFrequentAccess(String inFrequentAccess) {
		this.inFrequentAccess = inFrequentAccess;
	}

	public String getGlacier() {
		return glacier;
	}

	public void setGlacier(String glacier) {
		this.glacier = glacier;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
