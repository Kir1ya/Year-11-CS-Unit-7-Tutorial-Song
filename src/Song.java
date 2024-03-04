import java.util.ArrayList;

public class Song {

    private String title;
    private String artist;
    private ArrayList<String> listeners = new ArrayList<>();

    public Song (String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public Song() {
        this.title = "";
        this.artist = "";
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int howMany(ArrayList<String> newListeners) {
        int countListeners = 0;
        for (int i = 0; i < newListeners.size();i++) {
            if (!listeners.contains(newListeners.get(i).toLowerCase())) {
                countListeners ++;
                listeners.add(newListeners.get(i).toLowerCase());
            }
        }
        return countListeners;
    }
}
