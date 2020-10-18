package de.thb.justnoteit.controller;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.thb.justnoteit.entity.Notebook;
import de.thb.justnoteit.manager.DeskManager;

@WebServlet("/notebooks")
public class NotebookController extends HttpServlet {
	// Attributes start

	private DeskManager deskManager;

	// Attributes end

	// Constructors start

	public NotebookController() {
		super();
		deskManager = new DeskManager();
	}

	// Constructors end

	// Methods start

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String parameter = request.getParameter("id");
		if (parameter != null) {
			Notebook notebook = deskManager.getNotebook(Integer.parseInt(parameter));
			if (notebook != null) {
				response.getWriter().append("\r\n" + notebook.getName() + "\r\n");
				for (int i = 0; i < notebook.getNumberOfNotes(); i++) {
					response.getWriter().append("\r\n" + notebook.getNote(i).getTitle() + "\r\n");
				}
			} else {
				response.getWriter().append("\r\nNotebook nicht gefunden!\r\n");
			}
		} else {
			response.getWriter().append("\r\nMeine Notizbücher:\r\n");

			List<Notebook> notebookList = deskManager.getAllNotebooks();
			for (Notebook notebook : notebookList) {
				response.getWriter().append(notebook.getId() + " - " + notebook.getName() + " \r\n");
			}
		}
	}

	// Methods end
}