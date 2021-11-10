/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classic.to.pkgdo.app;

import java.sql.SQLException;



/**
 *
 * @author user
 */
public class NewTask {
    public String theDate;
    public String theTime;
    public String task;
    String getTheDate;
    
    public NewTask(String theDate, String theTime, String task){
        this.theDate = theDate;
        this.theTime = theTime;
        this.task = task;
    }
    
    public int addNewTask(NewTask nt) throws SQLException{
        int result = Database.addTask(nt);
        return result;
    }

    
}
