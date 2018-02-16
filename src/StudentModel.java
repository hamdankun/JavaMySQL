
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hamdan
 */
public class StudentModel extends DefaultTableModel {
    
    private DefaultTableModel model = new DefaultTableModel();
    
    public StudentModel() {
        model.addColumn("Nis");
        model.addColumn("Name");
        model.addColumn("Subject");
        System.out.println("Masuk Sini");
    }
    
    public DefaultTableModel getModel() {
        return model;
    }
}
