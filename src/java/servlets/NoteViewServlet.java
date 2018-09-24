package servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import models.*;

/**
 *
 * @author 743953
 */
public class NoteViewServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String noteTitle;
        String noteContent;
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        BufferedReader read = new BufferedReader(new FileReader(new File(path)));
        
        noteTitle = read.readLine();
        noteContent = read.readLine();
        request.setAttribute("title", noteTitle);
        request.setAttribute("content", noteContent);
        
        
        Note note = new Note();
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }

}
