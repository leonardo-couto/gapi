package com.github.feroult.gapi;

public enum BatchOptions {

	SHRINK;

	public boolean on(BatchOptions[] options) {
		for (int i = 0; i < options.length; i++) {
			if (options[i].equals(this)) {
				return true;
			}
		}

		return false;
	}

}
