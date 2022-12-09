package salud;
public class empleado extends persona
{
    private double valorHora,horasTrabajadas,totalPago;
    private String departamento,cargo;
    
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public double getValorHora() {
        return valorHora;
    }
    public double getTotalPago() {
        return totalPago;
    }
    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
  public empleado(String tipoDoc, String documento, String nombre, String apellido,
  String sexo,int edad,double peso,double estatura,double imc,String cargo, double valorHora,double horasTrabajadas,String departamento,double totalPago)
  {
    super(tipoDoc,  documento,  nombre,  apellido, sexo, edad, peso, estatura, imc);
    this.cargo=cargo;
    this.valorHora=valorHora;
    this.horasTrabajadas=horasTrabajadas;
    this.departamento=departamento;
  }
  public void datosempleado()
  {
    System.out.println("Ingrese el cargo");
    setCargo(ingreso.next());
    System.out.println("Ingrese el valor de la hora trabajada ");
    setValorHora(ingreso.nextDouble());
    System.out.println("Ingrese la cantidad de horas trabajadas");
    setHorasTrabajadas(ingreso.nextDouble());
  }
  public void calculrHonorario()
  {
    final double reteica =0.966;
    setTotalPago((getValorHora()*getHorasTrabajadas())/reteica);
    System.out.println("Pago total: "+getTotalPago());
  }
  public void mostrarEmpleado()
  {
    System.out.println("cargo: "+getCargo());
    System.out.println("valor hora: "+getValorHora());
    System.out.println("horas trabajadas: "+getHorasTrabajadas());
    System.out.println("total salario:"+getTotalPago());
  }
    
}
