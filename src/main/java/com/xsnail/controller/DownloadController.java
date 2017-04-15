package com.xsnail.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.IOException;

/**
 * Created by Admin on 2017/4/15.
 */
@Controller
@RequestMapping("/apk")
public class DownloadController {

    @RequestMapping("/download")
    public ResponseEntity<byte[]> download() throws IOException {

        String path="D:\\myprojects\\git\\LeisureReader\\LeisureReader\\app\\app-release.apk";
        File file=new File(path);
        HttpHeaders headers = new HttpHeaders();
        String fileName=new String("LeisureReader.apk".getBytes("UTF-8"),"UTF-8");//为了解决中文名称乱码问题
        headers.setContentDispositionFormData("attachment", fileName);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),
                headers, HttpStatus.CREATED);

    }

}
