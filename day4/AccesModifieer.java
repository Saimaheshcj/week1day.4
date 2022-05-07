package week1.day4;

public class AccesModifieer {

	public void audiocall() {
		System.out.println("audiocall");
	}
	private void videocall() {
		System.out.println("videocall");
	}
	protected void sendmessage() {
		System.out.println("sendmessage");
	}
	void sendDoc() {
		System.out.println("sendDoc");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccesModifieer ac=new AccesModifieer();
		ac.audiocall();
		ac.videocall();
		ac.sendmessage();
		ac.sendDoc();
	}

}
