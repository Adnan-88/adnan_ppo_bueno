package service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import model.Producto;

public class ProductosService {
	List<Producto> productos=new ArrayList<>();
	
	public void altaProducto(Producto producto) {
		productos.add(producto);
	}
	//sube el precio a todos los productos
	public void subirPrecio(int porcentaje) {
		productos.replaceAll(p->{
			p.setPrecio(p.getPrecio()+(p.getPrecio()*porcentaje/100));
			return p;
		});
	}
	//sube el precio a los productos que cumplan una condición
	public void subirPrecioConCondicion(int porcentaje, Predicate<Producto> cond) {
		productos.replaceAll(p->{
			if(cond.test(p)) {
				p.setPrecio(p.getPrecio()+(p.getPrecio()*porcentaje/100));
			}
			return p;
		});
	}
	public void ordenar() {
		//derivamos la comparación al método compare de Double
		productos.sort((a,b)->Double.compare(a.getPrecio(), b.getPrecio()));
	}
	
	public void eliminarProductosPorCategoria(String categoria) {
		productos.removeIf(p->p.getCategoria().equals(categoria));
	}
	
	public List<Producto> productosAlmacenados() {
		return productos;
	}
}
