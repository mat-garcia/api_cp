package br.com.hdnit.lotus.domain.entity.enums;

public enum MealTypeEnum {

	_None("None", 0), _Breakfast("Breakfast", 1), _HalfBoard("HalfBoard", 2), _FullBoard("FullBoard", 3),
	_AllInclusive("AllInclusive", 4), _Unspecified("Unspecified", 5);

	private String label;
	private Integer id;

	MealTypeEnum(String label, Integer id) {
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

	public static MealTypeEnum getByID(Integer id) {
		MealTypeEnum result = null;
		for (MealTypeEnum enum1 : MealTypeEnum.values()) {
			if (enum1.getId().intValue() == id.intValue()) {
				result = enum1;
				break;
			}
		}
		return result;
	}

}
