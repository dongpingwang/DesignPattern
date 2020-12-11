package com.example.designpattern.composite;

/**
 * Author: Dongping Wang
 * Date: 2020/12/11
 * Description: 情景类
 */
public class Client {
    public static void main(String[] args) {

        // D盘 -> 歌曲文件夹 -> 歌曲文件
        Folder disk = new Folder("D盘");
        Folder folder = new Folder("歌曲");
        disk.addFile(folder);
        File file1 = new File("窦唯-雨吁.mp3");
        File file2 = new File("窦唯-序·玉楼春·雨·临江仙");
        folder.addFile(file1);
        folder.addFile(file2);

        System.out.println(disk.getFileName());
        Folder folder1 = (Folder) disk.getFiles().get(0);
        System.out.println(folder1.getFileName());
        System.out.println(folder1.getFiles().get(0).getFileName());
        System.out.println(folder1.getFiles().get(1).getFileName());
    }
}
