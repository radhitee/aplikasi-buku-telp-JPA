/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;

import controller.TbKontakJpaController;
import controller.exceptions.PreexistingEntityException;
import entity.TbKontak;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author umbara
 */
public class dhit {

    public static void main(String[] args) throws PreexistingEntityException, Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aplikasi_Buku_Telp_JPAPU");
        TbKontakJpaController controller = new TbKontakJpaController(emf);
        TbKontak kontak=new TbKontak("666", "Radhitee", "mr.radhite@gmail.com");
        controller.create(kontak);
    }
}
