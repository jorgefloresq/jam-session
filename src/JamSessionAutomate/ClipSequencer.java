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

import java.util.*;
import java.io.*;
import javax.sound.sampled.*;

public class ClipSequencer extends TimerTask {
    public static Boolean started = false;
    
    private static ArrayList<Boolean> sequenceArray; 
    private static ArrayList<InstrumentTrack> tracks;
    private static int count = 0;
    
    public  ClipSequencer(ArrayList<InstrumentTrack> tracks){
        this.tracks = tracks;
        
    }
    
    public void run(){
        
        System.out.println("test");
        System.out.println(sequenceArray);
        for(int i =0;i<sequenceArray.size();i++){
            if(sequenceArray.get(i)){
                
                System.out.println(tracks.get(i).getPath());
                tracks.get(i).stop();
                tracks.get(i).play();
                
              //  if(tracks.get(i).getInstrument().equals("drums")){
               //     evaluateDrumPath(tracks.get(i));
                //}
            }
        }
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
