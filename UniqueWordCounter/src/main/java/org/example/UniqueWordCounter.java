package org.example;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class UniqueWordCounter {

        public static void main(String[] args) throws IOException {
            // Read text from file
            File inputFile = new File("./input.txt");

            String inputText = null;
            try {
                inputText = FileUtils.fileRead(String.valueOf(inputFile));
            } catch (Exception e) {
                e.printStackTrace();
            }

            // Count unique words
            List<String> wordsList = List.of(StringUtils.split(inputText));
            Set<String> uniqueWordsSet = new HashSet<>(wordsList);
            int uniqueWordCount = uniqueWordsSet.size();

            // Write result to file
            File outputFile = new File("output.txt");
            try {
                FileUtils.fileWrite("output.txt", "Number of unique words: " + uniqueWordCount);
            } catch (Exception e){
                e.printStackTrace();
            }
        }}


