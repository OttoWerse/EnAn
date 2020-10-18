package de.thb.justnoteit.manager;

import java.util.List;

import de.thb.justnoteit.entity.Notebook;
import de.thb.justnoteit.repository.NotebookDirectoryDA;

public class DeskManager {
	
	// Attributes start
	
	private NotebookDirectoryDA source;

	// Attributes end

	// Constructors start
	
	public DeskManager() {
		super();
		source = new NotebookDirectoryDA();
	}

	// Constructors end

	// Methods start

	public Notebook getNotebook(long id) {
		return source.findById(id);
	}
	
	public List<Notebook> getAllNotebooks() {
		return source.findAll();
	}
	
	public void addNote() {
		//TODO: Implement
	}
	
	public void toggleStatus() {
		//TODO: Implement
	}

	// Methods end

}