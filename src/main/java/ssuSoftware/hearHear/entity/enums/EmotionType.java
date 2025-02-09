package ssuSoftware.hearHear.entity.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Locale;

public enum EmotionType {
    SMILE,
    SOSO,
    SAD,
    FUNNY,
    HEART,
    ANGRY;

    @JsonCreator
    public static EmotionType from(String s){
        return EmotionType.valueOf(s.toUpperCase(Locale.ROOT));
    }
}
