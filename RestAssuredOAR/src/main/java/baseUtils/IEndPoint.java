package baseUtils;
/**
 * 
 * @author Nitheesha
 *
 */
public interface IEndPoint {
	
	String addProject="/addProject";
	String getAllProject="/projects";
	String updateProject="/projects/{projectId}";
	String getSingleProject="/projects/{projectId}";
	String deleteProject="/projects/{projectId}";

}
