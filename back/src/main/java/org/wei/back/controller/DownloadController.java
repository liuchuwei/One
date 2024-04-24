package org.wei.back.controller;

import io.swagger.annotations.Api;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.FileInputStream;

/**
 * @Author Liuchuwei
 * @Date 2024-04-24 12:24
 * @Description:
 */

@Api(tags = "Download", description = "文件下载")
@Controller
public class DownloadController {

    @RequestMapping("/download")
    public ResponseEntity<byte[]> download(HttpServletRequest request) throws Exception
    {
        // 以下载G：/test1.txt 文件为例
        FileInputStream is = new FileInputStream("C:\\Users\\liuch\\Desktop\\download\\author.jpg");
        byte[] bytes=new byte[is.available()];
        // 一次读取bytes.length个字节 并将读到的字节放入bytes数组中
        is.read(bytes);
        is.close();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Disposition","attachment;filename="+"author.jpg");
        // 将要下载的文件的字节流返回给浏览器
        ResponseEntity res = new ResponseEntity<byte[]>(bytes,httpHeaders,
                HttpStatus.OK);
        return res;
    }
}
