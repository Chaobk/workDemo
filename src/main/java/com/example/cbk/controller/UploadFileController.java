package com.example.cbk.controller;



import com.example.cbk.service.UploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

@RestController
public class UploadFileController {



    @Autowired
    UploadFileService uploadFileService;

    @GetMapping("/test")
    public String test(@RequestParam(value = "type", required = false) String type) {
        System.out.println(type);
        return System.getProperty("os.name");
    }

    @PutMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file, @RequestParam(value = "type", required = false) String type) throws IOException {
        return uploadFileService.upload(file, type);
    }

}
