package com.diviso.domain;

public class SampleDataSourceConfig {
	
	private String driverClassName;
	private String url;
	private String username;
	private String password;
	private boolean isOpen;
	private int timeout;
	public String getDriverClassName() {
		return driverClassName;
	}
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setIsOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public int getTimeout() {
		return timeout;
	}
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

}
