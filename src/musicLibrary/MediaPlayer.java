package musicLibrary;

import java.io.*;
import java.util.*;

public class MediaPlayer {

    private static ArrayList<Song> library;
    static Scanner sc = new Scanner(System.in);


    public static void saveList() {
        try {
            // run once to save sample data to file
//            FileOutputStream fs = new FileOutputStream("songs.ser");
//            ObjectOutputStream oos = new ObjectOutputStream(fs);
//
//            Song s1 = new Song("Artist1", "Album1", "Song1");
//            Song s2 = new Song("Artist2", "Album2", "Song2");
//            Song s3 = new Song("Artist3", "Album3", "Song3");
//
//            ArrayList<Song> al = new ArrayList<Song>();
//            al.add(s1);
//            al.add(s2);
//            al.add(s3);
//
//
//            oos.writeObject(al);

            FileInputStream fi = new FileInputStream("songs.ser");
            ObjectInputStream ois = new ObjectInputStream(fi);

            library = (ArrayList<Song>) ois.readObject();
            //System.out.println(library.toString());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void saveCurrent() {
        try {
            FileOutputStream fs = new FileOutputStream("songs.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fs);
            oos.writeObject(library);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Song> getFullList() {

        return library;
    }

    public static void viewList() {

        ArrayList<Song> al = MediaPlayer.getFullList();
        System.out.println("Song\tArtist\tAlbum\t");
        for (Song s: al) {
            System.out.println(s.getName() + "\t" + s.getArtist() + "\t" + s.getAlbum());
        }
        System.out.println();
    }

    public static void allArtists() {
        LinkedHashSet uniqueArtists = new LinkedHashSet();
        for(Song s: library) {
            uniqueArtists.add(s.getArtist());
        }

        System.out.println(uniqueArtists);
    }

    public static void allAlbums() {
        LinkedHashSet uniqueAlbums = new LinkedHashSet();
        for(Song s: library) {
            uniqueAlbums.add(s.getAlbum());
        }

        System.out.println(uniqueAlbums);
    }

    public static void searchWithArtist(String artistName) {
        ArrayList<Song> al = new ArrayList<>();
        for (Song s: library) {
            if (s.getArtist().equalsIgnoreCase(artistName)) {
                al.add(s);
            }
        }
        if (al.isEmpty()) {
            System.out.println("No song available with artist you entered");
        } else {
            System.out.println(al);
        }
    }

    public static void searchWithAlbum(String albumName) {
        ArrayList<Song> al = new ArrayList<>();
        for (Song s: MediaPlayer.getFullList()) {
            if (s.getAlbum().equalsIgnoreCase(albumName)) {
                al.add(s);
            }
        }
        if (al.isEmpty()) {
            System.out.println("No song available in album you entered");
        } else {
            System.out.println(al); }
    }

    public static void addSong(String name, String artist, String album) {
        Song s = new Song(artist, album, name);
        library.add(s);
        System.out.println("Song has been added to library");
        MediaPlayer.viewList();
    }

    public static void removeSong(String name) {
        for (Song s: library) {
            if (s.getName().equalsIgnoreCase(name)) {
                library.remove(s);
                System.out.println("Songs is successfully removed from library");
            } else {
                System.out.println("invalid song name");
            }

        }
    }

    public static void addArtist(String name, String artist) {
        for (Song s: library) {
            if (s.getName().equalsIgnoreCase(name)) {
                s.setArtist(artist);
            }
        }
        MediaPlayer.viewList();
    }

    public static void removeArtist(String artist) {
        for (Song s: library) {
            if (s.getArtist().equalsIgnoreCase(artist)) {
                s.setArtist("");
            }
        }
        MediaPlayer.viewList();
    }

    public static void addSongToAlbum(String name, String album) {
        for (Song s: library) {
            if (s.getName().equalsIgnoreCase(name)) {
                s.setAlbum(album);
            }
        }
        MediaPlayer.viewList();
    }

    public static void removeSongFromAlbum(String name) {
        for (Song s: library) {
            if (s.getName().equalsIgnoreCase(name)) {
                s.setAlbum("");
            }
        }
        MediaPlayer.viewList();
    }

    public static void editSong() {
        System.out.println("Enter song name you want to edit");
        String name = sc.nextLine();

        for (Song s : library) {
                if (s.getName().equalsIgnoreCase(name)) {
                    System.out.println("Song is available, to edit press 1. name 2. artist 3. album");
                    switch (sc.nextInt()) {
                        case 1:
                            sc.nextLine();
                            System.out.println("enter name you want to set");
                            s.setName(sc.nextLine());
                            break;
                        case 2:
                            sc.nextLine();
                            System.out.println("enter artist you want to set");
                            s.setArtist(sc.nextLine());
                            break;
                        case 3:
                            sc.nextLine();
                            System.out.println("enter album you want to set");
                            s.setAlbum(sc.nextLine());
                            break;
                        default:
                            System.out.println("Invalid choice, please try again");
                            break;
                    }
                }
            }

            viewList();
    }

}
