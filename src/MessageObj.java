public class MessageObj {

    int uid;
    int puid;

    public MessageObj(int puid, int uid){
        this.puid =puid;
        this.uid=uid;
    }
public int getParent(){return puid;}
    public int getId(){return uid;}
}
