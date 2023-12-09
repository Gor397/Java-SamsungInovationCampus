package com.example.explicitintentdemo;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileReaderDemo {
    void fileContent(Context context, String fileName) {
        AssetManager assetManager = context.getAssets();

        try {
            InputStream inputStream = assetManager.open(fileName);

            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuffer.append(line).append("\n");
            }

            inputStream.close();
            reader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
