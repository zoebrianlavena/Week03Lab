package servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import models.*;

/**
 *
 * @author 743953
 */
public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader read = new BufferedReader(new FileReader(new File(path)));
        String noteTitle = read.readLine();
        String noteContent = read.readLine();
        Note note = new Note(noteTitle, noteContent);

        request.setAttribute("Note", note);

//        String param = request.getParameter("edit");
//        request.setAttribute("testparam", param);
        String editTitle = request.getParameter("title");
        String editContent = request.getParameter("content");

        if (editTitle != null && editContent != null) {
            request.setAttribute("title", editTitle);
            request.setAttribute("content", editContent);
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
            return;
        }
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String setTitle = request.getParameter("editTitle");
        String setContent = request.getParameter("editContent");
        
        if(setTitle == null || setTitle.equals("") || setContent == null || setContent.equals("")){
            request.setAttribute("error", "novalue");
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
            return;
        }
        
        Note note = new Note(setTitle,setContent);
        request.setAttribute("Note",note);
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        PrintWriter print = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        
        print.println(setTitle);
        print.println(setContent);
        print.close();
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }

}
