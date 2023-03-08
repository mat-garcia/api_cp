package br.com.hdnit.lotus.domain.entity.enums;

public enum GrupoPermissaoEnum {
       ECOMMERCE(new Integer(1), "E-COMMERCE"), ADMINISTRACAO(new Integer(2), "ADMINISTRAÇÃO"), PEDIDOS(
                        new Integer(3), "PEDIDOS"),FINANCEIRO(new Integer(4), "FINANCEIRO"),ESTOQUE(new Integer(5), "ESTOQUE"), LAUDOS(new Integer(6), "LAUDOS");
        
        private Integer id;
        private String label;

        private GrupoPermissaoEnum(Integer id, String label) {
            this.setId(id);
            this.setLabel(label);
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getId() {
            return id;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }
}
