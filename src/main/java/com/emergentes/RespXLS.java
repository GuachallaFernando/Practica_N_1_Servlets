
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Virtual_7
 */
@WebServlet(name = "RespXLS", urlPatterns = {"/RespXLS"})
public class RespXLS extends HttpServlet {

  

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("aplication/vn.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename=archivo.xls");
        PrintWriter out = response.getWriter();
        try{
            out.println("Respuesta Generada desde Exel");
            out.println("Holo 78584236");
            out.println("1 5");
            out.println("456723.1");
            out.println("·Prueva nª 1");
        }finally{
            out.close();
        }
    }




}
