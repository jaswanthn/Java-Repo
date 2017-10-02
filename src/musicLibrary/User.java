package musicLibrary;

import java.util.Scanner;

public class User {

    public static void main(String[] args) {
       try {
           menu();
       }
        catch(NumberFormatException e) {
            System.out.println("Enter valid input");
            menu();
        }
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to windows media player");
        MediaPlayer.saveList();
        while (true) {
            System.out.println("Select 1. view all songs\n" +
                    "2. view all artists in library\n" +
                    "3. view all albums in the library\n" +
                    "4. Edit song in library\n" +
                    "5. search using artist\n" +
                    "6. search using album\n" +
                    "7. add songs\n" +
                    "8. add artist to songs\n" +
                    "9. remove artist\n" +
                    "10. add songs to album\n" +
                    "11. remove songs from album\n" +
                    "12. exit\n");
            int res = Integer.valueOf(sc.nextLine());

            switch (res) {
                case 1:
                    MediaPlayer.viewList();
                    break;
                case 2:
                    MediaPlayer.allArtists();
                    break;
                case 3:
                    MediaPlayer.allAlbums();
                    break;
                case 4:
                    MediaPlayer.editSong();
                    break;
                case 5:
                    System.out.println("Enter name of artist to search");

                    MediaPlayer.searchWithArtist(sc.nextLine());
                    break;
                case 6:
                    System.out.println("Enter name of album to search");
                    MediaPlayer.searchWithAlbum(sc.nextLine());
                    break;
                case 7:
                    System.out.println("Enter song name, artist and album");
                    MediaPlayer.addSong(sc.nextLine(), sc.nextLine(), sc.nextLine());
                    break;
                case 8:
                    System.out.println("Enter song name and artist");
                    MediaPlayer.addArtist(sc.nextLine(), sc.nextLine());
                    break;
                case 9:
                    System.out.println("Enter artist to remove from songs");
                    MediaPlayer.removeArtist(sc.nextLine());
                    break;
                case 10:
                    System.out.println("Enter song name followed by album");
                    MediaPlayer.addSongToAlbum(sc.nextLine(), sc.nextLine());
                    break;
                case 11:
                    System.out.println("Enter song name to remove album");
                    MediaPlayer.removeSongFromAlbum(sc.nextLine());
                    break;
                case 12:
                    System.out.println("Thanks for using Media player");
                    MediaPlayer.saveCurrent();
                    System.exit(0);
                default:
                    System.out.println("Please enter valid input");
                    break;

            }
        }
    }
}
