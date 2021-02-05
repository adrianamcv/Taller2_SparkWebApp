package edu.escuelaing.arem.ASE.app;

import static spark.Spark.get;
import static spark.Spark.port;

import spark.Request;
import spark.Response;

/**
 *
 * @author Adriana Castañeda
 */

public class SparkWebApp {

    /**
     *
     * Función principal del programa
     */
    public static void main(String[] args) {
        port(getPort());
        get("/datos", (req, res) -> inputDataPage(req,res));
        get("/resultados", (req, res) -> resultsPage(req,res));
    }

    /**
     * Creación de la página principal del programa en la cual se solicitaran los datos de entrada
     * @param req Solicitud petición
     * @param res solicitud respuesta
     * @return Devuelve un String con el código html de la página datos
     */
    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<head>"
                + "<meta charset='UTF-8'>"
                + "<meta name='viewport' content='width=device-width, initial-scale=1.0'>"
                + "<meta http-equiv='X-UA-Compatible' content='ie=edge'>"
                + "<title>CALCULADORA_AREP</title>"
                +"<style>"
                +"body{"
                +"    background-color: White;"
                +"}"
                +"h1{"
                +   "text-align: center;"
                +   "font-family: Arial;"
                +   "font-weight: normal;"
                +   "font-size: 40px;"
                +   "color: Maroon;"
                +"}"
                +"h2{"
                +   "text-align: center;"
                +   "font-family: Arial;"
                +   "font-weight: normal;"
                +   "font-size: 25px;"
                +   "color: Black;"
                +"}"
                +"h3{"
                +   "text-align: center;"
                +   "font-family: Arial;"
                +   "font-weight: normal;"
                +   "font-size: 20px;"
                +   "color: Grey;"
                +"}"
                + "input{"
                +       "width: 550px;"
                +       "padding: 15px;"
                +"}"
                +"</style>"
                + "</head>"
                + "<body>"
                + "<h1>___________________________________________</h1>"
                + "<br>"
                + "<h1>CALCULADORA - Media y desviación estándar</h1>"
                + "<h1>___________________________________________</h1>"
                + "<br>"
                + "<form action=\"/resultados\">"
                + "  <h2 style='text-align: center;'>Ingrese el listado de datos a los cuales les desea calcular la media y la desviación estándar"
                + "  <h3 style='text-align: center;'>Los datos deben estar separados por coma (,)"
                + "  <br><br>"
                + "<div style='text-align: center;'>"
                + "  <input style='text-align: center;' type=\"text\" name=\"Datos\">"
                + "</div>"
                + "  <br><br>"
                + "<div style='text-align: center;'>"
                + "  <input type=\"submit\" value=\"Calcular\">"
                + "</div>"
                + "</form>"
                + "</body>"
                + "</html>";
        return pageContent;
    }
    /**
     * Creación de la página con los resultados de las operaciones
     * @param req Solicitud petición
     * @param res   Solicitud respuesta
     * @return Devuelve un String con el código html de la página resultados
     */

    private static String resultsPage(Request req, Response res) {

        Stat cal = new Stat();
        cal.crearDatos(req.queryParams("Datos"));
        String response
                = "<!DOCTYPE html>"
                + "<html>"
                + "<head>"
                + "<meta charset='UTF-8'>"
                + "<meta name='viewport' content='width=device-width, initial-scale=1.0'>"
                + "<meta http-equiv='X-UA-Compatible' content='ie=edge'>"
                + "<title>CALCULADORA_AREP</title>"
                +"<style>"
                +"body{"
                +"    background-color: White;"
                +"}"
                +"h1{"
                +   "text-align: center;"
                +   "font-family: Arial;"
                +   "font-weight: normal;"
                +   "font-size: 40px;"
                +   "color: Maroon;"
                +"}"
                +"h2{"
                +   "text-align: center;"
                +   "font-family: Arial;"
                +   "font-weight: normal;"
                +   "font-size: 25px;"
                +   "color: Black;"
                +"}"
                +"h3{"
                +   "text-align: center;"
                +   "font-family: Arial;"
                +   "font-weight: normal;"
                +   "font-size: 20px;"
                +   "color: Grey;"
                +"}"
                +"</style>"
                +    "<title>Respuesta</title>"
                +"</head>"
                + "<body>"
                + "<h1>___________________________________________</h1>"
                + "<br>"
                + "<h1>CALCULADORA - Media y desviación estándar</h1>"
                + "<h1>___________________________________________</h1>"
                + "<br>"
                + "<h2>Los resultados obtenidos son:</h1>"
                + "<h3>Media: " + cal.mean() + "</h3>"
                + "<h3>Desviación estándar: " + cal.stddev() + "</h3>"
                + "</body>"
                + "</html>";
        return response;
    }

    /**
     * Lee el puerto predeterminado según lo especificado por la variable PORT
     * @return El puerto donde se desplegará la aplicación
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
