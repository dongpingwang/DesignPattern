package com.example.designpattern.builder.comm;

/**
 * Author: Dongping Wang
 * Date: 2020/10/24
 * Description:情景类
 */
public class Client {
    public static void main(String[] args) {
        String title = "Forever Young";
        String artist = "艾怡良";
        String albumName = "垂直活著,水平留戀著";
        String year = "2018-12-21T08:00:00Z";
        long duration = 300013000;// ms
        String type ="Mandopop ";
        Song song = new Song.Builder()
                .setTitle(title)
                .setArtist(artist)
                .setAlbumName(albumName)
                .setYear(year)
                .setDuration(duration)
                .setType(type)
                .build();
        System.out.println(song.toString());
    }
}
