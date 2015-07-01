package report;

import java.util.Date;

public class IncidentReport {
	
	String reportType;
	String reportDescription;
	Date reportTime = new Date();
	String trafficDensity;
	boolean voiceNotification;
	public String getReportType() {
		return reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}
	public String getReportDescription() {
		return reportDescription;
	}
	public void setReportDescription(String reportDescription) {
		this.reportDescription = reportDescription;
	}
	public Date getReportTime() {
		return reportTime;
	}
	public void setReportTime(Date reportTime) {
		this.reportTime = reportTime;
	}
	public String getTrafficDensity() {
		return trafficDensity;
	}
	public void setTrafficDensity(String trafficDensity) {
		this.trafficDensity = trafficDensity;
	}
	public boolean isVoiceNotification() {
		return voiceNotification;
	}
	public void setVoiceNotification(boolean voiceNotification) {
		this.voiceNotification = voiceNotification;
	}
	
}
