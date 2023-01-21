package model;

import java.util.Date;

public class Pedido {

		private String producto;
		private Date fechapedido;
		private double precio;
		public Pedido(String producto, Date fechapedido, double precio) {
			super();
			this.producto = producto;
			this.fechapedido = fechapedido;
			this.precio = precio;
		}
		public String getProducto() {
			return producto;
		}
		public void setProducto(String producto) {
			this.producto = producto;
		}
		public Date getFechapedido() {
			return fechapedido;
		}
		public void setFechapedido(Date fechapedido) {
			this.fechapedido = fechapedido;
		}
		public double getPrecio() {
			return precio;
		}
		public void setPrecio(double precio) {
			this.precio = precio;
		}
	

	}
