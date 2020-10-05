package de.thb.justnoteit.entity;

public class Note {

	// Attributes start

	long id;
	String title;
	String description;
	boolean done;

	// Attributes end

	// Constructors start

	/**
	 * @param id
	 * @param title
	 * @param description
	 * @param done
	 */
	public Note(long id, String title, String description, boolean done) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.done = done;
	}

	// Constructors end

	// Methods start

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the done
	 */
	public boolean isDone() {
		return done;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param done the done to set
	 */
	public void setDone(boolean done) {
		this.done = done;
	}

	// Methods end

}
