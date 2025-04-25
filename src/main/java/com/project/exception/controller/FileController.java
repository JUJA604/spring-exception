package com.project.exception.controller;

import com.project.exception.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/file")
public class FileController {
    private final FileService fileService;

    @GetMapping
    public ResponseEntity<List<String>> getFileContents() {
        List<String> textLines = fileService.readLines();
        return ResponseEntity.ok(textLines);
    }

    @GetMapping("/exception")
    public ResponseEntity<List<String>> getFileException() {
        List<String> textLines = fileService.readLines_exception();
        return ResponseEntity.ok(textLines);
    }
}
