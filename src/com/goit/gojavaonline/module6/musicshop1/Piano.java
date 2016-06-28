package com.goit.gojavaonline.module6.musicshop1;

public class Piano extends Instruments {
    String pianoType; // Тип клавишного инструмента- пианино, рояль, синтезатор
    String pianoGroup; // Группа клавишных инструменотов - живые/электронные

    public String getPianoType() {
        return pianoType;
    }

    public void setPianoType(String pianoType) {
        this.pianoType = pianoType;
    }

    public String getPianoGroup() {
        return pianoGroup;
    }

    public void setPianoGroup(String pianoGroup) {
        this.pianoGroup = pianoGroup;
    }
}
