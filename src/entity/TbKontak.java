/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author umbara
 */
@Entity
@Table(name = "tb_kontak")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbKontak.findAll", query = "SELECT t FROM TbKontak t"),
    @NamedQuery(name = "TbKontak.findByNama", query = "SELECT t FROM TbKontak t WHERE t.nama = :nama"),
    @NamedQuery(name = "TbKontak.findByTelp", query = "SELECT t FROM TbKontak t WHERE t.telp = :telp"),
    @NamedQuery(name = "TbKontak.findByEmail", query = "SELECT t FROM TbKontak t WHERE t.email = :email")})
public class TbKontak implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Id
    @Basic(optional = false)
    @Column(name = "telp")
    private String telp;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;

    public TbKontak() {
    }

    public TbKontak(String telp) {
        this.telp = telp;
    }

    public TbKontak(String telp, String nama, String email) {
        this.telp = telp;
        this.nama = nama;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (telp != null ? telp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbKontak)) {
            return false;
        }
        TbKontak other = (TbKontak) object;
        if ((this.telp == null && other.telp != null) || (this.telp != null && !this.telp.equals(other.telp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TbKontak[ telp=" + telp + " ]";
    }
    
}
