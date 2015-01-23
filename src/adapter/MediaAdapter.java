package adapter;

public class MediaAdapter implements MediaPlayer{

	public MediaAdapter(String audioType){
		if(audioType.equalsIgnoreCase("vlc")){
			advancedMusicPlayer = new VlcPlayer();
		}
		else if(audioType.equalsIgnoreCase("mp4")){
			advancedMusicPlayer = new Mp4Player();
		}
	}
	AdvancedMediaPlayer advancedMusicPlayer;
	
	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if(audioType.equalsIgnoreCase("vlc")){
			advancedMusicPlayer.playVlc(fileName);
		}
		else if(audioType.equalsIgnoreCase("mp4")){
			advancedMusicPlayer.playMp4(fileName);
		}
	}

}
