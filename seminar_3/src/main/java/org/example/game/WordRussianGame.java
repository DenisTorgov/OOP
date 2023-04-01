package org.example.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordRussianGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<>(Arrays.asList(
                "а", "б", "в", "г", "д", "е", "ж", "з", "и", "к", "л", "м","н",
                "о","п", "р", "с", "т", "у", "ф", "х", "ц", "ч", "ш", "щ", "ъ",
                "ы", "ь", "э", "ю", "я", "z", "z", "z"));
        System.out.println(charList + " chatlist");
        return charList;
    }
}
