package il.haifa.ac.dh.tikkounsofrim.model;



public interface UserDBase {
	 public int registerUser(String uName, String password, String email,  UserInfo uInfo);
	 public boolean checkUser( String uName);
	 public boolean isUserValid(String user, String password);
	 
	 public int getCount(String user);
	 public int addTranscription(String user, long l, ManuscriptPlace place, String version,
			String automaticTranscription, String userTranscription, int status, long start, String ipAddress);
	 public int getTotalTimesLineSeen(ManuscriptPlace place);
	 public int getTotalTimesLineCorrected(ManuscriptPlace place);
	 

}
