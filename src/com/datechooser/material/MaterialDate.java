package com.datechooser.material;

import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextField;

import com.datechooser.language.Language;

public class MaterialDate extends JPanel {

	JTextField txt;

	DateChooser ch;

	Language language;

	public MaterialDate(Language language) {

		this.language = language;

		txt = new JTextField("");

		add(txt);

		ch = new DateChooser(this.language);

		ch.setTextField(txt);

		ch.toDay();

	}

	@Override
	public void setFont(Font font) {
		try {
			txt.setFont(font);
		} catch (Exception e) {
		}
	}

}
