package com.knoldus.builder;

import java.util.ArrayList;
import java.util.List;
import com.knoldus.message.Field;
import com.knoldus.message.Message;
import com.knoldus.message.Payload;
import com.knoldus.message.Schema;

public class MessageBuilder {

	public static Message build() {
		
		Message message = new Message();

		Schema schema = new Schema();
		schema.setType("struct");
		schema.setOptional(false);
		schema.setName("net.superbid.SysRec");

		List<Field> fields = new ArrayList<Field>();
		fields.add(new Field("firstName", "string", false));
		fields.add(new Field("lastName", "string", false));

		schema.setFields(fields);

		Payload payload = new Payload();
		payload.setFirstName("Carlos");
		payload.setLastName("Maciel");

		message.setSchema(schema);
		message.setPayload(payload);

		return message;

	}

}
