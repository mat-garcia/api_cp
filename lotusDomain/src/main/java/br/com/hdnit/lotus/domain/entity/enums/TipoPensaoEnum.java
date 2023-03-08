
package br.com.hdnit.lotus.domain.entity.enums;

public enum TipoPensaoEnum {
	Unspecified("Unspecified", 0), AllInclusive("AllInclusive", 1), FullBoard("FullBoard", 10), HalfBoard("HalfBoard",
			12), RoomOnly("RoomOnly", 14), Breakfast("Breakfast", 19),None("None", 21), OUTROS("OUTROS", 20);

	private String label;
	private Integer id;

	TipoPensaoEnum(String label, Integer id) {
		this.label = label;
		this.id = id;

	}

	public String getLabel() {
		return id + "- " + label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public static TipoPensaoEnum getByID(Integer id) {
		TipoPensaoEnum result = null;
		for (TipoPensaoEnum enum1 : TipoPensaoEnum.values()) {
			if (enum1.getId().intValue() == id.intValue()) {
				result = enum1;
				break;
			}
		}
	 return result;
	}

}
