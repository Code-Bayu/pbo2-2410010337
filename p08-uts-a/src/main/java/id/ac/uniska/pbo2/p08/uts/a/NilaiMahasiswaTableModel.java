/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.p08.uts.a;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lenovo
 */
public class NilaiMahasiswaTableModel extends AbstractTableModel {
    private static final String[] KOLOM = {"NPM", "Nama", "Nilai Tugas", "Nilai UTS", "Nilai UAS"};
    private final List<NilaiMahasiswa> daftar = new ArrayList<>();
    
    @Override
    public int getRowCount() {
    return daftar.size();
    }
    
    @Override
    public int getColumnCount() {
    return KOLOM.length;
    }
    
    @Override
    public String getColumnName(int kolom) {
    return KOLOM[kolom];
    }
    
    @Override
    public Object getValueAt(int baris, int kolom) {
    NilaiMahasiswa k = daftar.get(baris);
    return switch (kolom) {
        case 0 -> k.npm();
        case 1 -> k.nama();
        case 2 -> k.nilaiTugas();
        case 3 -> k.nilaiUTS();
        default -> k.nilaiUAS();
        };
    }
    
    public NilaiMahasiswa get(int baris) {
    return daftar.get(baris);
    }
    
    public void tambah(NilaiMahasiswa nilaiMahasiswa) {
    daftar.add(nilaiMahasiswa);
    int baris = daftar.size() - 1;
    fireTableRowsInserted(baris, baris);
    }
    
    public void ubah(int baris, NilaiMahasiswa nilaiMahasiswa) {
    daftar.set(baris, nilaiMahasiswa);
    fireTableRowsUpdated(baris, baris);
    }
    
    public void hapus(int baris) {
    daftar.remove(baris);
    fireTableRowsDeleted(baris, baris);
    }
}
