package org.learn.adapter;

import java.io.File;

public class FileMonitor extends FileAlterationListenerAdaptor{
    @Override
    public void onFileCreate(File file) {
        System.out.println("file created!");
    }

    @Override
    public void onFileDelete(File file) {
        System.out.println("file deleted!");
    }
}
