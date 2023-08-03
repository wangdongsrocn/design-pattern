package org.learn.adapter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;

public class FileMonitorTest {
    private File file = new File("c:\\ok.txt");
    @Test
    @DisplayName("test file create")
    public void onFileCreateTest(){
        FileMonitor fileMonitor = new FileMonitor();
        fileMonitor.onFileCreate(file);
    }
    @Test
    @DisplayName("test file delete")
    public void onFileDeleteTest(){
        FileMonitor fileMonitor = new FileMonitor();
        fileMonitor.onFileDelete(file);
    }
}
