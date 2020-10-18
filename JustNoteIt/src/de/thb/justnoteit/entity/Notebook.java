package de.thb.justnoteit.entity;

import java.util.List;

public class Notebook {

	// Attributes start

	long id;
	String name;
	String description;
	String cover;
	List<Note> notes;

	// Attributes end

	// Constructors start

	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param published
	 * @param cover
	 * @param notes
	 */
	public Notebook(long id, String name, String description, List<Note> notes) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.notes = notes;
	}

	// Constructors end

	// Methods start

	public int getNumberOfNotes() {
		return notes.size();
	}

	public Note getNote(int nr) {
		if (nr < this.getNumberOfNotes()) {
			return notes.get(nr);			
		}
		return null;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the cover
	 */
	public String getCover() {
		return cover;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param cover the cover to set
	 */
	public void setCover(String cover) {
		this.cover = cover;
	}

	// Methods end

}
