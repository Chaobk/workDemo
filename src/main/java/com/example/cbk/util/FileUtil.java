package com.example.cbk.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class FileUtil {
    public static String uploadFile(MultipartFile multipartFile, String dir) {
        if (multipartFile.isEmpty()) {
            return "请选择文件";
        }

        String filename = multipartFile.getOriginalFilename();
        String basePath = dir + "/" + filename;
        File file = new File(basePath);

        if (file.exists()) {
            file.delete();
        }

        file.mkdirs();
        try {
            multipartFile.transferTo(file);
            return "文件上传至：" + basePath;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
