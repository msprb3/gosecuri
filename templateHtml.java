/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mspr.projetmspr;

import java.util.HashMap;

/**
 *
 * @author abdel
 */
public class templateHtml {
   
    
    public static String buildAgentHtml(agents agent, String contenu){
        String chaineHtml = "<!DOCTYPE html><html><head><meta charset=\"utf-8\" /><link rel=\"stylesheet\" href=\"..\\css\\style.css\"/><title>Agent "+agent.getPrenom()+"</title></head><body><br><br><br><br><br><br><h2> Agent : "+agent.getPrenom()+" "+agent.getNom()+" </h2><br><br><img class=\"photoId\" src=\""+agent.getpathPhotoID()+"\"  alt=\"Pièce d'identité de "+agent.getPrenom()+" "+agent.getNom()+"\" /><br><br><div class=tableau><table>"+contenu+"</table></div><a href=\"..\\..\\index.html\"><img class=\"logoSociete\" src=\"..\\..\\logo\\logo.png\", alt=\"Le logo de la société\"></a></div><div class=boutonRetour><a href=\"..\\..\\index.html\"> <img src= \"..\\..\\logo\\logoRetour.png\", alt=\"Logo retour\"> </a></div><footer><a href=\"..\\..\\index.html\">Accueil</a><br><br><a href=\"mailto:bastien.jarre@epsi.fr\"> Nous contacter </a><br><br><a href=\"..\\..\\mentionsLegales.html\"> Mentions légales </a></footer></body></html>";
        
        return chaineHtml;
    }
    
    public static String generateListEquipement(agents agent,HashMap<String,equipements> mapEquipements){
        String listeEquipementsUtiliser= "";
        int tailleBufferString = agent.getbufferEquipementUtiliser().length;
        
        for(int index = 1;index < tailleBufferString; index++){
            try{
                listeEquipementsUtiliser = ""+listeEquipementsUtiliser+"<tr><td>"+mapEquipements.get(agent.getbufferEquipementUtiliser()[index]).getDescription()+"</td></tr>\n";
            }catch(Exception e){
                listeEquipementsUtiliser = ""+listeEquipementsUtiliser+"<tr><td>Vide</td></tr>\n\" +";
            }
           
        }
        
        return listeEquipementsUtiliser;
    }
    
    
}
