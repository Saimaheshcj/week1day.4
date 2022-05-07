package week1.day4;

public class Mobile {

	public void sendmessage() {
	System.out.println("sendmes");
}
	private void audiocall() {
		System.out.println("audiocall");
	}
	void sendDoc() {
		System.out.println("sendDoc");
	}
	protected void videocall() {
		System.out.println("videocall");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobile mob=new Mobile();
mob.sendmessage();
mob.audiocall();
mob.videocall();
mob.sendDoc();
	}

}
