/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;


/**
 *
 * @author raiderbot-2
 */
public class Excel {

    {
        try {
            FileWriter writer = new FileWriter("Scouting_Stats", true);
            writer.write(scoutStat);
        } catch (IOException ex) {
            
        }
    }
     
}
