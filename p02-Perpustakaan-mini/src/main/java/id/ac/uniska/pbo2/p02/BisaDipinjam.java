/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package id.ac.uniska.pbo2.p02;

/**
 *
 * Kontrak untuk semua koleksi yang dapat dipinjam
 * Interface hanya menyebutkan apa yang harus bisa dilakukan, bukan caranya
 */
public interface BisaDipinjam {
    
    /** Lama peminjaman maksimal dalam hari.
     * @return  */
    int batasHariPinjam();
    
    /** Denda keterlambatan dalam rupiah
     * @param hariTerlambat.
     * @return */
    long hitungDenda(int hariTerlambat);
}
