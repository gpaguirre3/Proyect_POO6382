/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kevin Chuquimarca ESPE-DCCO
 */
public final class FileManager {

    private String fileName;
    private boolean answer;
    private File file;
    private String dataSeekerLine;

    public FileManager(String fileName, String dataSeekerLine) {
        this.fileName = fileName;
        this.dataSeekerLine = dataSeekerLine;
    }

    public boolean createFile() {
        file = new File(fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Object.class.getName()).log(Level.SEVERE, null, ex);
                answer = false;
            }
        }
        return answer;
    }

    public void findRecord(String seeker) {
        createFile();
        boolean flat = false;
        String line;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferReader = new BufferedReader(fileReader);
            while ((line = bufferReader.readLine()) != null) {
                String searchWord[] = line.split(",");
                if (searchWord[0].equals(seeker)) {
                    flat = true;
                    setDataSeekerLine(line);
                }
            }
            if (flat == false) {
                System.out.println("Non-existent movie or unregistered movies on "
                        + "billboard");
            }
        } catch (IOException ex) {
            Logger.getLogger(Object.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }

    public String getDataSeekerLine() {
        return dataSeekerLine;
    }

    public void setDataSeekerLine(String dataSeekerLine) {
        this.dataSeekerLine = dataSeekerLine;
    }

    
    
}
