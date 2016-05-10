/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.stri;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author 21507124
 */
public class MyAbstractList extends AbstractListModel<Personne> {

    private List<Personne> myList = new ArrayList<>();

    @Override
    public int getSize() {        
        return myList.size();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Personne getElementAt(int index) {       
        //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return myList.get(index);
    }

    void add(Personne p) {
        myList.add(p);
        this.fireContentsChanged(this, 0, myList.size());
    }
}
