package io.codelex;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SongTest {
    public static void main(String[] args) {
        Song firstSong = new Song("King", 231, "Futakuchi Mana");
        Song secondSong = new Song("Red Sun", 347, "Little V");
        Song thirdSong = new Song("Breezeblocks", 347, "alt-J");
        List<Song> songList = new ArrayList<>();
        songList.add(firstSong);
        songList.add(secondSong);
        songList.add(thirdSong);

        List<String> songTitles = songList.stream()
                .map(Song::getTitle)
                .map(String::toUpperCase)
                .map((String title) -> "===" + title + "===")
                .toList();
        System.out.println(songTitles);
        songTitles.forEach(System.out::println);
        Map<Integer, List<Song>> songByDuration = songList.stream().collect(Collectors.groupingBy(Song::getDuration));
        System.out.println(songByDuration);
    }

}
