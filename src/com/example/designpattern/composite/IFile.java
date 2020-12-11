package com.example.designpattern.composite;

/**
 * Author: Dongping Wang
 * Date: 2020/12/11
 * Description:组件接口
 */
public abstract class IFile {

    private String fileName;

    public IFile(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
