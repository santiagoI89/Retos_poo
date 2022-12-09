package principal;
import salud.*;
public class inicio 
{
    
    public static void main(String[] args) 
    {
        persona myPersona = new persona(null, null, null, null, null, 0, 0, 0, 0);

        empleado myEmpleado = new empleado(null, null, null, null, null, 0, 0, 0, 0, null, 0, 0, null, 0);
        
        myPersona.pedirDatos();
        myEmpleado.datosempleado();
        Double respuesta = myPersona.calcularIMC();
        if(respuesta<20)
        {
            System.out.println("PESOBAJO");
        }
        else if(respuesta>=20 && respuesta<=25)
        {
            System.out.println("PESOIDEAL");
        }
        else if(respuesta>25)
        {
            System.out.println("SOBREPESO");
        }
        myPersona.mayorEdad();
        myEmpleado.calculrHonorario();
        myPersona.mostrar(); 
        myEmpleado.mostrarEmpleado();    
    }
}
