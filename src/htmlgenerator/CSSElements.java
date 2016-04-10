/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htmlgenerator;

/**
 *
 * @author nicholasdry
 */
public class CSSElements {
    
    private int backgroundHex;
    private String align;
    private String fileName;
    
    public CSSElements() {
        align = null;
    }
    
    public void setAlign(String place) {
        align = place;
    }
    
    public String getAlign() {
        return align;
    }
    
    public String getFileName() {
        return fileName;
    }
    
    public void setFileName(String file) {
        fileName = file;
    }
    
    public int getBackgroundColor() {
        return backgroundHex;
    }
    
    public void setBackgroundColor(int color) {
        backgroundHex = color;
    }
    
}
