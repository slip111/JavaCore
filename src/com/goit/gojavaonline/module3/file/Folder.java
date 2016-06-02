package com.goit.gojavaonline.module3.file;

import java.util.List;

public class Folder {
    private List<ImageFile> imageFiles;
    private List<SoundFile> soundFiles;
    private List<TextFile> textFiles;

    public List<ImageFile> getImageFiles() {
        return imageFiles;
    }

    public void setImageFiles(List<ImageFile> imageFiles) {
        this.imageFiles = imageFiles;
    }

    public List<SoundFile> getSoundFiles() {
        return soundFiles;
    }

    public void setSoundFiles(List<SoundFile> soundFiles) {
        this.soundFiles = soundFiles;
    }

    public List<TextFile> getTextFiles() {
        return textFiles;
    }

    public void setTextFiles(List<TextFile> textFiles) {
        this.textFiles = textFiles;
    }
}
