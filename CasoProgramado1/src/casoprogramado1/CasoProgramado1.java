/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoprogramado1;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class CasoProgramado1 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here    Empleado empleado1 = new Empleado();
    //EMPLEADO
    Empleado empleado1 = new Empleado(); 
    Empleado id1 = new Empleado();
    Empleado codigo1 = new Empleado();
    Empleado vehiculo1 = new Empleado();
    Empleado sucursal = new Empleado();
    //CLIENTES
    Facturas cliente1 = new Facturas();
    Facturas cedulaCliente1 = new Facturas();
    Facturas codigoFactura1 = new Facturas();
    Facturas mes = new Facturas();
    Facturas monto = new Facturas();
    Facturas automotriz = new Facturas();
    Facturas construccion = new Facturas();
    Facturas electronico = new Facturas();
    Facturas deseaContinuar = new Facturas();
    int continuar;
    int producto1;
    int producto2;
    int producto3;
    int montoInt;
    int montoSumador=0;
    int montoBono1=0;
    int montoTotal1=0;
    int montoBono2=0;
    int montoTotal2=0;
    int puntosEmpleado=0;
    int montoBono3=0;
    int montoTotal3=0;
    int montoBono4=0;
    int montoTotal4=0;
    int montoBono5=0;
    int montoTotal5=0;
    int montoTotal=0;
    int montoTotalBono=0;
    
    // OBTENCION DE INFORMACIÓN
    empleado1.nombreAgente = JOptionPane.showInputDialog("Inserte nombre de empleado");
    id1.id = JOptionPane.showInputDialog("Inserte cedula de empleado");
    codigo1.codigo = JOptionPane.showInputDialog("Inserte codigo de empleado");
    vehiculo1.vehiculoEstado = JOptionPane.showInputDialog("Inserte si posee vehiculo");
    sucursal.sucursal = JOptionPane.showInputDialog("Inserte codigo de empleado");
    
    cliente1.nombreCliente = JOptionPane.showInputDialog("Inserte nombre de cliente");
    cedulaCliente1.idCx = JOptionPane.showInputDialog("Inserte cedula de cliente");
    codigoFactura1.codigoFactura=JOptionPane.showInputDialog("Inserte codigo de factura");
    mes.mes=JOptionPane.showInputDialog("Inserte mes de factura en dígitos numericos");
    monto.monto=JOptionPane.showInputDialog("Inserte mes de factura en dígitos numericos");
    automotriz.productoAuto=JOptionPane.showInputDialog("Hubo producto automotriz 1=si 2=no");
    construccion.productoConstru=JOptionPane.showInputDialog("Hubo producto automotriz 1=si 2=no");
    electronico.productoElectro=JOptionPane.showInputDialog("Hubo producto electronico 1=si 2=no");
    
    deseaContinuar.deseaContinuar = JOptionPane.showInputDialog("Desea agregar otra factura 1=si 2=no");
    montoInt= Integer.parseInt(monto.monto);
    montoSumador=montoInt;
    continuar= Integer.parseInt(deseaContinuar.deseaContinuar);
    producto1= Integer.parseInt(automotriz.productoAuto);
    producto2= Integer.parseInt(construccion.productoConstru);
    producto3= Integer.parseInt(electronico.productoElectro);
    
    
        if (producto1 == 1 && producto2 == 1 && producto3 == 1) {
            montoBono1 = (montoSumador) * 10 / 100;
            montoTotal1 = montoSumador + montoBono1;
            puntosEmpleado = +3;
            if (montoTotal1 >= 50000) {
                montoBono1 = (montoSumador) * 5 / 100;
                montoTotal1 = montoSumador + montoBono1;
                puntosEmpleado = +1;
            }
        }
        if (producto3 >= 3) {
            montoBono2 = (montoSumador) * 4 / 100;
            montoTotal2 = montoSumador + montoBono2;
            puntosEmpleado = +1;
        } else {
            montoBono2 = (montoSumador) * 2 / 100;
            montoTotal2 = montoSumador + montoBono2;
            puntosEmpleado = +1;
        }
        if (producto1 > 4) {
            montoBono3 = (montoSumador) * 4 / 100;
            montoTotal3 = montoSumador + montoBono3;
            puntosEmpleado = +1;
        }else {
            montoBono3 = (montoSumador) * 2 / 100;
            montoTotal3 = montoSumador + montoBono3;
            puntosEmpleado = +1;
        }  
        if (producto2 >=1 ) {
            montoBono4 = (montoSumador) * 8 / 100;
            montoTotal4 = montoSumador + montoBono4;
            puntosEmpleado = +2;
        }
        if (montoTotal2 >= 50000 || montoTotal3 >= 50000|| montoTotal4 >= 50000) {
                montoBono5 = (montoSumador) * 5 / 100;
                montoTotal5 = montoSumador + montoBono5;
                puntosEmpleado = +1;
            }
        
        if (continuar>3||montoTotal>300000) {
            
        }
        
        while (continuar == 1) {
            cliente1.nombreCliente = JOptionPane.showInputDialog("Inserte nombre de cliente");
            cedulaCliente1.idCx = JOptionPane.showInputDialog("Inserte cedula de cliente");
            codigoFactura1.codigoFactura = JOptionPane.showInputDialog("Inserte codigo de factura");
            mes.mes = JOptionPane.showInputDialog("Inserte mes de factura en dígitos numericos");
            monto.monto = JOptionPane.showInputDialog("Inserte mes de factura en dígitos numericos");
            automotriz.productoAuto = JOptionPane.showInputDialog("Hubo producto automotriz 1=si 2=no");
            construccion.productoConstru = JOptionPane.showInputDialog("Hubo producto automotriz 1=si 2=no");
            electronico.productoElectro = JOptionPane.showInputDialog("Hubo producto electronico 1=si 2=no");
            montoInt = Integer.parseInt(monto.monto);
            montoSumador = montoInt + montoSumador;
            continuar = Integer.parseInt(deseaContinuar.deseaContinuar);
            producto1 = Integer.parseInt(automotriz.productoAuto);
            producto2 = Integer.parseInt(construccion.productoConstru);
            producto3 = Integer.parseInt(electronico.productoElectro);
            if (producto1 == 1 && producto2 == 1 && producto3 == 1) {
            montoBono1 = (montoSumador) * 10 / 100;
            montoTotal1 = montoSumador + montoBono1;
            puntosEmpleado = +3;
            if (montoTotal1 >= 50000) {
                montoBono1 = (montoSumador) * 5 / 100;
                montoTotal1 = montoSumador + montoBono1;
                puntosEmpleado = +1;
            }
            }
            if (producto3 >= 3) {
                montoBono2 = (montoSumador) * 4 / 100;
                montoTotal2 = montoSumador + montoBono2;
                puntosEmpleado = +1;
            } else {
                montoBono2 = (montoSumador) * 2 / 100;
                montoTotal2 = montoSumador + montoBono2;
                puntosEmpleado = +1;
            }
            if (producto1 > 4) {
                montoBono3 = (montoSumador) * 4 / 100;
                montoTotal3 = montoSumador + montoBono3;
                puntosEmpleado = +1;
            } else {
                montoBono3 = (montoSumador) * 2 / 100;
                montoTotal3 = montoSumador + montoBono3;
                puntosEmpleado = +1;
            }
            if (producto2 >= 1) {
                montoBono4 = (montoSumador) * 8 / 100;
                montoTotal4 = montoSumador + montoBono4;
                puntosEmpleado = +2;
            }
            if (montoTotal2 >= 50000 || montoTotal3 >= 50000 || montoTotal4 >= 50000) {
                montoBono5 = (montoSumador) * 5 / 100;
                montoTotal5 = montoSumador + montoBono5;
                puntosEmpleado = +1;
            }

            if (continuar > 3 || montoTotal > 300000) {

            }
            deseaContinuar.deseaContinuar = JOptionPane.showInputDialog("Desea agregar otra factura 1=si 2=no");
        }

    }

}
