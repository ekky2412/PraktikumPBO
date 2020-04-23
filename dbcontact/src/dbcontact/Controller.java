
package dbcontact;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class Controller {
    
    Model model;
    View view;

    public Controller(Model model,View view) {
        this.model = model;
        this.view = view;
        
        if (model.getBanyakData() != 0) {
            String dataContact[][] = model.readContact();
            view.tabel.setModel((new JTable(dataContact, view.namaKolom)).getModel());
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }

        view.btnTambahPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = view.getNama();
                String noHp = view.getNoHP();
                String umur = view.getUmur();
                String email = view.getEmail();
                model.insertContact(nama, noHp, umur, email);

                String dataContact[][] = model.readContact();
                view.tabel.setModel(new JTable(dataContact, view.namaKolom).getModel());
            }
        });

        view.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = view.tabel.getSelectedRow();
                int kolom = view.tabel.getSelectedColumn();

                String dataterpilih = view.tabel.getValueAt(baris, 0).toString();

                System.out.println(dataterpilih);

                int input = JOptionPane.showConfirmDialog(null,
                        "Apa anda ingin menghapus data " + dataterpilih + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

                if (input == 0) {
                    model.deleteContact(dataterpilih);
                    String dataContact[][] = model.readContact();
                    view.tabel.setModel(new JTable(dataContact, view.namaKolom).getModel());
                } else {
                    JOptionPane.showMessageDialog(null, "Tidak Jadi Dihapus");
                }
            }
        }
        );
        
    }
    
}
