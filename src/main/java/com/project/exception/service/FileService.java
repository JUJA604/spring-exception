package com.project.exception.service;

import com.project.exception.exception.exception.FileReadException;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Service
public class FileService {
    private static final String FILE_PATH = "src/main/resources/static/text/text.txt";
    private static final String FILE_PATH_EXCEPTION = "src/main/resources/static/text/texts.txt";

    public List<String> readLines() {
        try {
            return Files.readAllLines(Path.of(FILE_PATH));
        } catch (IOException e) {
            throw new FileReadException(e);
        }
    }

    public List<String> readLines_exception() {
        try {
            return Files.readAllLines(Path.of(FILE_PATH_EXCEPTION));
        } catch (IOException e) {
            throw new FileReadException(e);
        }
    }
}
