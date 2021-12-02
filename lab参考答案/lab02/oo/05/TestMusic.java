public class TestMusic {
	public static void main(String[] args) {
		Music music=new Music();
		music.setMusicname(args[0]);
		music.setMusictype(args[1]);
		System.out.print(music);
	}
}