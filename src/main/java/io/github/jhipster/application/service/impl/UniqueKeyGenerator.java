package io.github.jhipster.application.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class UniqueKeyGenerator {


static int getuniquekey() {
	Date date = new Date();
    String strDateFormat = "ddmmhhmmss";
    DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
    String formattedDate= dateFormat.format(date);
	return Integer.parseInt(formattedDate);
}
}
