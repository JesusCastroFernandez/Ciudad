/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciudad;

/**
*
* @author JESUS (indica el autor de la clase o método)
* {@code}: incluye en el comentario un trozo de código que se formatea de forma especial.
* {@docRoot}: incluye una ruta relativa al directorio raíz donde se genera la documentación.
* @deprecated: indica que un método ha quedado obsoleto, se desaconseja su uso y puede que en futuras versiones desaparezca.
* @exception: es sinónima de throws.
* {@inheritDoc}: hereda el comentario Javadoc de la clase o método superior en la jerarquía de clases.
* {@link}: incluye un enlace a otra sección de la documentación, método o clase.
* {@linkplain}: es idéntica a @link pero el enlace es un texto plano.
* {@literal}: muestra un texto sin interpretar el texto como HTML.
* @return: documenta el valor de retorno de un método.
* @see: incluye un enlace con documentación adicional en la sección final de la documentación.
* @serial
* @serialData
* @serialField
* @since: indica a partir de que versión de la API fue incluida la clase o método.
* @throws: documenta una posible excepción que puede ser lanzada por el método.
* {@value}: muestra el valor de un campo estático.
* @version: para documentar la versión de cuando se hizo checkout del sistema de control de versiones.
 */
public class Ciudad {

     /**
     * @param: documenta un parámetro de un método.
     */
    public static void main(String[] args) {
              
        // Diseño de Ciudad (Proporción de 1: infraestructura, instalación y equipamiento por cada 100 habitantes)
        
        int habitantes= 100;
        int viviendasFamiliares = 50; // 1 vivienda por pareja
        int escuelas = 1;
        int centroSalud = 1;
        int residencias = 1;
        int banco = 1;
        int correo = 1;
        int teatro= 1;
        int cine = 1;
        int salaConciertos = 1;
        int salaFiestas = 1;
        int museo = 1; 
        int centroCivico = 1;
        int centroDeDia = 1;
        int parque = 1;
        int jardines = 1;
        int iglesia = 1;
        int ayuntamiento = 1;
        int centroDeportivo = 1;
        int poligonoIndustrial = 1;
        int mercado = 1;
        int parkingPublico = 1;
        
        int resultadoCiudadPequeña = habitantes * 10;
        int resultadoCiudadMediana = habitantes * 100;
        int resultadoCiudadGrande = habitantes * 1000;
        int resultadoCiudadPequeña1 = viviendasFamiliares * 10;
        int resultadoCiudadMediana1 = viviendasFamiliares * 100;
        int resultadoCiudadGrande1 = viviendasFamiliares * 1000;
        int resultadoCiudadPequeña2 = poligonoIndustrial * 10;
        int resultadoCiudadMediana2 = poligonoIndustrial * 100/2;
        int resultadoCiudadGrande2 = poligonoIndustrial * 1000/3;
        int resultadoCiudadPequeña3 = banco * 10;
        int resultadoCiudadMediana3 = banco * 100/2;
        int resultadoCiudadGrande3 = banco * 1000/3;
        int resultadoCiudadPequeña4 = parkingPublico * 10;
        int resultadoCiudadMediana4 = parkingPublico * 100/2;
        int resultadoCiudadGrande4 = parkingPublico * 1000/3;
        int resultadoCiudadPequeña5 = correo * 10;
        int resultadoCiudadMediana5 = correo * 100/2;
        int resultadoCiudadGrande5 = correo * 1000/3;
        int resultadoCiudadPequeña6 = centroCivico * 10;
        int resultadoCiudadMediana6 = centroCivico * 100/2;
        int resultadoCiudadGrande6 = centroCivico * 1000/3;
        int resultadoCiudadPequeña7 = escuelas * 10;
        int resultadoCiudadMediana7 = escuelas * 100/2;
        int resultadoCiudadGrande7 = escuelas * 1000/3;
        int resultadoCiudadPequeña8 = centroSalud * 10;
        int resultadoCiudadMediana8 = centroSalud * 100/2;
        int resultadoCiudadGrande8 = centroSalud * 1000/3;
        
        // ÁREAS DE LA CIUDAD
        System.out.println("---------------------------------");
        System.out.println("1.- ÁREA RESIDENCIAL.");
        System.out.println("---------------------------------");
                
        System.out.println("La ciudad tiene " + habitantes + " habitantes.");
        System.out.println();
        System.out.println("La ciudad tiene " + viviendasFamiliares + " viviendas familiares, 1 por pareja o matrimonio.");
        System.out.println();
        
        System.out.println("-------------------------------");
        System.out.println("2.- ÁREA INDUSTRIAL.");
        System.out.println("-------------------------------");
        
        System.out.println("La ciudad dispone de: " + poligonoIndustrial + " polígono industrial para empresas.");
        System.out.println();
        
        System.out.println("---------------------------------------------------------");
        System.out.println("3.- ÁREA ADMINISTRATIVA, COMERCIAL-FINANCIERA.");
        System.out.println("---------------------------------------------------------");
                
        System.out.println("La ciudad cuenta con: " + ayuntamiento + " ayuntamiento, " + banco + " banco,  " + mercado + " mercado y " + parkingPublico + " parking público.");
        System.out.println("La ciudad dispone de: " + correo + "  oficina de correos, " + centroCivico + " centro cívico y " + centroDeDia + " centro de día.");
        System.out.println();
        
        System.out.println("-----------------------------------------------------");
        System.out.println("4.- ÁREA OCIO Y ENTRETENIMIENTO.");
        System.out.println("-----------------------------------------------------");
                
        System.out.println("La ciudad cuenta con: " + cine + " cine y " + teatro +  " teatro.");
        System.out.println();
        System.out.println("La ciudad cuenta con: " + salaConciertos + " sala de conciertos, " + salaFiestas +  " salas de fiestas y " + museo + " museo.");
        System.out.println();
        
        System.out.println("--------------------------------------");
        System.out.println("5.- ÁREA ESPARCIMIENTO.");
        System.out.println("--------------------------------------");
                
        System.out.println("La ciudad tiene: " + parque +  " parque.");
        System.out.println();
        System.out.println("La ciudad tiene: " + jardines +  " jardines.");
        System.out.println();
        
        System.out.println("-----------------------------");
        System.out.println("6.- ÁREA DE CULTO.");
        System.out.println("-----------------------------");
               
        System.out.println("En la ciudad hay: " + iglesia +  " iglesia.");
        System.out.println();
        
        System.out.println("----------------------------------------------------------");
        System.out.println("7.- ÁREA DE EDUCACIÓN, FORMACIÓN Y DEPORTE.");
        System.out.println("-----------------------------------------------------------");
                
        System.out.println("La ciudad tiene: " + escuelas +  " escuela y " + centroDeportivo + " centro deportivo.");
        System.out.println();
        
        System.out.println("----------------------------");
        System.out.println("8.- ÁREA DE SALUD.");
        System.out.println("----------------------------");
                
        System.out.println("La ciudad tiene: " + centroSalud +  " centro de salud y " + residencias + " residencia de mayores.");
        System.out.println();        
        
        System.out.println("-------------------------------");
        System.out.println("RESUMEN DE TIPOS DE CIUDADES.");
        System.out.println("-------------------------------");
        System.out.println();
         
        // Muestra por pantalla la cobertura de necesidades básicas proporcionales para un población tipo.
        
        System.out.println("---------------------------");
        System.out.println("CIUDAD PEQUEÑA.");
        System.out.println("---------------------------");
        System.out.println();
        
        System.out.println("La ciudad dispondría de: " + resultadoCiudadPequeña + " habitantes.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + resultadoCiudadPequeña1 + " viviendas familiares.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + resultadoCiudadPequeña2 + " polígonos industriales para empresas.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + ayuntamiento + " ayuntamiento.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + resultadoCiudadPequeña3 + " bancos.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + mercado + " mercado central.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + resultadoCiudadPequeña4 + " parkings públicos.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + resultadoCiudadPequeña5 + " oficinas de correo.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + resultadoCiudadPequeña6 + " centros cívicos.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + resultadoCiudadPequeña7 + " escuelas.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + resultadoCiudadPequeña8 + " centros de salud.");
        System.out.println();
        
        System.out.println("--------------------------");
        System.out.println("CIUDAD MEDIANA.");
        System.out.println("--------------------------");
        System.out.println();
        
        System.out.println("La ciudad dispondría de: " + resultadoCiudadMediana + " habitantes.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + resultadoCiudadMediana1 + " viviendas familiares.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + resultadoCiudadMediana2 + " polígonos industriales para empresas.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + ayuntamiento + " ayuntamiento.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + resultadoCiudadMediana3 + " bancos.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + mercado + " mercado central.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + resultadoCiudadMediana4 + " parkings públicos.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + resultadoCiudadMediana5 + " oficinas de correo.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + resultadoCiudadMediana6 + " centros cívicos.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + resultadoCiudadMediana7 + " escuelas.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + resultadoCiudadMediana8 + " centros de salud.");
        System.out.println();
        
        System.out.println("--------------------------");
        System.out.println("CIUDAD GRANDE.");
        System.out.println("--------------------------");
        System.out.println();
        
        System.out.println("La ciudad dispondría de: " + resultadoCiudadGrande + " habitantes.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + resultadoCiudadGrande1 + " viviendas familiares.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + resultadoCiudadGrande2 + " polígonos industriales para empresas.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + ayuntamiento + " ayuntamiento.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + resultadoCiudadGrande3 + " bancos.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + mercado + " mercado central.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + resultadoCiudadGrande4 + " parkings públicos.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + resultadoCiudadGrande5 + " oficinas de correo.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + resultadoCiudadGrande6 + " centros cívicos.");
        System.out.println();
            System.out.println("La ciudad dispondría de: " + resultadoCiudadGrande7 + " escuelas.");
        System.out.println();
        System.out.println("La ciudad dispondría de: " + resultadoCiudadGrande8 + " centros de salud.");
        System.out.println();
    }
    
}
