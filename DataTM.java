package cadastro;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class DataTM extends AbstractTableModel {
  
    public ArrayList<Account> data = new ArrayList<>();
    private String[] columns = {"Conta", "Tipo", "Nome", "Email", "Celular","Sexo", "RG", "CPF", "Rua", "Número", "Complemento", "CEP", "Cidade", "Estado"};
    

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: 
                return data.get(rowIndex).getNumeroConta();
            case 1:
                return data.get(rowIndex).getTipo();
            case 2:
                return data.get(rowIndex).getNome();
            case 3:
                return data.get(rowIndex).getEmail();
            case 4: 
                return data.get(rowIndex).getCelular();
            case 5: 
                return data.get(rowIndex).getSexo();
            case 6: 
                return data.get(rowIndex).getRg();
            case 7: 
                return data.get(rowIndex).getCpf();
            case 8: 
                return data.get(rowIndex).getRua();
            case 9: 
                return data.get(rowIndex).getNumero();
            case 10: 
                return data.get(rowIndex).getComplemento();
            case 11: 
                return data.get(rowIndex).getCep(); 
            case 12: 
                return data.get(rowIndex).getCidade();
            case 13: 
                return data.get(rowIndex).getEstado();        
        }
        return null;
    }
    public void addRow(Account u){
        this.data.add(u);
        this.fireTableDataChanged();
    }
    public void removeRow(int rowIndex){
        this.data.remove(rowIndex);
        this.fireTableRowsDeleted(rowIndex, rowIndex);
    }

}
    