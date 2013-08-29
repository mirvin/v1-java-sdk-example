import com.versionone.om.*;

public class CreateDupeMember {

	/**
		 * @param args
		 	 */
			 	public static void main(String[] args) {
						String url = "https://www11.v1host.com/VersionOneMi";
								String login = "admin";
										String password = "admin";
												String projectName = "Root";
														// TODO Auto-generated method stub
																V1Instance apiInstance = new V1Instance(url, login, password); 
																		Project apiProject = apiInstance.get().projectByName(projectName);

																				String newKerberos = "admin2";

																						Member newMember = apiInstance.get().memberByUserName(newKerberos); 
																								System.out.println("getUsername: " + newMember.getUsername()); 
																										System.out.println("getShortName: " + newMember.getShortName()); 
																												System.out.println("getName: " + newMember.getName()); 
																														System.out.println("getEmail: " + newMember.getEmail()); 
																																System.out.println("getDefaultRole: " + newMember.getDefaultRole());

																																		 newMember.getAssignedProjects().add(apiProject); // option #1 
																																		 		//apiProject.getAssignedMembers().add(newMember); // option #2 // line #56

																																						System.out.println("Member added"); // Never reached
																																							}

