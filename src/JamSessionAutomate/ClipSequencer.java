package JamSessionAutomate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jcontreras
 */

import java.awt.Image;
import java.util.*;
import java.io.*;
import javax.sound.sampled.*;
import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ClipSequencer extends TimerTask {
    public static Boolean started = false;
    
    private static ArrayList<Boolean> sequenceArray; 
    private static ArrayList<InstrumentTrack> tracks;
    private static ArrayList<JLabel> labels;
    private static ArrayList<ImageIcon> icons;
   
    private static int count = 0;
    private static int counter = 0;
    private int wait;
    
    public  ClipSequencer(ArrayList<JLabel> labels, ArrayList<ImageIcon> icons, ArrayList<InstrumentTrack> tracks, Integer wait){
        this.tracks = tracks;
        this.wait = wait;
        this.icons = icons;
        this.labels = labels;
        
    }
    
    public void run(){
        
        System.out.println(counter);
        counter++;
        
        
        for (int i = 0; i < labels.size(); i++) {
            labels.get(i).setIcon(null);
        }
        
        for(int i =0;i<sequenceArray.size();i++){
            if(sequenceArray.get(i)){
                
                //System.out.println(tracks.get(i).getPath());
                tracks.get(i).stop();
                tracks.get(i).play();
                
                icons.get(i).setImage(icons.get(i).getImage().getScaledInstance(labels.get(i).getWidth() ,labels.get(i).getHeight(), Image.SCALE_DEFAULT));
                labels.get(i).setIcon(icons.get(i));
                System.out.println(icons.get(i).getDescription()+", "+ labels.get(i).getName());
                        
            }
        }
        try{
            Thread.sleep(wait);
        }
        catch(Exception e){
            System.out.println(e);
        }
            stopAllClips();
    }
    
    public static void stopAllClips(){
        for(int i =0;i<sequenceArray.size();i++){
            if(sequenceArray.get(i)){
                tracks.get(i).stop();
            }
        }
    }
    
    public static void updateSequence(ArrayList<Boolean> chkbxs){
        sequenceArray = chkbxs;
    }
    
    public static void evaluateDrumPath(InstrumentTrack it){
        if(count == 0){
            it.updatePath(Backend.getDrumVariationPath(it.getType(),"start"));
            incrementCount();
        }
        else if(count ==1){
            it.updatePath(Backend.getDrumVariationPath(it.getType(),"loop"));
            
        }
        else{
            incrementCount();
        }
        
    }
    public static void incrementCount(){
        count++;
    }
}
