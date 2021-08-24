package pl.kru.drive;

import pl.kru.file.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
