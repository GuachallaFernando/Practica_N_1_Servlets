
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RespCSV", urlPatterns = {"/RespCSV"})
public class RespCSV extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType ("aplication/csv");
        response.setHeader ("Contenty-Disposition","attachment;filename=archivo.csv");
        PrintWriter out = response.getWriter();
        try{
            out.println("id;tnombre;apellidos;edad");
            out.println("1;Juan;Guido;21");
            out.println("2;Abel;Fernandez;18");
            out.println("3;Fernando;Guachalla;30");
        }finally{
            out.close();
        }
    }



}
