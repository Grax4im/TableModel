package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Produto;

public class TableModel extends AbstractTableModel{

    private List<Produto> dados = new ArrayList<>();
    private String[] colunas = {"Descrição", "Quantidade", "Valor"};

    @Override
    public String getColumnName(int coluna) {
        return colunas[coluna];
    }
    
    @Override
    public int getRowCount() {
        return dados.size();
    }
    
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna) {
            case 0:
                return dados.get(linha).getDescricao();
            case 1:
                return dados.get(linha).getQtd();
            case 2:
                return dados.get(linha).getValor();
        }
       return null;
    }
    
    public void addRow(Produto p) {
        this.dados.add(p);
        this.fireTableDataChanged();
    }
    
}
