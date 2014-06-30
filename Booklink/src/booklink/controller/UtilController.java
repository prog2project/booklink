/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package booklink.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Christian Zwirlein <christian.zwirlein@stud.fh-rosenheim.de>
 */
public class UtilController {
    
    private static final UtilController utilcontroller = new UtilController();
    
    private UtilController() {
	}

	public static UtilController getInstance() {
		return utilcontroller;
	}
    
    /**
     * 
     * @return String mit Uhrzeit 
     */
    public String getTime() {
        Calendar cal = Calendar.getInstance();
    	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    	return sdf.format(cal.getTime());
    }
    
}
