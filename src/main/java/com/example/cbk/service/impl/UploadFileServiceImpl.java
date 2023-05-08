package com.example.cbk.service.impl;

import com.example.cbk.service.UploadFileService;
import com.example.cbk.util.FileUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@Service
public class UploadFileServiceImpl implements UploadFileService {
    @Override
    public String upload(MultipartFile file, String type) throws IOException {
        String path = null;
        if (type != null) {
            path = "C:\\Users\\10049\\Desktop";
        } else {
            path =  "/home/cbk/dockerProFiles";
        }
        return FileUtil.uploadFile(file, path);
    }


}
