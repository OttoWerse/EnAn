package de.tbh.justnoteit.repository;

import java.util.ArrayList;
import java.util.List;

import de.thb.justnoteit.entity.Note;
import de.thb.justnoteit.entity.Notebook;

public class NotebookDirectoryDA {
	// Attributes start

	private List<Notebook> notebooks;

	// Attributes end

	// Constructors start

	public NotebookDirectoryDA() {
		notebooks = new ArrayList<Notebook>();
		List<Note> notes = new ArrayList<Note>();
		notes.add(new Note(1L, "Aufräumen", "", false));
		notes.add(new Note(2L, "Vorlesung vorbereiten", "", false));
		notes.add(new Note(3L, "Einkaufen", "Kaffee", false));

		Notebook nb = new Notebook(1L, "Meine Aufgaben", "", notes);
		notebooks.add(nb);

		notes = new ArrayList<Note>();
		notes.add(new Note(1L, "Mineralwasser", "", false));
		notes.add(new Note(2L, "Pizza", "", false));
		notes.add(new Note(3L, "Kaffee", "", false));

		nb = new Notebook(2L, "Einkaufsliste", "", notes);
		notebooks.add(nb);
	}

	// Constructors end

	// Methods start

	public List<Notebook> findAll() {
		return notebooks;
	}

	public Notebook findById(long id) {
		Notebook returnNotebook = null;

		for (Notebook notebook : this.notebooks) {
			if (notebook.getId() == id) {
				returnNotebook = notebook;
			}
		}

		return returnNotebook;
	}

	public List<Notebook> findByTitle(String title) {
		List<Notebook> retNotebooks = new ArrayList<>();

		for (Notebook notebook : this.notebooks) {
			if (notebook.getName().equals(title)) {
				retNotebooks.add(notebook);
			}
		}

		return retNotebooks;
	}

	// Methods end
}