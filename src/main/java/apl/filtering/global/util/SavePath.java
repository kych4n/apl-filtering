package apl.filtering.global.util;

import lombok.Getter;

@Getter
public enum SavePath {
    ORIGINAL("C:/filtering/src/main/resources/data/original_data.csv"),
    FILTERED("C:/filtering/src/main/resources/data/filtered_data.csv"),
    FRAME("C:/filtering/src/main/java/apl/filtering/frame"),
    RULE("C:/filtering/src/main/resources/rules"),
    JSON("C:/filtering/src/main/resources/mappingInfo.json");

    private final String path;

    SavePath(String path) {
        this.path = path;
    }
}
