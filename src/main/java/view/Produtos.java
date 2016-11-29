/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author João Vitorino
 */
@Entity
@Table(name = "produtos", catalog = "estoque", schema = "")
@NamedQueries({
    @NamedQuery(name = "Produtos.findAll", query = "SELECT p FROM Produtos p"),
    @NamedQuery(name = "Produtos.findById", query = "SELECT p FROM Produtos p WHERE p.id = :id"),
    @NamedQuery(name = "Produtos.findByNome", query = "SELECT p FROM Produtos p WHERE p.nome = :nome"),
    @NamedQuery(name = "Produtos.findByDescricao", query = "SELECT p FROM Produtos p WHERE p.descricao = :descricao"),
    @NamedQuery(name = "Produtos.findByQuantidade", query = "SELECT p FROM Produtos p WHERE p.quantidade = :quantidade"),
    @NamedQuery(name = "Produtos.findByPreco", query = "SELECT p FROM Produtos p WHERE p.preco = :preco"),
    @NamedQuery(name = "Produtos.findByCompativelWindows", query = "SELECT p FROM Produtos p WHERE p.compativelWindows = :compativelWindows"),
    @NamedQuery(name = "Produtos.findByCompativelLinux", query = "SELECT p FROM Produtos p WHERE p.compativelLinux = :compativelLinux"),
    @NamedQuery(name = "Produtos.findByCompativelOutros", query = "SELECT p FROM Produtos p WHERE p.compativelOutros = :compativelOutros"),
    @NamedQuery(name = "Produtos.findByCompativelSocket", query = "SELECT p FROM Produtos p WHERE p.compativelSocket = :compativelSocket"),
    @NamedQuery(name = "Produtos.findByCompativelMac", query = "SELECT p FROM Produtos p WHERE p.compativelMac = :compativelMac"),
    @NamedQuery(name = "Produtos.findByCompativelSlot", query = "SELECT p FROM Produtos p WHERE p.compativelSlot = :compativelSlot"),
    @NamedQuery(name = "Produtos.findByCategoria", query = "SELECT p FROM Produtos p WHERE p.categoria = :categoria")})
public class Produtos implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "quantidade")
    private int quantidade;
    @Basic(optional = false)
    @Column(name = "preco")
    private double preco;
    @Basic(optional = false)
    @Column(name = "compativel_Windows")
    private String compativelWindows;
    @Basic(optional = false)
    @Column(name = "compativel_Linux")
    private String compativelLinux;
    @Column(name = "compativel_Outros")
    private String compativelOutros;
    @Basic(optional = false)
    @Column(name = "compativel_Socket")
    private String compativelSocket;
    @Basic(optional = false)
    @Column(name = "compativel_Mac")
    private String compativelMac;
    @Basic(optional = false)
    @Column(name = "compativel_Slot")
    private String compativelSlot;
    @Basic(optional = false)
    @Column(name = "categoria")
    private String categoria;

    public Produtos() {
    }

    public Produtos(Integer id) {
        this.id = id;
    }

    public Produtos(Integer id, String nome, String descricao, int quantidade, double preco, String compativelWindows, String compativelLinux, String compativelSocket, String compativelMac, String compativelSlot, String categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
        this.compativelWindows = compativelWindows;
        this.compativelLinux = compativelLinux;
        this.compativelSocket = compativelSocket;
        this.compativelMac = compativelMac;
        this.compativelSlot = compativelSlot;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        int oldQuantidade = this.quantidade;
        this.quantidade = quantidade;
        changeSupport.firePropertyChange("quantidade", oldQuantidade, quantidade);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        double oldPreco = this.preco;
        this.preco = preco;
        changeSupport.firePropertyChange("preco", oldPreco, preco);
    }

    public String getCompativelWindows() {
        return compativelWindows;
    }

    public void setCompativelWindows(String compativelWindows) {
        String oldCompativelWindows = this.compativelWindows;
        this.compativelWindows = compativelWindows;
        changeSupport.firePropertyChange("compativelWindows", oldCompativelWindows, compativelWindows);
    }

    public String getCompativelLinux() {
        return compativelLinux;
    }

    public void setCompativelLinux(String compativelLinux) {
        String oldCompativelLinux = this.compativelLinux;
        this.compativelLinux = compativelLinux;
        changeSupport.firePropertyChange("compativelLinux", oldCompativelLinux, compativelLinux);
    }

    public String getCompativelOutros() {
        return compativelOutros;
    }

    public void setCompativelOutros(String compativelOutros) {
        String oldCompativelOutros = this.compativelOutros;
        this.compativelOutros = compativelOutros;
        changeSupport.firePropertyChange("compativelOutros", oldCompativelOutros, compativelOutros);
    }

    public String getCompativelSocket() {
        return compativelSocket;
    }

    public void setCompativelSocket(String compativelSocket) {
        String oldCompativelSocket = this.compativelSocket;
        this.compativelSocket = compativelSocket;
        changeSupport.firePropertyChange("compativelSocket", oldCompativelSocket, compativelSocket);
    }

    public String getCompativelMac() {
        return compativelMac;
    }

    public void setCompativelMac(String compativelMac) {
        String oldCompativelMac = this.compativelMac;
        this.compativelMac = compativelMac;
        changeSupport.firePropertyChange("compativelMac", oldCompativelMac, compativelMac);
    }

    public String getCompativelSlot() {
        return compativelSlot;
    }

    public void setCompativelSlot(String compativelSlot) {
        String oldCompativelSlot = this.compativelSlot;
        this.compativelSlot = compativelSlot;
        changeSupport.firePropertyChange("compativelSlot", oldCompativelSlot, compativelSlot);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        String oldCategoria = this.categoria;
        this.categoria = categoria;
        changeSupport.firePropertyChange("categoria", oldCategoria, categoria);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produtos)) {
            return false;
        }
        Produtos other = (Produtos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.Produtos[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
