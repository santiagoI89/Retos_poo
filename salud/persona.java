package salud;
import java.util.*;
public class persona 
{
     String tipoDoc, documento, nombre, apellido, sexo;
     int edad;
     Double peso,estatura,imc;
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }
    public void setImc(Double imc) {
        this.imc = imc;
    }
    Scanner ingreso = new Scanner(System.in);
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public double getImc() {
        return imc;
    }
    public void setImc(double imc) {
        this.imc = imc;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public persona()
    {

    }
    public persona(String tipoDoc, String documento, String nombre, String apellido,
     String sexo,int edad,double peso,double estatura,double imc)
    {
        this.tipoDoc=tipoDoc;
        this.documento=documento;
        this.nombre=nombre;
        this.apellido=apellido;
        this.sexo=sexo;
        this.peso=peso;
        this.estatura=estatura;
        this.imc=imc;
        this.edad=edad;
       
    } 
    public void pedirDatos()
    {
        System.out.println("Ingrese su tipo de documento");
        setTipoDoc(ingreso.next());
        System.out.println("ingrese su documento");
        setDocumento(ingreso.next());
        System.out.println("ingrese su nombre");
        setNombre(ingreso.next());
        System.out.println("ingrese su apellido");
        setApellido(ingreso.next());
        System.out.println("ingrese su sexo");
        setSexo(ingreso.next());
        System.out.println("ingrese su edad");
        setEdad(ingreso.nextInt());
        System.out.println("ingrese su peso");
        setPeso(ingreso.nextDouble());
        System.out.println("ingrese su estatura ");
        setEstatura(ingreso.nextDouble());
    }
    public Double calcularIMC()
    {    
        setImc((getPeso())/(getEstatura()*getEstatura()));
        return getImc();
    }
    public void mayorEdad()
    {
        if(getEdad()<0)
        {
           System.out.println("La edad no puede ser negativa");
        }
        else if(getEdad()>=18)
        {
            System.out.println("Eres mayor edad");
        }
        else if(getEdad()<18)
        {
            System.out.println("Eres una persona menor de edad");
        }
    }
    public void mostrar()
    {
        System.out.println("\n............................................");
        System.out.println("Datos");
        System.out.println("tipo documento: "+getTipoDoc());
        System.out.println("documento: "+getDocumento());
        System.out.println("nombre: "+getNombre());
        System.out.println("apellido: "+getApellido());
        System.out.println("sexo: "+getSexo());
        System.out.println("edad: "+getEdad());
        System.out.println("peso: "+getPeso());
        System.out.println("estatura: "+getEstatura());
        System.out.println("imc: "+getImc());
    } 
    
}