/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swingGW;

import entity.TbKontak;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author umbara
 */
public class tableModel extends AbstractTableModel {

    List<TbKontak> ls;

    public List<TbKontak> getLs() {
        return ls;
    }

    public void setLs(List<TbKontak> ls) {
        this.ls = ls;
    }

    @Override
    public int getRowCount() {
        return ls.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return ls.get(rowIndex).getNama();
            case 1:
                return ls.get(rowIndex).getTelp();
            case 2:
                return ls.get(rowIndex).getEmail();
            default:
                return null;

        }
    }

    public void insert(TbKontak ktk) {
        ls.add(ktk);
        fireTableRowsInserted(getRowCount(), getColumnCount());
    }

    public void updated(int row, TbKontak ktk) {
        ls.set(row, ktk);
        fireTableRowsUpdated(row, row);
    }

    public void deleted(int row) {
        ls.remove(row);
        fireTableRowsDeleted(row, row);
    }

    public void deletAll(List<TbKontak> tb) {
        ls.removeAll(tb);
        fireTableRowsDeleted(getRowCount(), getColumnCount());
    }

    void insertAll(List<TbKontak> tb) {
        ls.addAll(tb);
        fireTableRowsInserted(getRowCount(), getColumnCount());
    }
    String kolom[] = {"Nama", "Telepon", "Email"};

    @Override
    public String getColumnName(int column) {
        return kolom[column];
    }
}
