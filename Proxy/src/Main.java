public class Main {
    public static void main(String[] args) {
        MediaFile mediaFile = new ProxyMediaFile("movie.mp4");

        mediaFile.printName();
        mediaFile.printName();
    }
}