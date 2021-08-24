package pl.kru;

import pl.kru.USBdevice.Mouse;
import pl.kru.USBdevice.USBDevice;
import pl.kru.drive.Drive;
import pl.kru.drive.HDDDrive;
import pl.kru.drive.SSDDrive;
import pl.kru.file.File;
import pl.kru.file.imagefile.GIFImageFile;
import pl.kru.file.imagefile.JPGImageFile;
import pl.kru.file.musicfile.MP3MusicFile;

public class Main {

    public static void main(String[] args) {
        GIFImageFile gif1 = new GIFImageFile("nazwa1.gid", 100);
        JPGImageFile jpg1 = new JPGImageFile("nazwa1.jpg", 200, 80);

        MP3MusicFile mp3file = new MP3MusicFile("plik.mp3", 4000, "Jacek Kaczmarski", "Arka", 100);

        Drive drive = new HDDDrive();
        drive.addFile(gif1);
        drive.addFile(jpg1);
        drive.addFile(mp3file);

        drive.listFiles();
        File file = drive.findFile("plik.mp3");
        System.out.println(file.getSize());


    }
}
