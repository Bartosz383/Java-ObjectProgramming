package pl.kru.file.imagefile;

public class GIFImageFile extends AbstractImageFile {


    public GIFImageFile(String name, int size) {
        super(name, size);                          //Wywołuje z AbstractImageFile
    }

    public void showAnimation() {
        System.out.println("Showing funny GIF");
    }
}
