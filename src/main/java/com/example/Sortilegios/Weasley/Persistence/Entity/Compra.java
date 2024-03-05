package com.example.Sortilegios.Weasley.Persistence.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "compra")
public class Compra {
   @Id
   @Column(name = "id_factura")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer idFactura;
   @Column(name = "medio_pago")
   private String medioDePAgo;
   private LocalDateTime fecha;

   @Column(name = "id_mago")
   private String idMag;
   @ManyToOne
   @JoinColumn(name = "id_mago", insertable = false, updatable = false)
   private Mago mago;
   @OneToMany(mappedBy = "compra", cascade = {CascadeType.ALL})
   private List<CompraArticulo> articulos;

   public List<CompraArticulo> getArticulos() {
      return articulos;
   }

   public void setArticulos(List<CompraArticulo> articulos) {
      this.articulos = articulos;
   }

   public Integer getIdFactura() {
      return idFactura;
   }

   public void setIdFactura(Integer idFactura) {
      this.idFactura = idFactura;
   }

   public String getMedioDePAgo() {
      return medioDePAgo;
   }

   public void setMedioDePAgo(String medioDePAgo) {
      this.medioDePAgo = medioDePAgo;
   }

   public LocalDateTime getFecha() {
      return fecha;
   }

   public void setFecha(LocalDateTime fecha) {
      this.fecha = fecha;
   }

   public String getIdMag() {
      return idMag;
   }

   public void setIdMag(String idMag) {
      this.idMag = idMag;
   }

   public Mago getMago() {
      return mago;
   }

   public void setMago(Mago mago) {
      this.mago = mago;
   }
}
