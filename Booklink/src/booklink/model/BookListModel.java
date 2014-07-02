/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package booklink.model;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Christian Zwirlein
 */
public class BookListModel extends DefaultTableModel implements ISelectStatement{
    
    private DefaultTableModel model;

    public DefaultTableModel getModel() {
        return model;
    }

    public void setModel(DefaultTableModel model) {
        this.model = model;
    }

    public String[] getColums() {
        return colums;
    }

    public void setColums(String[] colums) {
        this.colums = colums;
    }
    private String[] colums;
    
    
    @Override
    public String getSelectStatement() {
        return "SELECT * FROM books";
    }

    
}
