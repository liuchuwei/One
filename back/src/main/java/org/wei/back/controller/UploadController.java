package org.wei.back.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @Author Liuchuwei
 * @Date 2024-04-24 9:02
 * @Description: file upload
 */
@Api(tags = "Upload", description = "文件上传")
@Controller
public class UploadController {

    @ApiOperation("文件上传")
    @PostMapping("/upload")
    public void upload(@RequestParam("file") MultipartFile file){
        // 表单项的名字
        System.out.println("form 定义的name值 = " + file.getName());
        // 文件名
        System.out.println("原始文件名 = " + file.getOriginalFilename());
        try {
            // 保存文件到服务器 以保存到本机D盘根目录为例
            file.transferTo(new File("C:\\Users\\liuch\\Desktop\\download\\"+file.getOriginalFilename()));
            System.out.println("上传成功");
        } catch (Exception e) {
            System.out.println("上传失败");
        }
    }
}
