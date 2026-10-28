Resolución del ejercicio N°2 de la unidad 4 d e programación 2.
Aquí tienes un resumen completo y estructurado del diseño orientado a objetos planteado para el sistema de cálculo fiscal del Estudio Contable:

1. Arquitectura del Sistema (Jerarquía y Polimorfismo)
Clase Abstracta Trabador:

Funciona como la raíz de la jerarquía y define el estado básico compartido por todos los trabajadores: nombre y cuil.

Incorpora el método abstracto double calcularImpuesto(), obligando a cada subclase a implementar su propia lógica fiscal según corresponda.

Clases Hijas (Subclases Concretas):

EmpleadoRelacionDependencia: Sobrescribe el cálculo aplicando una alícuota o regla fiscal específica para empleados en relación de dependencia (por ejemplo, deducciones o un porcentaje sobre un sueldo bruto).

Autonomo: Implementa el cálculo considerando los ingresos y escalas correspondientes al régimen de trabajadores autónomos.

DirectorEmpresa: Aplica la alícuota correspondiente a directores o cargos gerenciales (habitualmente con un tratamiento fiscal diferenciado sobre dividendos u honorarios).

Clase Coordinadora EstudioContable:

Actúa como gestor del sistema financiero. Posee una colección/lista polimórfica de tipo Trabajador.

Cuenta con métodos clave para procesar la lista, invocar de forma dinámica el método calcularImpuesto() de cada objeto (demostrando polimorfismo) y totalizar la recaudación fiscal global del estudio.

Clase Principal (Main):

Se encarga de instanciar diferentes tipos de trabajadores (EmpleadoRelacionDependencia, Autonomo, DirectorEmpresa), agruparlos en una colección general y solicitar al estudio contable la generación e impresión del reporte financiero consolidado por consola.
<img width="668" height="358" alt="Captura de pantalla 2026-10-28 100453" src="https://github.com/user-attachments/assets/39ccf729-08fe-4b2e-947b-71e418a932b7" />
