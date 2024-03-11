package t11_interface2;

public class RemoteRun2 {
	public static void main(String[] args) {
//		Remote audio = new Audio();
//		Remote tv = new Tv();
		
		Remote[] remotes = {new Audio(), new Tv()};
		String[] titles = {"Audio", "Tv"};

		for(int i=0; i<remotes.length; i++) {
			remotes[i].switchOn();
			remotes[i].remoteName(titles[i]);
			remotes[i].switchOff();
			System.out.println();
		}
		
		/*
		audio.switchOn();
		audio.remoteName("Audio");
		audio.switchOff();
		System.out.println();
		
		tv.switchOn();
		tv.remoteName("Tv");
		tv.switchOff();
		*/
	}
}
