package com.techprimers.kubernetes.springcloudkubernetesconfigexample;

public class TutorialBaseResponse {

	private int responseCode;
	private String responseDesc;
	private Object data;

	public TutorialBaseResponse() {

	}

	public TutorialBaseResponse(int responseCode, String responseDesc, Object data) {
		this.responseCode = responseCode;
		this.responseDesc = responseDesc;
		this.data = data;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseDesc() {
		return responseDesc;
	}

	public void setResponseDesc(String responseDesc) {
		this.responseDesc = responseDesc;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "OnBoardingBaseResponse [responseCode=" + responseCode + ", responseDesc=" + responseDesc + ", data="
				+ data + "]";
	}

}
