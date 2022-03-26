package de.stylextv.haskal.game.serialize;

import java.util.HashMap;

public class Serializer {
	
	public static final Serializer PIECE_COLOR = new Serializer(2);
	
	public static final Serializer PIECE_TYPE = new Serializer(3);
	
	public static final Serializer PIECE = new Serializer(PIECE_COLOR, PIECE_TYPE);
	
	private int length;
	
	private HashMap<Serializer, Integer> offsets = new HashMap<>();
	
	public Serializer(Serializer... serializers) {
		for(Serializer s : serializers) {
			
			addComponent(s);
		}
	}
	
	public Serializer(int length) {
		this.length = length;
	}
	
	private void addComponent(Serializer s) {
		offsets.put(s, length);
		
		length += s.getLength();
	}
	
	public int getComponent(int object, Serializer s) {
		
	}
	
	public int setComponent(int object, Serializer s, int value) {
		int offset = getOffset(s);
		
		value 
	}
	
	private int getOffset(Serializer s) {
		return offsets.get(s);
	}
	
	public int getLength() {
		return length;
	}
	
}
