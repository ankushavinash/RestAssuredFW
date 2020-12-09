package baseUtils;

public class Project {
	String createdBy;
	String createdOn;
	String projectName;
	String projectId;
	String status;
	int teamSize;
	public Project() {

	}
	public Project(String createdBy, String createdOn, String projectName, String projectId, String status, int teamSize) {
		super();
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.projectName = projectName;
		this.status = status;
		this.teamSize = teamSize;
		this.projectId=projectId;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

}
