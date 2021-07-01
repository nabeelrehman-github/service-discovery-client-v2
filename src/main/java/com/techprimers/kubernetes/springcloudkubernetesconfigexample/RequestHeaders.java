package com.techprimers.kubernetes.springcloudkubernetesconfigexample;

public class RequestHeaders {

	private String type;
	private String fcmid;
	// @NotEmpty(message = "{error.message.msisdn.required}")
	private String msisdn;
	private String network;
	private String channel;
	private String buildid;
	private int language;
	private int usecaseid;
	private Boolean isguest;
	private String deviceid;
	private String segmentid;
	private String customerid;
	private String appversion;
	private String packageinfo;
	private String parentmsisdn;
	private String csvsegmentid;
	private String parentpackageinfo;
	private String parenttype;
	private String parentnetwork;

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getBuildid() {
		return buildid;
	}

	public void setBuildid(String buildid) {
		this.buildid = buildid;
	}

	public String getFcmid() {
		return fcmid;
	}

	public void setFcmid(String fcmid) {
		this.fcmid = fcmid;
	}

	public Integer getLanguage() {
		return language;
	}

	public void setLanguage(Integer language) {
		this.language = language;
	}

	public Integer getUsecaseid() {
		return usecaseid;
	}

	public void setUsecaseid(Integer usecaseid) {
		this.usecaseid = usecaseid;
	}

	public Boolean getIsguest() {
		return isguest;
	}

	public void setIsguest(Boolean isguest) {
		this.isguest = isguest;
	}

	public String getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}

	public String getSegmentid() {
		return segmentid;
	}

	public void setSegmentid(String segmentid) {
		this.segmentid = segmentid;
	}

	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getAppversion() {
		return appversion;
	}

	public void setAppversion(String appversion) {
		this.appversion = appversion;
	}

	public String getPackageinfo() {
		return packageinfo;
	}

	public void setPackageinfo(String packageinfo) {
		this.packageinfo = packageinfo;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getParentmsisdn() {
		return parentmsisdn;
	}

	public void setParentmsisdn(String parentmsisdn) {
		this.parentmsisdn = parentmsisdn;
	}

	public String getCsvsegmentid() {
		return csvsegmentid;
	}

	public void setCsvsegmentid(String csvsegmentid) {
		this.csvsegmentid = csvsegmentid;
	}

	public String getParentpackageinfo() {
		return parentpackageinfo;
	}

	public void setParentpackageinfo(String parentpackageinfo) {
		this.parentpackageinfo = parentpackageinfo;
	}

	public String getParentnetwork() {
		return parentnetwork;
	}

	public void setParentnetwork(String parentnetwork) {
		this.parentnetwork = parentnetwork;
	}

	public String getParenttype() {
		return parenttype;
	}

	public void setParenttype(String parenttype) {
		this.parenttype = parenttype;
	}

	@Override
	public String toString() {
		return "RequestHeaders [msisdn=" + msisdn + ", parentmsisdn=" + parentmsisdn + ", channel=" + channel
				+ ", language=" + language + ", deviceid=" + deviceid + ", customerid=" + customerid + " , "
				+ "packageinfo=" + packageinfo + ", parentpackageinfo=" + parentpackageinfo + ", network=" + network
				+ ",type=" + type + ", appversion=" + appversion + ", fcmid=" + fcmid + "" + ", segmentid=" + segmentid
				+ ", csvsegmentid=" + csvsegmentid + ", usecaseid=" + usecaseid + ", isguest=" + isguest + "]";
	}

}
