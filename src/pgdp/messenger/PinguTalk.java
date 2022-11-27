package pgdp.messenger;

public class PinguTalk {
	// TODO: Implementiere die fehlenden Attribute
    private static long topicID;
    private static long userID;
    private UserArray members;
    private Topic[] topics;

    // TODO: Implementiere den fehlenden Konstruktor
    public PinguTalk(int UserArrayLange, int topicsLange) {
        if (UserArrayLange < 1 && topicsLange < 1) {//Wenn beide unter 1
            UserArray members = new UserArray(1);
            Topic[] topics = new Topic[1];
        }
        else if (UserArrayLange < 1 && topicsLange > 0) {//Wenn nur members Startlänge unter 1
            UserArray members = new UserArray(1);
            Topic[] topics = new Topic[topicsLange];
        }
        else if (UserArrayLange > 0 && topicsLange < 1) {//Wenn nur topics Startlänge unter 1
            UserArray members = new UserArray(UserArrayLange);
            Topic[] topics = new Topic[1];
        }
        else {//Wenn beide über 1
            UserArray members = new UserArray(UserArrayLange);
            Topic[] topics = new Topic[topicsLange];
        }

    }

    // TODO: Implementiere die fehlenden Methoden
   public User addMember(String name, User supervisor) {
        User newUser = new User(userID, name, supervisor);
        members.addUser(newUser);
        userID++;
        return newUser;
   }
    public User deleteMember(long userID) {
        User delMember = members.deleteUser(userID);
        if (delMember == null) {
            return null;
        }
        else {
            return delMember;
        }
    }

    public Topic createNewTopic(String name) {

        return null;
    }

    public Topic deleteTopic(long userID) {

        return null;
    }


    public Topic createNewTopic() {
        return null;
    }
    public Topic deleteTopic() { return null; }

    public UserArray getMembers() { return members; }

    public Topic[] getTopics() { return topics; }

}
