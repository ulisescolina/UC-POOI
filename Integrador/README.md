# Primer vistazo: Información general del problema

* Empresa dueña de un emprendimiento (en un cierto rubro)
* Necesita la Gestion de Reclamos
  * Ingreso de reclamos
    * Datos importantes:
      * Numero
      * Descripcion del problema
      * Tipo de articulo a reparar
        * Datos importantes:
          * Codigo identificador
          * Nombre
      * Fecha de ingreso
      * Fecha estimada de entrega      
  
  * Asignación de recursos para reparación


  * Seguimiento de reparaciones
    * Una reparacion
      * Se divide en tareas
        * Datos importantes de Tareas:
          * Codigo
          * nombre
          * Descripcion
          * Tipos de Articulo a los que aplica
          * La tarea tiene asignada un técnico
          * tiempo de la tarea
            * Dia realizacion
            * horas dedicadas
            
  
  * Registro de empleados
    * Datos importantes: técnico
      * Documento
      * Nombres
      * Apellidos
      * Tipos de articulos capacitados para trabajar
      * Modalidades de trabajo
        * Mensual
          * Datos importantes Modalidad:
            * Conocer saldo mensual que percibe
        * Jornalero
          * Datos importantes Modalidad:
            * Conocer la tarifa por hora que se le paga
            
# Conceptos idóneos (Clases Candidatas):
* Usuarios
  * Superusuario
  * Tecnico
* Reclamos
* Articulos
* TipoArticulo
* Recursos
* Reparaciones
* Tarea
* ModalidadeTrabajo
* FormaPago

# Relaciones
* Usuario es un Superusuario
* Usuario es un Tecnico

* Técnico tiene ModalidadTrabajo
* Tecnico tiene FormaPago
* Tecnico tiene TipoArticulo

* ModalidadTrabajo tiene FormaPago

* Reclamos TipoArticulo
* Reclamos tiene Reparacion

* Articulos tiene TipoArticulo

* Reparacion tiene Recurso
* Reparacion tiene Tarea

* Tareas tiene TipoArticulo
* Tareas tiene asignado Tecnico

