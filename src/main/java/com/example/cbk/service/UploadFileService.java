package com.example.cbk.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface UploadFileService {
    String upload(MultipartFile file, String type) throws IOException;
}
