package com.example.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Dongping Wang
 * Date: 2020/12/11
 * Description:树枝组件
 */
public class Folder extends IFile {

    private List<IFile> files;

    public Folder(String fileName) {
        super(fileName);
        files = new ArrayList<>();
    }

    public void addFile(IFile file) {
        files.add(file);
    }

    public void removeFile(IFile file) {
        files.remove(file);
    }

    public List<IFile> getFiles() {
        return files;
    }
}
