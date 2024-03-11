package t11_interface3;

public class RemoteRun {  // 다중리모컨
	public static void main(String[] args) {
		Product product = new Product();
		product.remoteName("TV");
		product.switchOn("TV");
		product.setVolume(5);
		product.setVolume(15);
		product.setVolume(-5);
		product.switchOff("TV");
		System.out.println("================================");
		System.out.println();
		
		product.remoteName("오디오");
		product.switchOn("오디오");
		product.setVolume(8);
		product.setVolume(19);
		product.setVolume(-2);
		product.switchOff("오디오");
		System.out.println();
	}
}
