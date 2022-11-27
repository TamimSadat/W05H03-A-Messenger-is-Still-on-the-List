package pgdp.messenger;

public class PinguTalk {
	// TODO: Implementiere die fehlenden Attribute
    private long topicID;
    private long userID;
    private UserArray members;
    private Topic[] topics;

    // TODO: Implementiere den fehlenden Konstruktor
    public PinguTalk(int UserArrayLange, int topicsLange) {

        if (UserArrayLange > 0 && topicsLange > 0) {
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
    public Topic deleteTopic() {
        return null;
    }

}
