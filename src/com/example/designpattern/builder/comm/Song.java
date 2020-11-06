package com.example.designpattern.builder.comm;

/**
 * Author: Dongping Wang
 * Date: 2020/10/24
 * Description:  java bean形式的建造者模式
 */
public class Song {
    // 歌名
    private String title;
    // 歌手
    private String artist;
    // 专辑名称
    private String albumName;
    // 文件地址
    private String data;
    // 时长
    private long duration;
    // 码率
    private int bitRate;
    // 采样率
    private String sampleRate;
    // 位深
    private String bitLength;
    // 专辑封面地址
    private String albumPath;
    // 年份
    private String year;
    // 音乐类型
    private String type;

    public Song() {

    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getData() {
        return data;
    }

    public long getDuration() {
        return duration;
    }

    public int getBitRate() {
        return bitRate;
    }

    public String getSampleRate() {
        return sampleRate;
    }

    public String getBitLength() {
        return bitLength;
    }

    public String getAlbumPath() {
        return albumPath;
    }

    public String getYear() {
        return year;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Song{"
                + "title='" + title + '\''
                + ", artist='" + artist + '\''
                + ", albumName='" + albumName + '\''
                + ", data='" + data + '\''
                + ", duration=" + duration
                + ", bitRate=" + bitRate
                + ", sampleRate='" + sampleRate + '\''
                + ", bitLength='" + bitLength + '\''
                + ", albumPath='" + albumPath + '\''
                + ", year='" + year + '\''
                + ", type='" + type + '\''
                + '}';
    }

    public static class Builder {
        private Song song;
        public Builder() {
            this.song = new Song();
        }

        public Builder  setTitle(String title) {
            this.song.title = title;
            return this;
        }

        public Builder setArtist(String artist) {
            this.song.artist = artist;
            return this;
        }

        public Builder setAlbumName(String albumName) {
            this.song.albumName = albumName;
            return this;
        }

        public Builder setData(String data) {
            this.song.data = data;
            return this;
        }

        public Builder setDuration(long duration) {
            this.song.duration = duration;
            return this;
        }

        public Builder setBitRate(int bitRate) {
            this.song.bitRate = bitRate;
            return this;
        }

        public Builder setSampleRate(String sampleRate) {
            this.song.sampleRate = sampleRate;
            return this;
        }

        public Builder setBitLength(String bitLength) {
            this.song.bitLength = bitLength;
            return this;
        }

        public Builder setAlbumPath(String albumPath) {
            this.song.albumPath = albumPath;
            return this;
        }

        public Builder setYear(String year) {
            this.song.year = year;
            return this;
        }

        public Builder setType(String type) {
            this.song.type = type;
            return this;
        }

        public Song build() {
            return this.song;
        }

    }
}
