package JamSessionAutomate;


import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jcontreras
 */
public class InstrumentTrack {
    private File soundFile;
    private AudioInputStream audioIn;
    private Clip clip;
    private String type;
    private String variation;
    private String instrument;
    
    
    public InstrumentTrack(String instrument,String path, String type, String variation){
        updatePath(path);
        this.type = type;
        this.variation = variation;
        this.instrument = instrument;
    }
    
    public void updatePath(String path){
        soundFile = new File(path);
        
        try{
            audioIn = AudioSystem.getAudioInputStream(soundFile);
            clip = AudioSystem.getClip();
            clip.open(audioIn);     
        }
        catch(UnsupportedAudioFileException | IOException | LineUnavailableException e){
            System.out.println(e);
            System.out.println(path);
        }
    }
    
    public void play(){
        clip.start();
    }
    
    public void stop(){
        clip.stop();
        clip.flush();
        clip.setFramePosition(0);
    }
    
    public String getPath(){
        return this.soundFile.getPath();
    }
    public String getType(){
        return this.type;
    }
    public String getVariation(){
        return this.variation;
    }
    public String getInstrument(){
        return this.instrument;
    }
    public int getClipDuration(){
        return ((int)clip.getMicrosecondLength()/1000);
    }
}
